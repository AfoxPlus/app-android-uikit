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
    
    @JvmInline
    value class Icon(@DrawableRes val drawableRes: Int)
}

val UIKitIconTheme: UIKitIcon = object : UIKitIcon() {
    override val icon_whatsapp_outline: Icon = Icon(drawableRes = R.drawable.icon_whatsapp_outline)
    override val icon_pin_location_outline: Icon =
        Icon(drawableRes = R.drawable.icon_pin_location_outline)

}