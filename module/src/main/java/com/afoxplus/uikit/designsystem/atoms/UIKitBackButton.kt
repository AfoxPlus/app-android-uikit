package com.afoxplus.uikit.designsystem.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import com.afoxplus.uikit.designsystem.foundations.UIKitColorTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitIconTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme

@Composable
fun UIKitBackButton(modifier: Modifier = Modifier, onClick: () -> Unit) {
    Box(
        modifier = modifier
            .clickable { onClick() }
            .clip(RoundedCornerShape(UIKitTheme.spacing.spacing08))
            .background(
                UIKitColorTheme.light01.copy(alpha = 0.8f)
            )
    ) {
        UIKitIcon(
            modifier = Modifier.padding(UIKitTheme.spacing.spacing08),
            icon = UIKitIconTheme.icon_back
        )
    }
}