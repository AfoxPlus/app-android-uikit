package com.afoxplus.uikit.designsystem.molecules

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.afoxplus.uikit.designsystem.atoms.UIKitRadioButton
import com.afoxplus.uikit.designsystem.atoms.UIKitText
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitTypographyTheme
import com.afoxplus.uikit.designsystem.foundations.styles.UIKitRadioButtonStyle

@Composable
fun UIKitLabelledRadioButton(
    modifier: Modifier = Modifier, label: String,
    radioButtonStyle: UIKitRadioButtonStyle = UIKitRadioButtonStyle.radioButtonGreenStyle,
    selected: Boolean,
    onClick: () -> Unit
) {
    Row(
        modifier = modifier.wrapContentSize(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        UIKitRadioButton(
            selected = selected,
            onClick = onClick,
            enabled = true,
            style = radioButtonStyle
        )
        UIKitText(
            modifier = Modifier.padding(end = UIKitTheme.spacing.spacing12),
            text = label,
            style = UIKitTypographyTheme.paragraph01Bold,
            color = radioButtonStyle.selectedColor
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewComponent() {
    UIKitTheme {

        UIKitLabelledRadioButton(label = "Efectivo", selected = false, onClick = {})
    }
}