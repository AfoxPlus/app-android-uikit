package com.afoxplus.uikit.designsystem.extensions

import com.afoxplus.uikit.designsystem.foundations.UIKitIcon.Icon
import com.afoxplus.uikit.designsystem.foundations.UIKitIconTheme

enum class UIKitIconThemeExtension(
    val iconName: String,
    val icon: Icon,
    val filled: Boolean
) {
    icon_whatsapp_outline("icon_whatsapp_outline", UIKitIconTheme.icon_whatsapp_outline, false),
    icon_pin_location_outline("icon_pin_location_outline", UIKitIconTheme.icon_pin_location_outline, false),
    icon_calendar_small_outline("icon_calendar_small_outline",UIKitIconTheme.icon_calendar_small_outline, false),
    icon_minus("icon_minus",UIKitIconTheme.icon_minus, true),
    icon_plus("icon_plus",UIKitIconTheme.icon_plus, true),
    icon_printer_outline("icon_printer_outline",UIKitIconTheme.icon_printer_outline, false),
    icon_scan_outline("icon_scan_outline",UIKitIconTheme.icon_scan_outline, false),
    icon_trash_outline("icon_trash_outline",UIKitIconTheme.icon_trash_outline, false)
}