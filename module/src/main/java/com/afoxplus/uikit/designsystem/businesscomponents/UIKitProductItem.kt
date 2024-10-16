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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.afoxplus.uikit.designsystem.atoms.UIKitText
import com.afoxplus.uikit.designsystem.foundations.UIKitColorTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitTypographyTheme


@Composable
fun UIKitProductItem(
    imageUrl: String,
    title: String,
    description: String,
    price: String,
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        modifier = Modifier
            .width(200.dp)
            .padding(8.dp)
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
                    .clip(RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp))
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Text Section (Title, Description, Price)
            Column(
                modifier = Modifier
                    .padding(8.dp)
            ) {
                UIKitText(
                    text = title,
                    style = UIKitTypographyTheme.header03SemiBold,
                    color = UIKitColorTheme.secondaryColor,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 2
                )

                Spacer(modifier = Modifier.height(4.dp))

                UIKitText(
                    text = description,
                    style = UIKitTypographyTheme.paragraph01,
                    color = UIKitColorTheme.gray700,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 2
                )

                Spacer(modifier = Modifier.height(8.dp))

                UIKitText(
                    text = price,
                    style = UIKitTypographyTheme.header03,
                    color = UIKitColorTheme.primaryColor
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun UIKitProductItemPreview() {
    UIKitTheme {
        UIKitProductItem(
            imageUrl = "https://via.placeholder.com/150",
            title = "Lomito saltado a la norteñita...",
            description = "200 gr meat + rice lettuce + tomato...",
            price = "S/ 22.00"
        )
    }

}