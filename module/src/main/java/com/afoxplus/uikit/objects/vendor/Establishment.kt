package com.afoxplus.uikit.objects.vendor

import com.afoxplus.uikit.designsystem.foundations.IconTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitIconTheme

data class Establishment(
    val imageLandscape: String,
    val imagePortrait: String,
    val name: String,
    val primaryType: String,
    val description: String,
    val hasSubscription: Boolean,
    val subscriptionImage: IconTheme.Icon = UIKitIconTheme.icon_calendar_small_outline,
    val isOpen: Boolean,
    val rating: Float,
    val addressIcon: IconTheme.Icon = UIKitIconTheme.icon_location_outline,
    val addressDescription: String,
    val phoneIcon: IconTheme.Icon = UIKitIconTheme.icon_whatsapp_outline,
    val phoneDescription: String,
) {
    fun validateIsOpen(): String {
        return if (isOpen)
            "Abierto"
        else
            "Cerrado"
    }
}