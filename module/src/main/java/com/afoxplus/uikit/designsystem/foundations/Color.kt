package com.afoxplus.uikit.designsystem.foundations

import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Dark01 = Color(0xFF120329)
val Dark02 = Color(0xFF141938)
val Dark03 = Color(0xFF302F3C)
val Dark04 = Color(0xFF474749)
val Dark05 = Color(0xFF474747)

val Light01 = Color(0xFFFFFFFF)
val Light02 = Color(0xFFFAFBFF)
val Light03 = Color(0xFFF1F1F1)
val Light04 = Color(0xFFFCF8F5)
val Light05 = Color(0xFFFAFAFA)
val Light06 = Color(0xFFF2F2F2)

val Orange01 = Color(0xFFF64107)
val Red01 = Color(0xFFF10450)
val Green01 = Color(0xFF0AEA48)
val Green02 = Color(0xFF2CB742)
val Pink01 = Color(0xFFEF6A62)
val Pink02 = Color(0xFFFFC8BD)
val Gray01 = Color(0xFFC7C7C7)

val Blue01 = Color(0xFF1F8AEC)
val Blue02 = Color(0xFF5DA9EF)

@Immutable
data class UIKitColors(
    val default: Color = Color.Unspecified,
    val orange01: Color = Orange01,

    val dark01: Color = Dark01,
    val dark02: Color = Dark02,
    val dark03: Color = Dark03,
    val dark04: Color = Dark04,
    val dark05: Color = Dark05,

    val light01: Color = Light01,
    val light02: Color = Light02,
    val light03: Color = Light03,
    val light04: Color = Light04,
    val light05: Color = Light05,
    val light06: Color = Light06,

    val red01: Color = Red01,

    val green01: Color = Green01,
    val green02: Color = Green02,

    val pink01: Color = Pink01,
    val pink02: Color = Pink02,

    val gray01: Color = Gray01,

    val blue01: Color = Blue01,
    val blue02: Color = Blue02
)

internal val DarkColorScheme = darkColorScheme(
    primary = Orange01,
    secondary = Dark01,
    background = Light01,
    surface = Light01
)
internal val LocalUIKitColors = staticCompositionLocalOf { UIKitColors() }