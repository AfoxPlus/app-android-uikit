package com.afoxplus.uikit.designsystem.molecules

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.afoxplus.uikit.R
import com.afoxplus.uikit.designsystem.atoms.UIKitText
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme

@Composable
fun UIKitTopBar(
    modifier: Modifier = Modifier,
    title: String,
    description: String,
    onBackAction: () -> Unit = {}
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            modifier = modifier.size(UIKitTheme.spacing.spacing44),
            onClick = { onBackAction() }
        ) {
            Icon(
                modifier = modifier.size(UIKitTheme.spacing.spacing24),
                painter = painterResource(id = R.drawable.ic_uikit_back),
                contentDescription = "uikit_icon_back",
                tint = UIKitTheme.colors.secondaryColor
            )
        }
        Spacer(modifier = Modifier.width(UIKitTheme.spacing.spacing12))
        Column(
            modifier = modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(
                UIKitTheme.spacing.default,
                Alignment.CenterVertically
            ),
            horizontalAlignment = Alignment.Start
        ) {
            UIKitText(
                text = title,
                color = UIKitTheme.colors.blueGray700,
                style = UIKitTheme.typography.paragraph01
            )
            UIKitText(
                text = description,
                style = UIKitTheme.typography.header04Bold
            )

        }

    }
}

@Preview
@Composable
internal fun ToolbarComponentPreview() {
    UIKitTheme {
        UIKitTopBar(
            title = "client",
            description = "Juan Carlos del Rio"
        )
    }
}