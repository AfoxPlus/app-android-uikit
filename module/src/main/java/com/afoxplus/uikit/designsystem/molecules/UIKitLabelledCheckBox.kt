package com.afoxplus.uikit.designsystem.molecules

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import com.afoxplus.uikit.designsystem.atoms.UIKitCheckbox
import com.afoxplus.uikit.designsystem.atoms.UIKitText
import com.afoxplus.uikit.designsystem.foundations.UIKitColorTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitTypographyTheme
import com.afoxplus.uikit.designsystem.foundations.styles.UIKitCheckboxStyle

@Composable
fun UIKitLabelledCheckBox(
    modifier: Modifier = Modifier,
    checkboxStyle: UIKitCheckboxStyle = UIKitCheckboxStyle.checkboxGreenStyle,
    label: String,
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .clip(MaterialTheme.shapes.small)
            .clickable(
                indication = rememberRipple(color = UIKitColorTheme.secondaryColor),
                interactionSource = remember { MutableInteractionSource() },
                onClick = { onCheckedChange(!checked) }
            )
            .requiredHeight(ButtonDefaults.MinHeight)
    ) {
        UIKitCheckbox(
            modifier = Modifier.padding(start = UIKitTheme.spacing.spacing12),
            checked = checked,
            style = checkboxStyle,
            onCheckedChange = null
        )
        Spacer(Modifier.size(UIKitTheme.spacing.spacing08))
        UIKitText(
            modifier = Modifier.padding(end = UIKitTheme.spacing.spacing12),
            text = label,
            style = UIKitTypographyTheme.paragraph01Bold,
            color = checkboxStyle.checkedColor
        )
    }
}