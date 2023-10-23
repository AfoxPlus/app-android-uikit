package com.afoxplus.uikit.designsystem.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import com.afoxplus.uikit.designsystem.foundations.DarkColorScheme
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

@Composable
fun UIKitTheme(
    colorScheme: ColorScheme = DarkColorScheme,
    shapes: Shapes = Shapes,
    typography: androidx.compose.material3.Typography = Typography,
    content: @Composable () -> Unit
) {
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
        LocalUIKitShapes provides UIKitShapes(),
        LocalUIKitTypography provides UIKitTypography(),
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