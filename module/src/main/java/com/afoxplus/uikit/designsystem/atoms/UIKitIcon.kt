package com.afoxplus.uikit.designsystem.atoms

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.afoxplus.uikit.designsystem.foundations.UIKitColorTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitIcon

@Composable
fun UIKitIcon(
    modifier: Modifier = Modifier,
    icon: UIKitIcon.Icon,
    contentDescription: String? = null,
    tint: Color = UIKitColorTheme.secondaryColor
) {
    Icon(
        modifier = modifier,
        painter = painterResource(icon.drawableRes),
        contentDescription = contentDescription,
        tint = tint
    )
}