package com.afoxplus.uikit.designsystem.atoms

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.afoxplus.uikit.designsystem.foundations.styles.UIKitCheckboxStyle

@Composable
fun UIKitCheckbox(
    modifier: Modifier = Modifier,
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    enabled: Boolean = true,
    style: UIKitCheckboxStyle = UIKitCheckboxStyle.checkboxDefaultStyle,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    Checkbox(
        modifier = modifier,
        checked = checked,
        onCheckedChange = onCheckedChange,
        enabled = enabled,
        colors = CheckboxDefaults.colors(
            checkedColor = style.checkedColor,
            uncheckedColor = style.uncheckedColor,
            checkmarkColor = style.checkmarkColor,
            disabledCheckedColor = style.disabledCheckedColor,
            disabledUncheckedColor = style.disabledUncheckedColor,
            disabledIndeterminateColor = style.disabledIndeterminateColor
        ),
        interactionSource = interactionSource
    )
}