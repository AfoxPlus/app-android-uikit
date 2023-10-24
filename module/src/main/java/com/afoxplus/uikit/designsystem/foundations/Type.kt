package com.afoxplus.uikit.designsystem.foundations

import androidx.compose.material3.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
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
abstract class UIKitTypography {
    abstract val header01: TextStyle
    abstract val header01SemiBold: TextStyle
    abstract val header01Bold: TextStyle
    abstract val header02: TextStyle
    abstract val header02SemiBold: TextStyle
    abstract val header02Bold: TextStyle
    abstract val header03: TextStyle
    abstract val header03SemiBold: TextStyle
    abstract val header03Bold: TextStyle
    abstract val header04: TextStyle
    abstract val header04SemiBold: TextStyle
    abstract val header04Bold: TextStyle
    abstract val header05: TextStyle
    abstract val header05SemiBold: TextStyle
    abstract val header05Bold: TextStyle
    abstract val paragraph01: TextStyle
    abstract val paragraph01SemiBold: TextStyle
    abstract val paragraph01Bold: TextStyle
    abstract val paragraph02: TextStyle
    abstract val paragraph02SemiBold: TextStyle
    abstract val paragraph02Bold: TextStyle
    abstract val title01: TextStyle
    abstract val title02: TextStyle
    abstract val title03: TextStyle
    abstract val title04: TextStyle
}

val UIKitTypographyTheme = object : UIKitTypography() {
    override val header01: TextStyle = defaultTextStyle(
        fontSize = 32.sp,
        fontWeight = FontWeight.Medium
    )

    override val header01SemiBold: TextStyle = defaultTextStyle(
        fontSize = 32.sp,
        fontWeight = FontWeight.SemiBold
    )

    override val header01Bold: TextStyle = defaultTextStyle(
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
    )

    override val header02: TextStyle = defaultTextStyle(
        fontSize = 24.sp,
        fontWeight = FontWeight.Medium
    )

    override val header02SemiBold: TextStyle = defaultTextStyle(
        fontSize = 24.sp,
        fontWeight = FontWeight.SemiBold
    )

    override val header02Bold: TextStyle = defaultTextStyle(
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold
    )

    override val header03: TextStyle = defaultTextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.Medium
    )

    override val header03SemiBold: TextStyle = defaultTextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold
    )

    override val header03Bold: TextStyle = defaultTextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
    )

    override val header04: TextStyle = defaultTextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.Medium
    )

    override val header04SemiBold: TextStyle = defaultTextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.SemiBold
    )

    override val header04Bold: TextStyle = defaultTextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
    )

    override val header05: TextStyle = defaultTextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium
    )

    override val header05SemiBold: TextStyle = defaultTextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.SemiBold
    )

    override val header05Bold: TextStyle = defaultTextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold
    )

    override val paragraph01: TextStyle = defaultTextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium
    )

    override val paragraph01SemiBold: TextStyle = defaultTextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold
    )

    override val paragraph01Bold: TextStyle = defaultTextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold
    )

    override val paragraph02: TextStyle = defaultTextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Medium
    )

    override val paragraph02SemiBold: TextStyle = defaultTextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.SemiBold
    )

    override val paragraph02Bold: TextStyle = defaultTextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold
    )

    override val title01: TextStyle = defaultTextStyle(
        fontSize = 64.sp,
        fontWeight = FontWeight.SemiBold
    )

    override val title02: TextStyle = defaultTextStyle(
        fontSize = 48.sp,
        fontWeight = FontWeight.SemiBold
    )

    override val title03: TextStyle = defaultTextStyle(
        fontSize = 40.sp,
        fontWeight = FontWeight.SemiBold
    )

    override val title04: TextStyle = defaultTextStyle(
        fontSize = 36.sp,
        fontWeight = FontWeight.SemiBold
    )
}

private fun defaultTypography() = with(UIKitTypographyTheme) {
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

internal val LocalUIKitTypography: ProvidableCompositionLocal<UIKitTypography> = staticCompositionLocalOf {
    error("No TypographyTheme provided")
}