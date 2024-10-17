package com.afoxplus.uikit.designsystem.businesscomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
    price: String
) {
    Card(
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(UIKitTheme.spacing.spacing04),
        colors = CardDefaults.cardColors(containerColor = UIKitColorTheme.gray20),
        modifier = modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            // Image Section
            AsyncImage(
                model = imageUrl,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(topStart = 8.dp, bottomStart = 8.dp))
            )

            Spacer(modifier = Modifier.width(8.dp))

            // Text and Price Section
            Column(
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterVertically)
                    .padding(start = 12.dp, end = 12.dp, top = 8.dp, bottom = 8.dp)
            ) {
                UIKitText(
                    text = title,
                    style = UIKitTypographyTheme.header04SemiBold,
                    color = UIKitColorTheme.secondaryColor
                )
                Spacer(modifier = Modifier.height(4.dp))
                UIKitText(
                    text = description,
                    style = UIKitTypographyTheme.paragraph01,
                    color = UIKitColorTheme.gray700,
                    maxLines = 1
                )
                Spacer(modifier = Modifier.height(8.dp))
                UIKitText(
                    text = price,
                    style = UIKitTypographyTheme.header03Bold,
                    color = UIKitColorTheme.primaryColor,
                )
            }
        }
    }
}
