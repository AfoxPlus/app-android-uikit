package com.afoxplus.uikit.bus

import kotlinx.coroutines.flow.Flow

interface UIKitEventBusWrapper {
    suspend fun send(event: UIKitEventBus)
    fun getBusEventFlow(): Flow<UIKitEventBus>
}