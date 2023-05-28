package com.afoxplus.uikit.di

import com.afoxplus.uikit.bus.UIKitEventBusWrapper
import com.afoxplus.uikit.bus.UIKitEventBusWrapperImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class EventBusModule {
    @Provides
    @Singleton
    fun bindEventBus(): UIKitEventBusWrapper = UIKitEventBusWrapperImpl()
}