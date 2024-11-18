package com.afoxplus.uikit.designsystem.businesscomponents

import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.afoxplus.uikit.designsystem.atoms.UIKitIcon
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme

@Composable
fun UIKitSearchAutocomplete(
    modifier: Modifier = Modifier,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    focusRequester: FocusRequester,
    placeholder: String = "",
    onBackClick: () -> Unit,
    onTextChange: (String) -> Unit,
    onTextClear: () -> Unit
) {
    val textState = remember { mutableStateOf(TextFieldValue("")) }
    Surface(
        modifier = modifier
            .wrapContentSize()
            .focusable(),
        shape = UIKitTheme.shapes.smallMedium,
        color = UIKitTheme.colors.gray50
    ) {
        ConstraintLayout(modifier = Modifier.fillMaxWidth()) {
            val (backIcon, textFieldBox, text, closeIcon) = createRefs()
            UIKitIcon(
                modifier = Modifier
                    .constrainAs(backIcon) {
                        top.linkTo(parent.top, margin = 10.dp)
                        start.linkTo(parent.start, margin = 10.dp)
                        bottom.linkTo(parent.bottom, margin = 10.dp)
                    }
                    .clickable { onBackClick() },
                icon = UIKitTheme.icons.icon_back,
                tint = UIKitTheme.colors.secondaryColor
            )

            if (textState.value.text.isEmpty()) {
                Text(
                    text = placeholder,
                    style = UIKitTheme.typography.header05,
                    color = UIKitTheme.colors.gray400,
                    modifier = Modifier
                        .constrainAs(text) {
                            top.linkTo(backIcon.top)
                            start.linkTo(backIcon.end, margin = 12.dp)
                            bottom.linkTo(backIcon.bottom)
                            end.linkTo(closeIcon.start, margin = 12.dp)
                            width = Dimension.fillToConstraints
                        }
                )
            }
            BasicTextField(
                value = textState.value,
                onValueChange = { newText ->
                    textState.value = newText
                    onTextChange(newText.text)
                },
                modifier = Modifier
                    .focusRequester(focusRequester)
                    .focusable()
                    .constrainAs(textFieldBox) {
                        top.linkTo(backIcon.top)
                        start.linkTo(backIcon.end, margin = 12.dp)
                        bottom.linkTo(backIcon.bottom)
                        end.linkTo(closeIcon.start, margin = 12.dp)
                        width = Dimension.fillToConstraints
                    },
                singleLine = true,
                keyboardActions = keyboardActions,
                keyboardOptions = keyboardOptions,
                textStyle = UIKitTheme.typography.header05.copy(color = UIKitTheme.colors.secondaryColor)
            )
            Box(modifier = Modifier
                .constrainAs(closeIcon) {
                    top.linkTo(backIcon.top)
                    bottom.linkTo(backIcon.bottom)
                    end.linkTo(parent.end, margin = 10.dp)
                }) {
                if (textState.value.text.isNotEmpty()) {
                    UIKitIcon(
                        modifier = Modifier
                            .clickable {
                                onTextClear()
                                textState.value = TextFieldValue("") },
                        icon = UIKitTheme.icons.icon_clean,
                        tint = UIKitTheme.colors.secondaryColor
                    )
                }
            }
        }
    }
}
