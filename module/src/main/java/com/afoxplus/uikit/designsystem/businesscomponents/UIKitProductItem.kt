package com.afoxplus.uikit.designsystem.businesscomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.afoxplus.uikit.designsystem.atoms.UIKitText
import com.afoxplus.uikit.designsystem.foundations.UIKitColorTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitTypographyTheme

@Composable
fun UIKitProductItem(
    modifier: Modifier = Modifier,
    imageUrl: String,
    title: String,
    description: String,
    price: String,
) {
    Card(
        shape = RoundedCornerShape(UIKitTheme.spacing.spacing10),
        elevation = CardDefaults.cardElevation(UIKitTheme.spacing.spacing04),
        colors = CardDefaults.cardColors(containerColor = UIKitColorTheme.gray20),
        modifier = modifier
            .width(200.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            // Product Image at the Top
            AsyncImage(
                model = imageUrl,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .clip(RoundedCornerShape(topStart = UIKitTheme.spacing.spacing10, topEnd = UIKitTheme.spacing.spacing10))
            )

            Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing08))

            // Text Section (Title, Description, Price)
            Column(
                modifier = Modifier
                    .padding(UIKitTheme.spacing.spacing08)
            ) {
                UIKitText(
                    text = title,
                    style = UIKitTypographyTheme.header03SemiBold,
                    color = UIKitColorTheme.secondaryColor,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 2
                )

                Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing04))

                UIKitText(
                    text = description,
                    style = UIKitTypographyTheme.paragraph01,
                    color = UIKitColorTheme.gray700,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 2
                )

                Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing08))

                UIKitText(
                    text = price,
                    style = UIKitTypographyTheme.header03Bold,
                    color = UIKitColorTheme.primaryColor
                )
            }
        }
    }
}
