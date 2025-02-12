package com.afoxplus.uikit.designsystem.atoms

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme

@Composable
fun UIKitChip(
    modifier: Modifier = Modifier,
    text: String,
    isSelected: Boolean = false,
    onChipClick: () -> Unit
) {
    val backgroundColor =
        if (isSelected) UIKitTheme.colors.secondaryColor else UIKitTheme.colors.light01
    val textColor = if (isSelected) UIKitTheme.colors.light01 else UIKitTheme.colors.secondaryColor

    Surface(
        shape = UIKitTheme.shapes.smallMedium,
        color = backgroundColor,
        shadowElevation = 4.dp,
        modifier = modifier
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null, onClick = onChipClick
            ),
    ) {
        Box(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 4.dp),
            contentAlignment = Alignment.Center
        ) {
            UIKitText(
                text = text,
                style = UIKitTheme.typography.paragraph01Bold,
                color = textColor,
            )
        }
    }
}

@Composable
fun UIKitChipShimmer() {
    Surface(
        shape = UIKitTheme.shapes.smallMedium,
        modifier = Modifier
            .height(24.dp)
            .width(92.dp)
    ) {
        ShimmerPlaceholder {
            Box(modifier = Modifier.fillMaxSize()) {
            }
        }
    }
}