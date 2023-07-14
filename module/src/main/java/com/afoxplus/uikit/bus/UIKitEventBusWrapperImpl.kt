package com.afoxplus.uikit.bus

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import javax.inject.Inject

internal class UIKitEventBusWrapperImpl @Inject constructor() : UIKitEventBusWrapper {
    private val mOrderEvent: MutableSharedFlow<UIKitEventBus> by lazy { MutableSharedFlow() }

    override suspend fun send(event: UIKitEventBus) {
        mOrderEvent.emit(event)
    }

    override fun getBusEventFlow(): Flow<UIKitEventBus> = mOrderEvent
}