package com.afoxplus.uikit.bus

import kotlinx.coroutines.flow.Flow

interface EventBusListener {
    suspend fun send(event: EventBus)
    fun subscribe(): Flow<EventBus>
}