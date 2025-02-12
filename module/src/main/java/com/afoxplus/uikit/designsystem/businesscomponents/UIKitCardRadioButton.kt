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
import com.afoxplus.uikit.designsystem.foundations.styles.UIKitRadioButtonStyle
import com.afoxplus.uikit.designsystem.molecules.UIKitLabelledRadioButton

@Composable
fun UIKitCardRadioButton(
    modifier: Modifier = Modifier,
    radioButtonStyle: UIKitRadioButtonStyle = UIKitRadioButtonStyle.radioButtonGreenStyle,
    borderStroke: Dp = 1.dp,
    text: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    val border =
        if (selected) BorderStroke(borderStroke, radioButtonStyle.selectedColor) else null
    Card(
        modifier = modifier.wrapContentSize(),
        border = border,
        colors = CardDefaults.cardColors(
            containerColor = radioButtonStyle.backgroundColor,
            contentColor = radioButtonStyle.selectedColor
        ),
        shape = RoundedCornerShape(UIKitTheme.spacing.spacing04)
    ) {
        UIKitLabelledRadioButton(
            selected = selected,
            radioButtonStyle = radioButtonStyle,
            label = text,
            onClick = onClick
        )
    }
}