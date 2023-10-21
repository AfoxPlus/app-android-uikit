package com.afoxplus.uikit.designsystem.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.afoxplus.uikit.designsystem.theme.UIKitTheme

@Composable
fun UIKitButtonPrimaryLarge(
    modifier: Modifier = Modifier,
    text: String,
    enabled: Boolean = true,
    colors: ButtonColors = ButtonDefaults.buttonColors(containerColor = UIKitTheme.colors.orange01),
    shape: Shape = RoundedCornerShape(15.dp),
    onClick: () -> Unit
) {

    Button(
        modifier = modifier
            .fillMaxWidth(),
        enabled = enabled,
        onClick = {
            onClick()
        },
        colors = colors,
        shape = shape
    ) {
        Text(
            modifier = modifier
                .fillMaxWidth()
                .padding(10.dp)
                .align(Alignment.CenterVertically),
            text = text,
            textAlign = TextAlign.Center,
            style = UIKitTheme.typography.header05SemiBold,
            color = UIKitTheme.colors.light01
        )
    }
}

@Composable
fun UIKitButtonOutlineLarge(
    modifier: Modifier = Modifier,
    text: String,
    enabled: Boolean = true,
    border: BorderStroke = BorderStroke(UIKitTheme.spacing.spacing02, UIKitTheme.colors.orange01),
    shape: Shape = RoundedCornerShape(15.dp),
    textColor: Color = UIKitTheme.colors.orange01,
    onClick: () -> Unit
) {

    OutlinedButton(
        modifier = modifier
            .fillMaxWidth(),
        border = border,
        shape = shape,
        enabled = enabled,
        onClick = {
            onClick()
        }
    ) {
        Text(
            modifier = modifier
                .fillMaxWidth()
                .padding(10.dp)
                .align(Alignment.CenterVertically),
            text = text,
            textAlign = TextAlign.Center,
            style = UIKitTheme.typography.header05SemiBold,
            color = textColor
        )
    }
}

@Preview()
@Composable
internal fun ButtonsComponentPreview() = UIKitTheme {
    Column {
        UIKitButtonPrimaryLarge(
            modifier = Modifier.fillMaxWidth(),
            text = "Ingresar",
            enabled = true,
            onClick = {})

        UIKitButtonPrimaryLarge(
            modifier = Modifier.fillMaxWidth(),
            text = "Ingresar",
            enabled = false,
            onClick = {})

        UIKitButtonOutlineLarge(
            modifier = Modifier.fillMaxWidth(),
            text = "Ingresar",
            border = BorderStroke(2.dp, UIKitTheme.colors.orange01),
            onClick = {})
    }
}