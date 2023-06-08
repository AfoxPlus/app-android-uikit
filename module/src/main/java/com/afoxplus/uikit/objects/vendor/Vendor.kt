package com.afoxplus.uikit.objects.vendor

data class Vendor(
    val tableId: String,
    val restaurantId: String,
    var additionalInfo: Map<String, Any> = mutableMapOf()
)