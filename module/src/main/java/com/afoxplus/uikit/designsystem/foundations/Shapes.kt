package com.afoxplus.uikit.designsystem.foundations

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

internal val DefaultShape = RectangleShape
internal val ExtraSmallShape = RoundedCornerShape(4.dp)
internal val SmallShape = RoundedCornerShape(8.dp)
internal val SmallMediumShape = RoundedCornerShape(12.dp)
internal val MediumShape = RoundedCornerShape(16.dp)
internal val ExtraMediumShape = RoundedCornerShape(24.dp)
internal val LargeShape = RoundedCornerShape(32.dp)
internal val ExtraLargeShape = RoundedCornerShape(40.dp)

internal val DefaultShapesTheme = Shapes(small = SmallShape, medium = MediumShape, large = LargeShape)

@Immutable
data class ShapesTheme(
    val default: Shape = DefaultShape,
    val extraSmall: Shape = ExtraSmallShape,
    val small: Shape = SmallShape,
    val smallMedium: Shape = SmallMediumShape,
    val medium: Shape = MediumShape,
    val extraMedium: Shape = ExtraMediumShape,
    val large: Shape = LargeShape,
    val extraLarge: Shape = ExtraLargeShape
)

internal val LocalUIKitShapes = staticCompositionLocalOf { ShapesTheme() }