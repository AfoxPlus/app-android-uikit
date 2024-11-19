package com.afoxplus.uikit.designsystem.atoms

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.afoxplus.uikit.designsystem.foundations.styles.UIKitRadioButtonStyle

@Composable
fun UIKitRadioButton(
    modifier: Modifier = Modifier,
    selected: Boolean,
    enabled: Boolean = true,
    style: UIKitRadioButtonStyle = UIKitRadioButtonStyle.radioButtonDefaultStyle,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit
) {
    RadioButton(
        modifier = modifier,
        selected = selected,
        onClick = onClick,
        enabled = enabled,
        colors = RadioButtonDefaults.colors(
            selectedColor = style.selectedColor,
            unselectedColor = style.unselectedColor,
            disabledSelectedColor = style.disabledSelectedColor,
            disabledUnselectedColor = style.disabledUnselectedColor
        ),
        interactionSource = interactionSource
    )
}