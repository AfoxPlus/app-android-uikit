package com.afoxplus.uikit.objects.vendor

data class Vendor(
    val tableId: String,
    val restaurantId: String,
    val additionalInfo: MutableMap<String, Any> = mutableMapOf()
)