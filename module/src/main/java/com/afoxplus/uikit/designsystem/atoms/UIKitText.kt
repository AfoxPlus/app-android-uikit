package com.afoxplus.uikit.designsystem.atoms

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import com.afoxplus.uikit.R
import com.afoxplus.uikit.designsystem.foundations.UIKitColorTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme

@Composable
fun UIKitText(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = UIKitTheme.colors.secondaryColor,
    style: TextStyle = LocalTextStyle.current,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    textAlign: TextAlign? = null,
    overflow: TextOverflow = TextOverflow.Clip
) {
    Text(
        text = text,
        modifier = modifier,
        color = color,
        style = style,
        overflow = overflow,
        textAlign = textAlign,
        maxLines = maxLines,
        onTextLayout = onTextLayout
    )
}

@Composable
fun UIKitText(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = UIKitColorTheme.secondaryColor,
    style: TextStyle = LocalTextStyle.current,
    maxLines: Int = 1,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    textAlign: TextAlign? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    colorExpandableText: Color = UIKitColorTheme.primaryColor,
    styleExpandableText: TextStyle = LocalTextStyle.current
) {
    var isExpanded by remember { mutableStateOf(false) }
    var isOverflowing by remember { mutableStateOf(false) }
    val linesToShow = if (isExpanded) Int.MAX_VALUE else maxLines

    Column(modifier = modifier) {
        UIKitText(
            text = text,
            maxLines = linesToShow,
            overflow = overflow,
            style = style,
            textAlign = textAlign,
            color = color,
            onTextLayout = { textLayoutResult ->
                isOverflowing = textLayoutResult.hasVisualOverflow
                onTextLayout(textLayoutResult)
            }
        )
        if (isOverflowing) {
            UIKitText(
                text = if (isExpanded) stringResource(R.string.uikit_text_see_less) else stringResource(
                    R.string.uikit_text_see_more
                ),
                color = colorExpandableText,
                modifier = Modifier
                    .padding(top = UIKitTheme.spacing.spacing04)
                    .clickable { isExpanded = !isExpanded },
                style = styleExpandableText
            )
        }
    }
}