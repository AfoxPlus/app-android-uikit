package com.afoxplus.uikit.designsystem.businesscomponents

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme
import com.afoxplus.uikit.designsystem.foundations.styles.UIKitCheckboxStyle
import com.afoxplus.uikit.designsystem.molecules.UIKitLabelledCheckBox

@Composable
fun UIKitCardCheckbox(
    modifier: Modifier = Modifier,
    checkboxStyle: UIKitCheckboxStyle = UIKitCheckboxStyle.checkboxBlueStyle,
    borderStroke: Dp = 1.dp,
    text: String,
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)
) {
    val border = if (checked) BorderStroke(borderStroke, checkboxStyle.checkedColor) else null
    Card(
        modifier = modifier.wrapContentSize(),
        border = border,
        colors = CardDefaults.cardColors(
            containerColor = checkboxStyle.backgroundColor,
            contentColor = checkboxStyle.checkedColor
        ),
        shape = RoundedCornerShape(UIKitTheme.spacing.spacing04)
    ) {
        UIKitLabelledCheckBox(
            checked = checked,
            checkboxStyle = checkboxStyle,
            onCheckedChange = onCheckedChange,
            label = text
        )
    }
}