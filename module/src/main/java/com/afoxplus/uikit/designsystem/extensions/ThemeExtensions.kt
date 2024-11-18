package com.afoxplus.uikit.designsystem.extensions

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import androidx.core.content.ContextCompat
import com.afoxplus.uikit.designsystem.foundations.UIKitIcon

private val iconCache by lazy {
    UIKitIconThemeExtension.values().groupBy {
        it.iconName
    }.toSortedMap()
}

fun getUIKitIcon(name: String, filled: Boolean = true): UIKitIcon.Icon? {
    val iconFamily = iconCache[name]
    return iconFamily?.firstOrNull {
        it.filled == filled
    }?.icon ?: iconFamily?.firstOrNull()?.icon
}

fun UIKitIcon.Icon.getBitmapFromVectorDrawable(context: Context): Bitmap {
    val drawable = ContextCompat.getDrawable(context, this.drawableRes)
        ?: throw IllegalArgumentException("Drawable not found")

    val bitmap = Bitmap.createBitmap(
        drawable.intrinsicWidth,
        drawable.intrinsicHeight,
        Bitmap.Config.ARGB_8888
    )
    val canvas = Canvas(bitmap)
    drawable.setBounds(0, 0, canvas.width, canvas.height)
    drawable.draw(canvas)
    return bitmap
}