package com.tinkooladik.mycv.di

import android.os.StrictMode
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import timber.log.Timber

@InstallIn(SingletonComponent::class)
@Module
object BuildTypeModule {

    @Provides
    fun provideThreadPolicy(): StrictMode.ThreadPolicy {
        return StrictMode.ThreadPolicy.LAX
    }

    @Provides
    fun provideVmPolicy(): StrictMode.VmPolicy {
        return StrictMode.VmPolicy.LAX
    }

    @Provides
    fun provideTree(): Timber.Tree {
        return Timber.DebugTree()
    }
}