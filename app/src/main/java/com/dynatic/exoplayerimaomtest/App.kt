package com.dynatic.exoplayerimaomtest

import android.app.Application
import android.webkit.WebView
import com.facebook.stetho.Stetho

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        Stetho.initializeWithDefaults(this);
        WebView.setWebContentsDebuggingEnabled(true)
    }
}