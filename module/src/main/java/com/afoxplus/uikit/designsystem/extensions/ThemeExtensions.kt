package com.afoxplus.uikit.designsystem.extensions

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