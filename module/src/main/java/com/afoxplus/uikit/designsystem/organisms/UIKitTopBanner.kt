package com.afoxplus.uikit.designsystem.organisms

import android.content.Context
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.afoxplus.uikit.designsystem.atoms.UIKitButton
import com.afoxplus.uikit.designsystem.atoms.UIKitButtonStatus
import com.afoxplus.uikit.designsystem.atoms.UIKitButtonType
import com.afoxplus.uikit.designsystem.atoms.UIKitText
import com.afoxplus.uikit.designsystem.extensions.getImage
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme
import com.afoxplus.uikit.objects.vendor.Banner

@Composable
fun UIKitTopBanner(
    context: Context,
    banner: Banner,
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues = PaddingValues(
        vertical = UIKitTheme.spacing.spacing16,
        horizontal = UIKitTheme.spacing.spacing16
    ),
    colorBackground: Color = UIKitTheme.colors.yellow100,
    shape: Shape = RoundedCornerShape(UIKitTheme.spacing.spacing00),
    widthImage: Dp = 180.dp,
    heightImage: Dp = 80.dp,
    alignmentImage: Alignment = Alignment.BottomEnd,
    paddingImage: PaddingValues = PaddingValues(bottom = UIKitTheme.spacing.spacing03),
    backgroundImage: Color = Color.Transparent,
    contextScaleImage: ContentScale = ContentScale.Fit
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .border(
                shape = shape,
                border = BorderStroke(
                    width = UIKitTheme.spacing.spacing00,
                    color = Color.Transparent
                )
            )
            .background(color = colorBackground)
    ) {
        Row {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(3f)
                    .padding(paddingValues = paddingValues)
            ) {
                UIKitText(
                    text = banner.title,
                    style = UIKitTheme.typography.header02,
                    color = UIKitTheme.colors.secondaryColor
                )
                Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing16))
                UIKitText(
                    text = banner.subtitle,
                    style = UIKitTheme.typography.paragraph01,
                    color = UIKitTheme.colors.secondaryColor
                )
                Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing16))
                UIKitButton(
                    modifier = Modifier
                        .width(83.dp)
                        .height(31.dp),
                    type = UIKitButtonType.OutlineSmall(status = UIKitButtonStatus.ACTIVE),
                    text = banner.buttonText,
                    textStyle = UIKitTheme.typography.paragraph02,
                    textColor = UIKitTheme.colors.secondaryColor,
                    buttonColor = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent,
                        contentColor = Color.Transparent
                    ),
                    buttonBorder = BorderStroke(
                        width = UIKitTheme.spacing.spacing01,
                        color = UIKitTheme.colors.secondaryColor
                    ),
                    onClick = { })
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(paddingValues = paddingValues)
            ) {

            }
        }

        Image(
            painter = getImage(context, banner.imageUrl),
            contentDescription = banner.title,
            modifier = Modifier
                .size(width = widthImage, height = heightImage)
                .align(alignment = alignmentImage)
                .padding(paddingValues = paddingImage)
                .background(color = backgroundImage),
            contentScale = contextScaleImage,
            alignment = Alignment.BottomEnd,

            )
    }
}