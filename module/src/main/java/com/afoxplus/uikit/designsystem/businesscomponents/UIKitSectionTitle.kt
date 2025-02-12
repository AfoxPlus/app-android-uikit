package com.afoxplus.uikit.designsystem.businesscomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.afoxplus.uikit.designsystem.atoms.UIKitIcon
import com.afoxplus.uikit.designsystem.atoms.UIKitText
import com.afoxplus.uikit.designsystem.atoms.UIKitVerticalDashedLine
import com.afoxplus.uikit.designsystem.extensions.getUIKitColor
import com.afoxplus.uikit.designsystem.extensions.getUIKitIcon
import com.afoxplus.uikit.designsystem.foundations.IconTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitColorTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitIconTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitTypographyTheme

@Composable
fun UIKitSectionTitle(
    modifier: Modifier = Modifier,
    title: String,
    iconToken: String,
    backgroundToken: String,
    contentColorToken: String
) {
    UIKitSectionTitle(
        modifier = modifier,
        title = title,
        icon = getUIKitIcon(token = iconToken),
        background = getUIKitColor(token = backgroundToken),
        contentColor = getUIKitColor(token = contentColorToken)
    )
}

@Composable
fun UIKitSectionTitle(
    modifier: Modifier = Modifier,
    title: String,
    icon: IconTheme.Icon = UIKitIconTheme.icon_whatsapp_outline,
    background: Color = UIKitColorTheme.gray100,
    contentColor: Color = UIKitColorTheme.gray700
) {
    Surface(modifier = modifier.fillMaxWidth(), color = background) {
        Row(
            modifier = modifier.padding(
                horizontal = UIKitTheme.spacing.spacing16,
                vertical = UIKitTheme.spacing.spacing08
            ),
            horizontalArrangement = Arrangement.spacedBy(UIKitTheme.spacing.spacing16),
            verticalAlignment = Alignment.CenterVertically
        ) {
            UIKitIcon(
                modifier = Modifier.size(UIKitTheme.spacing.spacing24),
                icon = icon,
                tint = contentColor
            )
            UIKitVerticalDashedLine(
                modifier = Modifier.height(UIKitTheme.spacing.spacing20),
                color = contentColor
            )
            UIKitText(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                text = title,
                style = UIKitTypographyTheme.header05Bold,
                color = contentColor
            )
        }
    }

}