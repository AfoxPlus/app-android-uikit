package com.afoxplus.uikit.bus

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import javax.inject.Inject

internal class BusEventHandlerImpl @Inject constructor() : BusEventHandler {
    private val mOrderEvent: MutableSharedFlow<BusEvent> by lazy { MutableSharedFlow() }

    override suspend fun send(event: BusEvent) {
        mOrderEvent.emit(event)
    }

    override fun getBusEventFlow(): Flow<BusEvent> = mOrderEvent
}