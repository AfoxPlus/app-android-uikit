package com.afoxplus.uikit.designsystem.extensions

import com.afoxplus.uikit.designsystem.foundations.UIKitIcon.Icon
import com.afoxplus.uikit.designsystem.foundations.UIKitIconTheme

enum class UIKitIconThemeExtension(
    val iconName: String,
    val icon: Icon,
    val filled: Boolean
) {
    icon_whatsapp_outline("icon_whatsapp_outline", UIKitIconTheme.icon_whatsapp_outline, false),
    icon_pin_location_outline(
        "icon_pin_location_outline",
        UIKitIconTheme.icon_pin_location_outline,
        false
    )
}