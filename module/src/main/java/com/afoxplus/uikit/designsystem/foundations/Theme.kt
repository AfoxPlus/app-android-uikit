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
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

@Composable
fun UIKitTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    shapes: Shapes = Shapes,
    typography: MaterialTypography = TypographyTheme,
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
            window.statusBarColor = colorScheme.background.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
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
        LocalUIKitShapes provides UIKitShapes(),
        LocalUIKitSpacing provides UIKitSpacing()
    ) {
        content()
    }
}

object UIKitTheme {
    val colors: UIKitColors
        @Composable
        @ReadOnlyComposable
        get() = LocalUIKitColors.current

    val shapes: UIKitShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalUIKitShapes.current

    val typography: UIKitTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalUIKitTypography.current

    val spacing: UIKitSpacing
        @Composable
        @ReadOnlyComposable
        get() = LocalUIKitSpacing.current
}