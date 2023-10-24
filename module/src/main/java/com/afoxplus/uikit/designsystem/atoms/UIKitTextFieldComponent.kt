package com.afoxplus.uikit.designsystem.atoms

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun UIKitTextField(
    modifier: Modifier = Modifier,
    placeholder: String = "",
    singleLine: Boolean = true,
    colors: TextFieldColors = TextFieldDefaults.colors(
        focusedContainerColor = Color.Transparent,
        unfocusedContainerColor = Color.Transparent
    ),
    onValueChange: (TextFieldValue) -> Unit,
) {

    var inputText by rememberSaveable(stateSaver = TextFieldValue.Saver) {
        mutableStateOf(TextFieldValue(""))
    }

    TextField(
        modifier = modifier,
        value = inputText,
        onValueChange = {
            inputText = it
            onValueChange(it)
        },
        singleLine = singleLine,
        colors = colors,
        placeholder = { Text(text = placeholder) }
    )
}

@Preview
@Composable
fun TextFieldYaListoComponentPreview() {
    var inputText by remember { mutableStateOf(TextFieldValue("")) }

    UIKitTextField(
        modifier = Modifier.fillMaxWidth(),
        placeholder = "Helouda",
        onValueChange = { inputText = it }
    )
}