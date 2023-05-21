package com.afoxplus.uikit.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@Module
@InstallIn(SingletonComponent::class)
internal abstract class UIKitDispatcherModule {
    @Binds
    abstract fun bindUIKitCoroutineDispatcher(impl: UIKitCoroutineDispatcherImpl): UIKitCoroutineDispatcher
}

interface UIKitCoroutineDispatcher {
    fun getMainDispatcher(): CoroutineDispatcher
    fun getIODispatcher(): CoroutineDispatcher
    fun getDefaultDispatcher(): CoroutineDispatcher
}

internal class UIKitCoroutineDispatcherImpl @Inject constructor() : UIKitCoroutineDispatcher {
    override fun getMainDispatcher(): CoroutineDispatcher = Dispatchers.Main
    override fun getIODispatcher(): CoroutineDispatcher = Dispatchers.IO
    override fun getDefaultDispatcher(): CoroutineDispatcher = Dispatchers.Default
}