package com.afoxplus.uikit.designsystem.molecules

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.afoxplus.uikit.designsystem.atoms.UIKitIcon
import com.afoxplus.uikit.designsystem.atoms.UIKitText
import com.afoxplus.uikit.designsystem.foundations.IconTheme

@Composable
fun UIKitItemTextIcon(
    modifier: Modifier = Modifier,
    leftIcon: IconTheme.Icon? = null,
    leftIconSize: Dp = 14.dp,
    leftIconPaddingValues: PaddingValues = PaddingValues(
        start = 0.dp,
        top = 0.dp,
        end = 0.dp,
        bottom = 0.dp
    ),
    rightIcon: IconTheme.Icon? = null,
    rightIconSize: Dp = 14.dp,
    rightIconPaddingValues: PaddingValues = PaddingValues(
        start = 0.dp,
        top = 0.dp,
        end = 0.dp,
        bottom = 0.dp
    ),
    text: String,
    textColor: Color = Color.White,
    textPaddingValues: PaddingValues = PaddingValues(
        start = 0.dp,
        top = 0.dp,
        end = 0.dp,
        bottom = 0.dp
    ),
    textStyle: TextStyle
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
    ) {
        if (leftIcon != null) {
            UIKitIcon(
                modifier = Modifier
                    .size(leftIconSize)
                    .padding(paddingValues = leftIconPaddingValues)
                    .align(alignment = Alignment.CenterVertically),
                icon = leftIcon
            )
        }
        UIKitText(
            modifier = Modifier
                .weight(1f)
                .align(alignment = Alignment.CenterVertically)
                .padding(paddingValues = textPaddingValues),
            text = text,
            color = textColor,
            style = textStyle
        )
        if (rightIcon != null) {
            UIKitIcon(
                modifier = Modifier
                    .size(rightIconSize)
                    .padding(paddingValues = rightIconPaddingValues)
                    .align(alignment = Alignment.CenterVertically),
                icon = rightIcon
            )
        }
    }
}