package com.afoxplus.uikit.designsystem.businesscomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextOverflow
import coil.compose.AsyncImage
import com.afoxplus.uikit.designsystem.atoms.UIKitText
import com.afoxplus.uikit.designsystem.foundations.UIKitColorTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitTypographyTheme

@Composable
fun UIKitProductHorizontalItem(
    modifier: Modifier = Modifier,
    imageUrl: String,
    title: String,
    description: String,
    price: String,
    onClick: () -> Unit
) {
    Card(
        shape = RoundedCornerShape(UIKitTheme.spacing.spacing08),
        elevation = CardDefaults.cardElevation(UIKitTheme.spacing.spacing04),
        colors = CardDefaults.cardColors(containerColor = UIKitColorTheme.gray20),
        modifier = modifier
            .fillMaxWidth(),
        onClick = { onClick() }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(intrinsicSize = IntrinsicSize.Min)
        ) {
            // Image Section
            AsyncImage(
                model = imageUrl,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(116.dp)
                    .fillMaxHeight()
                    .clip(
                        RoundedCornerShape(
                            topStart = UIKitTheme.spacing.spacing08,
                            bottomStart = UIKitTheme.spacing.spacing08
                        )
                    )
            )

            Spacer(modifier = Modifier.width(UIKitTheme.spacing.spacing08))

            // Text and Price Section
            Column(
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterVertically)
                    .padding(
                        start = UIKitTheme.spacing.spacing12,
                        end = UIKitTheme.spacing.spacing12,
                        top = UIKitTheme.spacing.spacing08,
                        bottom = UIKitTheme.spacing.spacing08
                    )
            ) {
                UIKitText(
                    text = title,
                    style = UIKitTypographyTheme.header04SemiBold,
                    color = UIKitColorTheme.secondaryColor,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                )
                Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing04))
                UIKitText(
                    text = description,
                    style = UIKitTypographyTheme.paragraph01,
                    color = UIKitColorTheme.gray700,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 3,

                    )
                Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing08))
                UIKitText(
                    text = price,
                    style = UIKitTypographyTheme.header03Bold,
                    color = UIKitColorTheme.primaryColor,
                )
            }
        }
    }
}
