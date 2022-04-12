package com.afoxplus.uikit.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class UIKitMainDispatcher

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class UIKitIODispatcher

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class UIKitDefaultDispatcher

@Module
@InstallIn(SingletonComponent::class)
class UIKitDispatcherModule {

    @UIKitMainDispatcher
    @Provides
    fun providesMainDispatcher(): CoroutineDispatcher = Dispatchers.Main

    @UIKitIODispatcher
    @Provides
    fun providesIODispatcher(): CoroutineDispatcher = Dispatchers.IO

    @UIKitDefaultDispatcher
    @Provides
    fun providesDefaultDispatcher(): CoroutineDispatcher = Dispatchers.Default
}

