package com.afoxplus.uikit.designsystem.atoms

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.unit.Dp
import com.afoxplus.uikit.designsystem.foundations.UIKitColorTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme

@Composable
fun UIKitVerticalDashedLine(
    modifier: Modifier = Modifier,
    color: Color = UIKitColorTheme.secondaryColor,
    border: Dp = UIKitTheme.spacing.spacing02,
    strokeWidth: Float = 4f
) {
    Canvas(
        modifier = modifier
            .width(border)
    ) {
        drawLine(
            color = color,
            start = Offset(size.width / 2, 0f),
            end = Offset(size.width / 2, size.height),
            pathEffect = PathEffect.dashPathEffect(floatArrayOf(5f, 5f), 0f),
            strokeWidth = strokeWidth
        )
    }
}