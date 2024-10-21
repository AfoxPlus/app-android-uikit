package com.afoxplus.uikit.designsystem.organisms

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.afoxplus.uikit.designsystem.atoms.UIKitIcon
import com.afoxplus.uikit.designsystem.atoms.UIKitStar
import com.afoxplus.uikit.designsystem.atoms.UIKitText
import com.afoxplus.uikit.designsystem.extensions.getImage
import com.afoxplus.uikit.designsystem.foundations.UIKitColorTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme
import com.afoxplus.uikit.designsystem.molecules.UIKitItemTextIcon
import com.afoxplus.uikit.objects.vendor.Establishment

@Composable
fun UiKitCardEstablishment(
    context: Context,
    modifier: Modifier = Modifier,
    establishment: Establishment,
    onClick: () -> Unit
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = UIKitTheme.shapes.small,
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(
            containerColor = UIKitTheme.colors.light01,
            contentColor = UIKitTheme.colors.light01
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = UIKitTheme.colors.light01)
        ) {
            Image(
                painter = getImage(context, establishment.imageLandscape),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(size = 150.dp),
                contentScale = ContentScale.Crop
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = UIKitTheme.colors.light01)
                    .padding(all = UIKitTheme.spacing.spacing12),
                horizontalArrangement = Arrangement.spacedBy(UIKitTheme.spacing.spacing12)
            ) {
                Column(
                    modifier = Modifier.background(color = UIKitTheme.colors.light01),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Card(
                        modifier = Modifier
                            .size(height = 60.dp, width = 60.dp),
                        colors = CardDefaults.cardColors(
                            contentColor = UIKitColorTheme.light01
                        ),
                        shape = UIKitTheme.shapes.small
                    ) {
                        Image(
                            painter = getImage(context, establishment.imagePortrait),
                            contentDescription = null,
                            modifier = Modifier.fillMaxWidth(),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Spacer(modifier = Modifier.size(UIKitTheme.spacing.spacing06))
                    UIKitText(
                        text = establishment.validateIsOpen(),
                        color = if (establishment.isOpen) UIKitTheme.colors.green700 else UIKitTheme.colors.gray500,
                        textAlign = TextAlign.Center,
                        style = UIKitTheme.typography.paragraph02Bold
                    )
                }
                Column(modifier = Modifier.background(color = UIKitTheme.colors.light01)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(UIKitTheme.spacing.spacing02),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        UIKitText(
                            text = establishment.name,
                            color = UIKitTheme.colors.secondaryColor,
                            style = UIKitTheme.typography.header02Bold,
                            overflow = TextOverflow.Ellipsis
                        )
                        if (establishment.hasSubscription) {
                            UIKitIcon(
                                icon = UIKitTheme.icons.icon_verified_solid,
                                tint = UIKitTheme.colors.primaryColor
                            )
                        }
                    }
                    UIKitText(
                        modifier = Modifier.fillMaxWidth(),
                        text = establishment.description,
                        color = UIKitTheme.colors.secondaryColor,
                        style = UIKitTheme.typography.paragraph01SemiBold
                    )
                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(UIKitTheme.spacing.spacing02)
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(UIKitTheme.spacing.spacing04)
                    ) {
                        UIKitText(
                            text = establishment.rating.toString(),
                            color = UIKitTheme.colors.secondaryColor,
                            style = UIKitTheme.typography.paragraph02
                        )
                        UIKitStar(starts = establishment.rating)
                    }
                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(UIKitTheme.spacing.spacing08)
                    )
                    UIKitItemTextIcon(
                        leftIcon = UIKitTheme.icons.icon_location_outline,
                        text = establishment.addressDescription,
                        textPaddingValues = PaddingValues(start = UIKitTheme.spacing.spacing04),
                        textStyle = UIKitTheme.typography.paragraph02,
                        textColor = UIKitTheme.colors.gray700
                    )
                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(UIKitTheme.spacing.spacing04)
                    )
                    UIKitItemTextIcon(
                        leftIcon = UIKitTheme.icons.icon_whatsapp_outline,
                        text = establishment.phoneDescription,
                        textPaddingValues = PaddingValues(start = UIKitTheme.spacing.spacing04),
                        textStyle = UIKitTheme.typography.paragraph02,
                        textColor = UIKitTheme.colors.gray700
                    )
                }
            }
        }
    }
}
