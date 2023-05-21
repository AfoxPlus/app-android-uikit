package com.afoxplus.uikit.di

import com.afoxplus.uikit.bus.BusEventHandler
import com.afoxplus.uikit.bus.BusEventHandlerImpl
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
    fun bindEventBus(): BusEventHandler = BusEventHandlerImpl()
}