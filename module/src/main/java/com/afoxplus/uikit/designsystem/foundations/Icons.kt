package com.afoxplus.uikit.designsystem.foundations


import androidx.annotation.DrawableRes
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import com.afoxplus.uikit.R

val LocalUIKitIconTheme: ProvidableCompositionLocal<UIKitIcon> = staticCompositionLocalOf {
    error("No IconTheme provided")
}

@Immutable
abstract class UIKitIcon {
    abstract val icon_whatsapp_outline: Icon
    abstract val icon_pin_location_outline: Icon
    abstract val icon_calendar_small_outline: Icon
    abstract val icon_minus: Icon
    abstract val icon_plus: Icon
    abstract val icon_printer_outline: Icon
    abstract val icon_scan_outline: Icon
    abstract val icon_trash_outline: Icon


    @JvmInline
    value class Icon(@DrawableRes val drawableRes: Int)
}

val UIKitIconTheme: UIKitIcon = object : UIKitIcon() {
    override val icon_whatsapp_outline: Icon = Icon(drawableRes = R.drawable.icon_whatsapp_outline)
    override val icon_pin_location_outline: Icon = Icon(drawableRes = R.drawable.icon_pin_location_outline)
    override val icon_calendar_small_outline: Icon = Icon(drawableRes = R.drawable.icon_calendar_small_outline)
    override val icon_minus: Icon = Icon(drawableRes = R.drawable.icon_minus)
    override val icon_plus: Icon = Icon(drawableRes = R.drawable.icon_plus)
    override val icon_printer_outline: Icon = Icon(drawableRes = R.drawable.icon_printer_outline)
    override val icon_scan_outline: Icon = Icon(drawableRes = R.drawable.icon_scan_outline)
    override val icon_trash_outline: Icon = Icon(drawableRes = R.drawable.icon_trash_outline)
}