package com.afoxplus.uikit.bus

import kotlinx.coroutines.flow.Flow

interface BusEventHandler {
    suspend fun send(event: BusEvent)
    fun getBusEventFlow(): Flow<BusEvent>
}