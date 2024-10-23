package com.afoxplus.uikit.designsystem.businesscomponents

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.afoxplus.uikit.designsystem.atoms.UIKitIcon
import com.afoxplus.uikit.designsystem.atoms.UIKitText
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme

@Composable
fun UIKitMapSearch(
    modifier: Modifier = Modifier,
    placeholderText: String,
    onClickSearch: () -> Unit = {},
) {
    Surface(
        shape = UIKitTheme.shapes.smallMedium,
        color = UIKitTheme.colors.light01,
        shadowElevation = 4.dp,
        modifier = modifier
            .fillMaxWidth()
            .clickable { onClickSearch() }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(UIKitTheme.spacing.spacing10),
            verticalAlignment = Alignment.CenterVertically
        ) {
            UIKitIcon(
                icon = UIKitTheme.icons.icon_search,
                tint = UIKitTheme.colors.primaryColor
            )
            Spacer(modifier = Modifier.width(UIKitTheme.spacing.spacing10))
            UIKitText(
                text = placeholderText,
                style = UIKitTheme.typography.header04,
                color = UIKitTheme.colors.gray400,
            )
        }
    }
}
