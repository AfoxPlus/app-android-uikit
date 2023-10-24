package com.afoxplus.uikit.designsystem.foundations

import com.afoxplus.uikit.designsystem.foundations.primitives.Typography
import androidx.compose.material3.Typography as MaterialTypography
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
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

@Immutable
abstract class UIKitTypography {
    abstract val header01: Typography
    abstract val header01SemiBold: Typography
    abstract val header01Bold: Typography
    abstract val header02: Typography
    abstract val header02SemiBold: Typography
    abstract val header02Bold: Typography
    abstract val header03: Typography
    abstract val header03SemiBold: Typography
    abstract val header03Bold: Typography
    abstract val header04: Typography
    abstract val header04SemiBold: Typography
    abstract val header04Bold: Typography
    abstract val header05: Typography
    abstract val header05SemiBold: Typography
    abstract val header05Bold: Typography
    abstract val paragraph01: Typography
    abstract val paragraph01SemiBold: Typography
    abstract val paragraph01Bold: Typography
    abstract val paragraph02: Typography
    abstract val paragraph02SemiBold: Typography
    abstract val paragraph02Bold: Typography
    abstract val title01: Typography
    abstract val title02: Typography
    abstract val title03: Typography
    abstract val title04: Typography
}

val UIKitTypographyTheme = object : UIKitTypography() {
    override val header01: Typography = Typography(
        fontSize = 32.sp,
        fontWeight = FontWeight.Medium
    )

    override val header01SemiBold: Typography = Typography(
        fontSize = 32.sp,
        fontWeight = FontWeight.SemiBold
    )

    override val header01Bold: Typography = Typography(
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
    )

    override val header02: Typography = Typography(
        fontSize = 24.sp,
        fontWeight = FontWeight.Medium
    )

    override val header02SemiBold: Typography = Typography(
        fontSize = 24.sp,
        fontWeight = FontWeight.SemiBold
    )

    override val header02Bold: Typography = Typography(
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold
    )

    override val header03: Typography = Typography(
        fontSize = 20.sp,
        fontWeight = FontWeight.Medium
    )

    override val header03SemiBold: Typography = Typography(
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold
    )

    override val header03Bold: Typography = Typography(
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
    )

    override val header04: Typography = Typography(
        fontSize = 18.sp,
        fontWeight = FontWeight.Medium
    )

    override val header04SemiBold: Typography = Typography(
        fontSize = 18.sp,
        fontWeight = FontWeight.SemiBold
    )

    override val header04Bold: Typography = Typography(
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
    )

    override val header05: Typography = Typography(
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium
    )

    override val header05SemiBold: Typography = Typography(
        fontSize = 16.sp,
        fontWeight = FontWeight.SemiBold
    )

    override val header05Bold: Typography = Typography(
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold
    )

    override val paragraph01: Typography = Typography(
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium
    )

    override val paragraph01SemiBold: Typography = Typography(
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold
    )

    override val paragraph01Bold: Typography = Typography(
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold
    )

    override val paragraph02: Typography = Typography(
        fontSize = 12.sp,
        fontWeight = FontWeight.Medium
    )

    override val paragraph02SemiBold: Typography = Typography(
        fontSize = 12.sp,
        fontWeight = FontWeight.SemiBold
    )

    override val paragraph02Bold: Typography = Typography(
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold
    )

    override val title01: Typography = Typography(
        fontSize = 64.sp,
        fontWeight = FontWeight.SemiBold
    )

    override val title02: Typography = Typography(
        fontSize = 48.sp,
        fontWeight = FontWeight.SemiBold
    )

    override val title03: Typography = Typography(
        fontSize = 40.sp,
        fontWeight = FontWeight.SemiBold
    )

    override val title04: Typography = Typography(
        fontSize = 36.sp,
        fontWeight = FontWeight.SemiBold
    )
}

internal val TypographyTheme = defaultTypography()

private fun defaultTypography() = with(UIKitTypographyTheme) {
    MaterialTypography(
        displayLarge = title01.asTextStyle(),
        displayMedium = title02.asTextStyle(),
        displaySmall = title03.asTextStyle(),
        headlineLarge = title01.asTextStyle(),
        headlineMedium = header01.asTextStyle(),
        headlineSmall = header02.asTextStyle(),
        titleLarge = header03.asTextStyle(),
        titleMedium = header04.asTextStyle(),
        titleSmall = header05.asTextStyle(),
        bodyLarge = header03SemiBold.asTextStyle(),
        bodyMedium = header04SemiBold.asTextStyle(),
        bodySmall = header05SemiBold.asTextStyle(),
        labelLarge = paragraph01.asTextStyle(),
        labelMedium = paragraph02SemiBold.asTextStyle(),
        labelSmall = paragraph02Bold.asTextStyle()
    )
}

val LocalUIKitTypography: ProvidableCompositionLocal<UIKitTypography> = staticCompositionLocalOf {
    error("No TypographyTheme provided")
}