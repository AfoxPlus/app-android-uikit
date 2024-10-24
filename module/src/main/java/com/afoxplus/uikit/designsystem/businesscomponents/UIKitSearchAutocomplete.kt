package com.afoxplus.uikit.designsystem.businesscomponents

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import com.afoxplus.uikit.designsystem.atoms.UIKitIcon
import com.afoxplus.uikit.designsystem.foundations.UIKitColorTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme

@Composable
fun UIKitSearchAutocomplete(
    modifier: Modifier = Modifier,
    placeholder: String = "",
    onBackClick: () -> Unit,
    onTextChange: (String) -> Unit
) {
    val textState = remember { mutableStateOf(TextFieldValue("")) }
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(UIKitTheme.spacing.spacing10),
        shape = RoundedCornerShape(UIKitTheme.spacing.spacing12),
        colors = CardDefaults.cardColors(containerColor = UIKitColorTheme.gray50)
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            UIKitIcon(
                modifier = Modifier
                    .clickable { onBackClick() },
                icon = UIKitTheme.icons.icon_back,
                tint = UIKitTheme.colors.secondaryColor
            )
            Box(
                modifier = Modifier
                    .weight(1f)
            ) {
                if (textState.value.text.isEmpty()) {
                    Text(
                        text = placeholder,
                        style = UIKitTheme.typography.header05,
                        color = UIKitTheme.colors.gray400,
                        modifier = Modifier.padding(horizontal = UIKitTheme.spacing.spacing08)
                    )
                }
                BasicTextField(
                    value = textState.value,
                    onValueChange = { newText ->
                        textState.value = newText
                        onTextChange(newText.text)
                    },
                    singleLine = true,
                    textStyle = UIKitTheme.typography.header05.copy(color = UIKitTheme.colors.secondaryColor),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = UIKitTheme.spacing.spacing08)
                )
            }

            if (textState.value.text.isNotEmpty()) {
                UIKitIcon(
                    modifier = Modifier
                        .clickable { textState.value = TextFieldValue("") },
                    icon = UIKitTheme.icons.icon_clean,
                    tint = UIKitTheme.colors.secondaryColor
                )
            }
        }
    }
}
