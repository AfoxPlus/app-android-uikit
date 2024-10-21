package com.afoxplus.uikit.designsystem.atoms

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme

@Composable
fun UIKitStar(
    modifier: Modifier = Modifier,
    starts: Float
) {
    val totalStars = 5

    if (starts in 0.0..5.0) {
        val stars = starts.toInt()
        Row(modifier = modifier) {
            repeat(totalStars.downTo(1).count()) {
                UIKitIcon(
                    icon = UIKitTheme.icons.icon_star_disable,
                    tint = if (it < stars) UIKitTheme.colors.yellow400 else UIKitTheme.colors.gray200
                )
            }
        }
    }
}