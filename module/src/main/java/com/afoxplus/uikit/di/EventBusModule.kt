package com.afoxplus.uikit.di

import com.afoxplus.uikit.bus.EventBusListener
import com.afoxplus.uikit.bus.EventBusListenerImpl
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
    fun bindEventBus(): EventBusListener = EventBusListenerImpl()
}