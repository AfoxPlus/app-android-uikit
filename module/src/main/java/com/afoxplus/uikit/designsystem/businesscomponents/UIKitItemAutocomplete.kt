package com.afoxplus.uikit.designsystem.businesscomponents

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.afoxplus.uikit.designsystem.atoms.UIKitIcon
import com.afoxplus.uikit.designsystem.atoms.UIKitText
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme
import com.afoxplus.uikit.objects.vendor.Establishment

@Composable
fun UIKitItemAutocomplete(
    modifier: Modifier = Modifier,
    establishment: Establishment,
    onItemClick: (Establishment) -> Unit
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onItemClick(establishment) },
        verticalAlignment = Alignment.CenterVertically
    ) {
        UIKitIcon(
            modifier = Modifier
                .padding(10.dp),
            icon = UIKitTheme.icons.icon_location_outline,
            tint = UIKitTheme.colors.secondaryColor
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = UIKitTheme.spacing.spacing06)
        ) {
            UIKitText(
                text = establishment.name,
                style = UIKitTheme.typography.header05,
                color = UIKitTheme.colors.gray700,
            )

            UIKitText(
                text = establishment.description,
                style = UIKitTheme.typography.paragraph01,
                color = UIKitTheme.colors.gray500,
            )

            Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing06))
            HorizontalDivider(
                color = UIKitTheme.colors.gray200,
                thickness = 1.dp
            )
        }
    }
}