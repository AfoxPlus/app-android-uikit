package com.afoxplus.uikit.designsystem.foundations

import androidx.compose.material3.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.afoxplus.uikit.R

internal val Mulish = FontFamily(
    Font(R.font.mulish_bold, FontWeight.Bold),
    Font(R.font.mulish_extra_bold, FontWeight.ExtraBold),
    Font(R.font.mulish_light, FontWeight.Light),
    Font(R.font.mulish_medium, FontWeight.Medium),
    Font(R.font.mulish_regular, FontWeight.Normal),
    Font(R.font.mulish_semi_bold, FontWeight.SemiBold)
)

internal val Typography = defaultTypography()

@Immutable
data class UIKitTypography(
    val header01: TextStyle = defaultTextStyle(
        fontSize = 32.sp,
        fontWeight = FontWeight.Medium
    ),

    val header01SemiBold: TextStyle = defaultTextStyle(
        fontSize = 32.sp,
        fontWeight = FontWeight.SemiBold
    ),

    val header01Bold: TextStyle = defaultTextStyle(
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
    ),

    val header02: TextStyle = defaultTextStyle(
        fontSize = 24.sp,
        fontWeight = FontWeight.Medium
    ),

    val header02SemiBold: TextStyle = defaultTextStyle(
        fontSize = 24.sp,
        fontWeight = FontWeight.SemiBold
    ),

    val header02Bold: TextStyle = defaultTextStyle(
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold
    ),

    val header03: TextStyle = defaultTextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.Medium
    ),

    val header03SemiBold: TextStyle = defaultTextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold
    ),

    val header03Bold: TextStyle = defaultTextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
    ),

    val header04: TextStyle = defaultTextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.Medium
    ),

    val header04SemiBold: TextStyle = defaultTextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.SemiBold
    ),

    val header04Bold: TextStyle = defaultTextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
    ),

    val header05: TextStyle = defaultTextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium
    ),

    val header05SemiBold: TextStyle = defaultTextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.SemiBold
    ),

    val header05Bold: TextStyle = defaultTextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold
    ),

    val paragraph01: TextStyle = defaultTextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium
    ),

    val paragraph01SemiBold: TextStyle = defaultTextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold
    ),

    val paragraph01Bold: TextStyle = defaultTextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold
    ),

    val paragraph02: TextStyle = defaultTextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Medium
    ),

    val paragraph02SemiBold: TextStyle = defaultTextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.SemiBold
    ),

    val paragraph02Bold: TextStyle = defaultTextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold
    ),

    val title01: TextStyle = defaultTextStyle(
        fontSize = 64.sp,
        fontWeight = FontWeight.SemiBold
    ),

    val title02: TextStyle = defaultTextStyle(
        fontSize = 48.sp,
        fontWeight = FontWeight.SemiBold
    ),

    val title03: TextStyle = defaultTextStyle(
        fontSize = 40.sp,
        fontWeight = FontWeight.SemiBold
    ),

    val title04: TextStyle = defaultTextStyle(
        fontSize = 36.sp,
        fontWeight = FontWeight.SemiBold
    )
)

private fun defaultTypography() = with(UIKitTypography()) {
    Typography(
        displayLarge = title01,
        displayMedium = title02,
        displaySmall = title03,
        headlineLarge = title01,
        headlineMedium = header01,
        headlineSmall = header02,
        titleLarge = header03,
        titleMedium = header04,
        titleSmall = header05,
        bodyLarge = header03SemiBold,
        bodyMedium = header04SemiBold,
        bodySmall = header05SemiBold,
        labelLarge = paragraph01,
        labelMedium = paragraph02SemiBold,
        labelSmall = paragraph02Bold,
    )
}


private fun defaultTextStyle(
    fontSize: TextUnit,
    fontWeight: FontWeight,
    letterSpacing: TextUnit = LetterSpacing,
    color: Color = BlueGray900
) = TextStyle(
    fontSize = fontSize,
    fontWeight = fontWeight,
    fontFamily = Mulish,
    letterSpacing = letterSpacing,
    color = color
)

internal val LetterSpacing = (0.12f).sp

internal val LocalUIKitTypography = staticCompositionLocalOf { UIKitTypography() }