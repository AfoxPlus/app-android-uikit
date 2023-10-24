package com.afoxplus.uikit.designsystem.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.Typography as MaterialTypography
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.afoxplus.uikit.designsystem.foundations.UIKitDarkColorScheme
import com.afoxplus.uikit.designsystem.foundations.LocalUIKitColors
import com.afoxplus.uikit.designsystem.foundations.LocalUIKitShapes
import com.afoxplus.uikit.designsystem.foundations.LocalUIKitSpacing
import com.afoxplus.uikit.designsystem.foundations.LocalUIKitTypography
import com.afoxplus.uikit.designsystem.foundations.UIKitColors
import com.afoxplus.uikit.designsystem.foundations.UIKitShapes
import com.afoxplus.uikit.designsystem.foundations.UIKitSpacing
import com.afoxplus.uikit.designsystem.foundations.UIKitTypography
import com.afoxplus.uikit.designsystem.foundations.Shapes
import com.afoxplus.uikit.designsystem.foundations.Typography
import com.afoxplus.uikit.designsystem.foundations.UIKitColorTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitLightColorScheme
import com.afoxplus.uikit.designsystem.foundations.UIKitTypographyTheme

@Composable
fun UIKitTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    shapes: Shapes = Shapes,
    typography: MaterialTypography = Typography,
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
        ProvideTextStyle(value = UIKitTheme.typography.header05, content = content)
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