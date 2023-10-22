package com.afoxplus.uikit.designsystem.foundations

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

internal val DefaultSpace = 0.dp
internal val ExtraSmallSpace = 4.dp
internal val SmallSpace = 8.dp
internal val SmallMediumSpace = 12.dp
internal val MediumSpace = 16.dp
internal val ExtraMediumSpace = 24.dp
internal val LargeSpace = 32.dp
internal val ExtraLargeSpace = 40.dp
internal val LargestSpace = 64.dp

internal val Spacing01 = 1.dp
internal val Spacing02 = 2.dp
internal val Spacing03 = 3.dp
internal val Spacing04 = 4.dp
internal val Spacing06 = 6.dp
internal val Spacing08 = 8.dp
internal val Spacing10 = 10.dp
internal val Spacing12 = 12.dp
internal val Spacing14 = 14.dp
internal val Spacing16 = 16.dp
internal val Spacing18 = 18.dp
internal val Spacing20 = 20.dp
internal val Spacing22 = 22.dp
internal val Spacing24 = 24.dp
internal val Spacing26 = 26.dp
internal val Spacing28 = 28.dp
internal val Spacing30 = 30.dp
internal val Spacing40 = 40.dp
internal val Spacing44 = 44.dp
internal val Spacing48 = 48.dp
internal val Spacing60 = 60.dp
internal val Spacing70 = 70.dp

@Immutable
data class UIKitSpacing(
    val default: Dp = DefaultSpace,
    val extraSmall: Dp = ExtraSmallSpace,
    val small: Dp = SmallSpace,
    val smallMedium: Dp = SmallMediumSpace,
    val medium: Dp = MediumSpace,
    val extraMedium: Dp = ExtraMediumSpace,
    val large: Dp = LargeSpace,
    val extraLarge: Dp = ExtraLargeSpace,
    val largest: Dp = LargestSpace,

    val spacing01: Dp = Spacing01,
    val spacing02: Dp = Spacing02,
    val spacing03: Dp = Spacing03,
    val spacing04: Dp = Spacing04,
    val spacing06: Dp = Spacing06,
    val spacing08: Dp = Spacing08,
    val spacing10: Dp = Spacing10,
    val spacing12: Dp = Spacing12,
    val spacing14: Dp = Spacing14,
    val spacing16: Dp = Spacing16,
    val spacing18: Dp = Spacing18,
    val spacing20: Dp = Spacing20,
    val spacing22: Dp = Spacing22,
    val spacing24: Dp = Spacing24,
    val spacing26: Dp = Spacing26,
    val spacing28: Dp = Spacing28,
    val spacing30: Dp = Spacing30,
    val spacing40: Dp = Spacing40,
    val spacing44: Dp = Spacing44,
    val spacing48: Dp = Spacing48,
    val spacing60: Dp = Spacing60,
    val spacing70: Dp = Spacing70
)

internal val LocalUIKitSpacing = staticCompositionLocalOf { UIKitSpacing() }