package com.afoxplus.uikit.designsystem.atoms

import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import com.afoxplus.uikit.designsystem.foundations.primitives.Typography
import com.afoxplus.uikit.designsystem.theme.UIKitTheme

@Composable
fun UIKitText(
    modifier: Modifier = Modifier,
    text: String,
    typography: Typography,
    color: Color = UIKitTheme.colors.secondaryColor,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextStyle = LocalTextStyle.current,
    textAlign: TextAlign? = null,
    overflow: TextOverflow = TextOverflow.Clip
) {
    Text(
        text = text,
        modifier = modifier,
        color = color,
        fontFamily = typography.font,
        overflow = overflow,
        fontSize = typography.fontSize,
        letterSpacing = typography.getLetterSpacingInSp(),
        textAlign = textAlign,
        maxLines = maxLines,
        onTextLayout = onTextLayout,
        style = style
    )
}