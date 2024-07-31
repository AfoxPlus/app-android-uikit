package com.afoxplus.uikit.designsystem.atoms

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.afoxplus.uikit.designsystem.foundations.UIKitIcon

@Composable
fun UIKitIcon(
    modifier: Modifier = Modifier,
    icon: UIKitIcon.Icon,
    contentDescription: String? = null,
    alignment: Alignment = Alignment.Center,
    contentScale: ContentScale = ContentScale.Fit
) {
    Image(
        modifier = modifier,
        painter = painterResource(icon.drawableRes),
        contentDescription = contentDescription,
        alignment = alignment,
        contentScale = contentScale
    )
}