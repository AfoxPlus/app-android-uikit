package com.afoxplus.uikit.designsystem.foundations

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.Typography as MaterialTypography
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

@Composable
fun UIKitTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    shapes: Shapes = DefaultShapesTheme,
    typography: MaterialTypography = DefaultTypographyTheme,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> UIKitDarkColorScheme
        else -> UIKitLightColorScheme
    }

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = Color.Transparent.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        shapes = shapes,
        typography = typography
    ) { ProvideUIKitThemeDependencies(content = content) }
}

@Composable
private fun ProvideUIKitThemeDependencies(content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalUIKitColors provides UIKitColorTheme,
        LocalUIKitTypography provides UIKitTypographyTheme,
        LocalUIKitIconTheme provides UIKitIconTheme,
        LocalUIKitShapes provides ShapesTheme(),
        LocalUIKitSpacing provides SpacingTheme()
    ) {
        content()
    }
}

object UIKitTheme {
    val colors: ColorTheme
        @Composable
        @ReadOnlyComposable
        get() = LocalUIKitColors.current

    val shapes: ShapesTheme
        @Composable
        @ReadOnlyComposable
        get() = LocalUIKitShapes.current

    val typography: TypographyTheme
        @Composable
        @ReadOnlyComposable
        get() = LocalUIKitTypography.current

    val spacing: SpacingTheme
        @Composable
        @ReadOnlyComposable
        get() = LocalUIKitSpacing.current

    val icons: IconTheme
        @Composable
        @ReadOnlyComposable
        get() = LocalUIKitIconTheme.current
}