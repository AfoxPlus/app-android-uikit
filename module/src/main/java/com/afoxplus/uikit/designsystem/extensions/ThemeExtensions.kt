package com.afoxplus.uikit.designsystem.extensions

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.afoxplus.uikit.designsystem.foundations.ColorTheme
import com.afoxplus.uikit.designsystem.foundations.IconTheme
import com.afoxplus.uikit.designsystem.foundations.LocalUIKitColors
import com.afoxplus.uikit.designsystem.foundations.LocalUIKitIconTheme
import com.afoxplus.uikit.designsystem.foundations.LocalUIKitSpacing
import com.afoxplus.uikit.designsystem.foundations.LocalUIKitTypography
import com.afoxplus.uikit.designsystem.foundations.SpacingTheme
import com.afoxplus.uikit.designsystem.foundations.TypographyTheme
import kotlin.reflect.full.memberProperties

class ParameterValue<T>(val name: String, val value: T) {
    fun component1(): String = name
    fun component2(): T = value
}

@Composable
fun getUIKitTypography(token: String): TextStyle {

    val typographyTheme = LocalUIKitTypography.current
    val defaultTypography: MutableState<TextStyle?>? = null
    val selectedTypography = defaultTypography ?: remember { mutableStateOf<TextStyle?>(null) }

    val options = TypographyTheme::class.memberProperties.map {
        ParameterValue(it.name, (it.get(typographyTheme) as TextStyle))
    }

    selectedTypography.value = options.first { it.name == token }.value

    return selectedTypography.value ?: throw IllegalArgumentException("Unknown Typography")
}

@Composable
fun getUIKitColor(token: String): Color {

    val colorTheme = LocalUIKitColors.current
    val defaultColor: MutableState<Color?>? = null
    val selectedColor = defaultColor ?: remember { mutableStateOf<Color?>(null) }

    val options = ColorTheme::class.memberProperties.map {
        ParameterValue(it.name, (it.get(colorTheme) as Color))
    }

    selectedColor.value = options.first { it.name == token }.value

    return selectedColor.value ?: throw IllegalArgumentException("Unknown Color")
}

@Composable
fun getUIKitSpacing(token: String): Dp {

    val spacingTheme = LocalUIKitSpacing.current
    val defaultSpacing: MutableState<Dp?>? = null
    val selectedSpacing = defaultSpacing ?: remember { mutableStateOf<Dp?>(null) }

    val options = SpacingTheme::class.memberProperties.map {
        ParameterValue(it.name, (it.get(spacingTheme) as Dp))
    }

    selectedSpacing.value = options.first { it.name == token }.value

    return selectedSpacing.value ?: throw IllegalArgumentException("Unknown Spacing")
}


@Composable
fun getUIKitIcon(token: String): IconTheme.Icon {

    val iconTheme = LocalUIKitIconTheme.current

    val options = IconTheme::class.memberProperties.map {
        ParameterValue(it.name, (it.get(iconTheme) as IconTheme.Icon))
    }

    return options.first { it.name == token }.value
}