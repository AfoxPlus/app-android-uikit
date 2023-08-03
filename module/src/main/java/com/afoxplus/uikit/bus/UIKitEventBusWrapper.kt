package com.afoxplus.uikit.bus

import kotlinx.coroutines.flow.SharedFlow

interface UIKitEventBusWrapper {
    suspend fun send(event: UIKitEventBus)
    fun listen(): SharedFlow<UIKitEventBus>
}