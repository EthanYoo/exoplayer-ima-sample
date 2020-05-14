package com.dynatic.exoplayerimaomtest

import android.content.Context
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import com.google.android.exoplayer2.upstream.cache.CacheDataSource
import com.google.android.exoplayer2.upstream.cache.CacheDataSourceFactory
import com.google.android.exoplayer2.upstream.cache.LeastRecentlyUsedCacheEvictor
import com.google.android.exoplayer2.upstream.cache.SimpleCache
import com.google.android.exoplayer2.util.Util
import java.io.File

/**
 * Video Ad 의 External format(MP4,...)의 캐시를 위한 Util
 * {Locker library UILCustomDiskCache, UIL library StorageUtils 참고}
 */

object VideoCacheUtils {

    private const val VIDEO_CACHE_DIR = "bs-videos"

    // 주로 사용할 15-30초 길이의 비디오는 10MB를 넘지 않는 수준이므로 약 5개정도 캐시 가능.
    private const val MAX_CACHE_SIZE = 50 * 1024 * 1024

    @Volatile
    private var simpleCache: SimpleCache? = null

    /**
     * @return CacheDataSourceFactory using LRU Simple cache.
     */
    fun makeCacheDataSourceFactory(context: Context): CacheDataSourceFactory {
        val applicationContext = context.applicationContext

        val bandwidthMeter = DefaultBandwidthMeter.Builder(applicationContext).build()
        val userAgent = Util.getUserAgent(applicationContext, applicationContext.packageName)
        val defaultDataSourceFactory =
            DefaultDataSourceFactory(applicationContext, userAgent, bandwidthMeter)

        if (simpleCache == null) {
            synchronized(VideoCacheUtils::class.java) {
                if (simpleCache == null) {
                    val evictor = LeastRecentlyUsedCacheEvictor(MAX_CACHE_SIZE.toLong())
                    simpleCache = SimpleCache(createDiskCacheDir(applicationContext, true), evictor)
                }
            }
        }

        val flags =
            CacheDataSource.FLAG_BLOCK_ON_CACHE or CacheDataSource.FLAG_IGNORE_CACHE_ON_ERROR
        return CacheDataSourceFactory(simpleCache, defaultDataSourceFactory, flags)
    }

    private fun createDiskCacheDir(context: Context, preferExternal: Boolean): File {
        val cacheDir = getCacheDirectory(context, VIDEO_CACHE_DIR, preferExternal)
        if (!cacheDir!!.exists()) {
            cacheDir.mkdir()
        }
        return cacheDir
    }

    /**
     * Glide 이미지 라이브러리 ExternalPreferredCacheDiskCacheFactory getCacheDirectory 참조
     *
     * @see [Code Reference](https://github.com/bumptech/glide/blob/master/library/src/main/java/com/bumptech/glide/load/engine/cache/ExternalPreferredCacheDiskCacheFactory.java)
     */
    private fun getCacheDirectory(
        context: Context,
        diskCacheName: String?,
        preferExternal: Boolean
    ): File? {
        val internalCacheDirectory = getInternalCacheDirectory(context, diskCacheName)

        // Already used internal cache, so keep using that one,
        // thus avoiding using both external and internal with transient errors.
        if (null != internalCacheDirectory && internalCacheDirectory.exists()) {
            return internalCacheDirectory
        }

        if (!preferExternal) {
            return internalCacheDirectory
        }

        // Api 19 미만 기기에서는 null이 리턴되므로 따로 EXTERNAL_STORAGE 권한 체크할 필요 없음.
        val cacheDirectory = context.externalCacheDir

        // Shared storage is not available.
        if (cacheDirectory == null || !cacheDirectory.canWrite()) {
            return internalCacheDirectory
        }
        return if (diskCacheName != null) {
            File(cacheDirectory, diskCacheName)
        } else cacheDirectory
    }

    /**
     * Glide 이미지 라이브러리 ExternalPreferredCacheDiskCacheFactory getInternalCacheDirectory 참조
     *
     * @see [Code Reference](https://github.com/bumptech/glide/blob/master/library/src/main/java/com/bumptech/glide/load/engine/cache/ExternalPreferredCacheDiskCacheFactory.java)
     */
    private fun getInternalCacheDirectory(context: Context, diskCacheName: String?): File? {
        val cacheDirectory = context.cacheDir ?: return null
        return if (diskCacheName != null) {
            File(cacheDirectory, diskCacheName)
        } else cacheDirectory
    }
}
