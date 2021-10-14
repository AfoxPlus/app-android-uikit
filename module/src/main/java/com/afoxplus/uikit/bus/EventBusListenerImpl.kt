package com.afoxplus.uikit.bus

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import javax.inject.Inject

internal class EventBusListenerImpl @Inject constructor() : EventBusListener {
    private val mOrderEvent: MutableSharedFlow<EventBus> = MutableSharedFlow(0)

    override suspend fun send(event: EventBus) {
        mOrderEvent.emit(event)
    }

    override fun subscribe(): Flow<EventBus> = mOrderEvent
}