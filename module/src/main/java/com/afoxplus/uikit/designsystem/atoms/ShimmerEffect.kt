package com.afoxplus.uikit.designsystem.atoms

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme

@Composable
fun ShimmerPlaceholder(content: @Composable () -> Unit) {
    Box(
        modifier = Modifier.shimmerEffect()
    ) {
        content()
    }
}

@Composable
fun Modifier.shimmerEffect(): Modifier {
    val shimmerColors = listOf(
        UIKitTheme.colors.gray400.copy(alpha = 0.6f),
        UIKitTheme.colors.gray400.copy(alpha = 0.3f),
        UIKitTheme.colors.gray400.copy(alpha = 0.6f)
    )

    val transition = rememberInfiniteTransition(label = "shimmer")
    val translateAnimation = transition.animateFloat(
        initialValue = 0f,
        targetValue = 1000f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 1000,
                easing = LinearEasing
            ),
            repeatMode = RepeatMode.Restart
        ),
        label = "shimmer"
    )

    val brush = Brush.linearGradient(
        colors = shimmerColors,
        start = Offset.Zero,
        end = Offset(x = translateAnimation.value, y = translateAnimation.value)
    )

    return this.background(brush)
}