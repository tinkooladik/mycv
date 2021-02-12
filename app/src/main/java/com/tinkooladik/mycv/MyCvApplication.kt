package com.tinkooladik.mycv

import android.app.Application
import android.os.StrictMode
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import javax.inject.Inject

@HiltAndroidApp
class MyCvApplication : Application() {

    @Inject
    lateinit var tree: Timber.Tree

    @Inject
    lateinit var threadPolicy: StrictMode.ThreadPolicy

    @Inject
    lateinit var vmPolicy: StrictMode.VmPolicy

    override fun onCreate() {
        super.onCreate()

        Timber.plant(tree)

        StrictMode.setThreadPolicy(threadPolicy)
        StrictMode.setVmPolicy(vmPolicy)
    }
}