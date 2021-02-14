package com.tinkooladik.mycv.di

import com.tinkooladik.mycv.data.roles.RolesRepository
import com.tinkooladik.mycv.domain.AppDispatchers
import com.tinkooladik.mycv.domain.role.RoleDataSource
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class Bindings {

    @Singleton
    @Binds
    abstract fun provideRolesDataSource(source: RolesRepository): RoleDataSource
}

@InstallIn(SingletonComponent::class)
@Module
object Providers {

    @Provides
    fun provideDispatchers() = AppDispatchers(
        io = Dispatchers.IO, computation = Dispatchers.Default, main = Dispatchers.Main
    )
}