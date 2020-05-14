package com.dynatic.exoplayerimaomtest

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.SurfaceView
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import com.google.android.exoplayer2.DefaultLoadControl
import com.google.android.exoplayer2.ExoPlaybackException
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.audio.AudioListener
import com.google.android.exoplayer2.ext.ima.ImaAdsLoader
import com.google.android.exoplayer2.source.MediaSource
import com.google.android.exoplayer2.source.ProgressiveMediaSource
import com.google.android.exoplayer2.source.TrackGroupArray
import com.google.android.exoplayer2.source.ads.AdsLoader
import com.google.android.exoplayer2.source.ads.AdsMediaSource
import com.google.android.exoplayer2.trackselection.TrackSelectionArray
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import com.google.android.exoplayer2.util.Util
import com.google.android.exoplayer2.video.VideoListener
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializePlayer()
        loadVideoFromTag(SampleData.yohanTag)
        btn.setOnClickListener {
            btn.visibility = View.GONE
            player.playWhenReady = true
        }
    }

    lateinit var context: Context
    lateinit var playerView: SurfaceView
    lateinit var player: SimpleExoPlayer
    lateinit var imaAdsLoader: ImaAdsLoader

    private fun initializePlayer() {
        playerView = SurfaceView(applicationContext).apply {
            id = ViewCompat.generateViewId()
        }
        rootContainer.addView(
            playerView,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
            )
        )

        // MIN_BUFFER_MS : play 되기 위해 필요한 최소 buffer 시간
        // MAX_BUFFER_MS : 최대 buffer 가능 시간
        player = SimpleExoPlayer.Builder(applicationContext)
            .setLoadControl(
                DefaultLoadControl.Builder()
                    .setBufferDurationsMs(
                        MIN_BUFFER_MS,
                        MAX_BUFFER_MS,
                        DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS,
                        DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS
                    )
                    .createDefaultLoadControl()
            )
            .build()
            .apply {
                addListener(object : Player.EventListener {
                    override fun onPlayerStateChanged(playWhenReady: Boolean, playbackState: Int) {
                        Log.d(
                            "YYH",
                            "onPlayerStateChanged(playWhenReady[$playWhenReady], playbackState[$playbackState])"
                        )
                    }

                    override fun onPlayerError(error: ExoPlaybackException) {
                        Log.d("YYH", "onPlayerError(error[$error])")
                    }

                    override fun onLoadingChanged(isLoading: Boolean) {
                        Log.d("YYH", "onLoadingChanged(error[$isLoading])")
                    }

                    override fun onIsPlayingChanged(isPlaying: Boolean) {
                        Log.d("YYH", "onIsPlayingChanged(error[$isPlaying])")
                    }

                    override fun onTracksChanged(
                        trackGroups: TrackGroupArray,
                        trackSelections: TrackSelectionArray
                    ) {
                        Log.d("YYH", "onTracksChanged(...)")
                    }
                })

                addAudioListener(object : AudioListener {
                    override fun onVolumeChanged(volume: Float) {
                        Log.d("YYH", "onVolumeChanged: volume[$volume]")
                    }
                })

                addVideoListener(object : VideoListener {
                    override fun onRenderedFirstFrame() {
                        Log.d("YYH", "onRenderedFirstFrame()")
                    }
                })

                setVideoSurfaceView(playerView)
            }
    }

    private fun loadVideoFromTag(tag: String) {
        player.prepare(buildMediaSource(tag))
    }


    private fun buildMediaSource(tag: String): MediaSource {

        val bandwidthMeter = DefaultBandwidthMeter.Builder(applicationContext).build()
        val userAgent = Util.getUserAgent(applicationContext, applicationContext.packageName)
        val dataSourceFactory =
            DefaultDataSourceFactory(applicationContext, userAgent, bandwidthMeter)

        imaAdsLoader = ImaAdsLoader.Builder(applicationContext).buildForAdsResponse(tag).apply {
            Log.d("YYH", "imaAdsLoader.build. player[$player]")
            setPlayer(player)
        }

        /**
         * 현재 Exoplayer의 ima extension module에는 광고만 재생하는 기능이 지원되지 않는다.
         * @see <a href="https://github.com/google/ExoPlayer/issues/3774"></a>
         * 따라서, 광고 재생 완료시 플레이할 컨텐츠 비디오(매우 짧은 검은색 화면 영상) 을 파일로 저장해두고 이 uri를 전달해준다.
         * 또한, AdsMediaSource 의 마지막 파라미터로 전달하는 ViewGroup 은 IMA SDK에서 만들어둔 UI(remain time,skip,CTA..)를 attach할 뷰를 전달하는데,
         * 이 UI는 customize가 불가해서 사용하지 않기로 함에 따라, 화면에 보여주지 않게 하기 위해 임의의 ViewGroup을 만들어 전달하도록 처리함.
         */
        val fadeoutVideoUrl =
            Uri.fromFile(File("//android_asset/buzz-exoplayer-videos/buzz-vast-fadeout.mp4"))
        val progressiveMediaSource =
            ProgressiveMediaSource.Factory(dataSourceFactory).createMediaSource(fadeoutVideoUrl)
        val cacheDataSourceFactory = VideoCacheUtils.makeCacheDataSourceFactory(applicationContext)
        val mediaSource =
            AdsMediaSource(progressiveMediaSource, cacheDataSourceFactory, imaAdsLoader,
                object : AdsLoader.AdViewProvider {
                    override fun getAdViewGroup(): ViewGroup {
                        return rootContainer
                    }

                    override fun getAdOverlayViews(): Array<View> {
                        return emptyArray()
                    }
                }
            )

        return mediaSource
    }

    companion object {
        const val MIN_BUFFER_MS = 5000
        const val MAX_BUFFER_MS = 10000
        const val PROGRESS_TICK_INTERVAL_MS = 100L
    }
}
