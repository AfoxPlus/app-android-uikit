package com.afoxplus.uikit.designsystem.businesscomponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.afoxplus.uikit.designsystem.atoms.UIKitText
import com.afoxplus.uikit.designsystem.foundations.UIKitColorTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme

@Composable
fun UIKitCardOrderType(
    modifier: Modifier,
    orderTypeVO: UIKitOrderTypeVO,
    orderType: UIKitOrderType
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .defaultMinSize(minHeight = UIKitTheme.spacing.spacing48)
            .background(
                color = orderType.backgroundColor,
                RoundedCornerShape(UIKitTheme.spacing.spacing04)
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = UIKitTheme.spacing.spacing06,
                    vertical = UIKitTheme.spacing.spacing04
                )
                .background(color = orderType.backgroundColor)
                .align(Alignment.Center)
        ) {
            if (orderType is UIKitOrderType.Delivery) {
                UIKitText(
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = orderTypeVO.title,
                    color = orderType.textTitleColor,
                    style = UIKitTheme.typography.paragraph02
                )
            } else {
                UIKitText(
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = orderTypeVO.title,
                    color = orderType.textTitleColor,
                    style = UIKitTheme.typography.paragraph02
                )
                Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing02))
                UIKitText(
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = orderTypeVO.description ?: "",
                    color = orderType.textDescriptionColor ?: UIKitColorTheme.light01,
                    style = UIKitTheme.typography.header03Bold
                )
            }
        }
    }
}

@Preview
@Composable
internal fun CardOrderTypeComponentPreview() {
    Column {
        UIKitCardOrderType(
            modifier = Modifier.fillMaxWidth(),
            orderTypeVO = UIKitOrderTypeVO("Mesa", "01"),
            orderType = UIKitOrderType.Table()
        )
        UIKitCardOrderType(
            modifier = Modifier.fillMaxWidth(),
            orderTypeVO = UIKitOrderTypeVO("Delivery"),
            orderType = UIKitOrderType.Delivery()
        )
        UIKitCardOrderType(
            modifier = Modifier.fillMaxWidth(),
            orderTypeVO = UIKitOrderTypeVO("Total", "S/ 999.80"),
            orderType = UIKitOrderType.Amount()
        )
    }
}

data class UIKitOrderTypeVO(
    val title: String,
    val description: String? = null
)

sealed class UIKitOrderType(
    val backgroundColor: Color,
    val textTitleColor: Color,
    val textDescriptionColor: Color? = null
) {
    class Table : UIKitOrderType(
        backgroundColor = UIKitColorTheme.gray800,
        textTitleColor = UIKitColorTheme.light01,
        textDescriptionColor = UIKitColorTheme.light01
    )

    class Delivery : UIKitOrderType(
        backgroundColor = UIKitColorTheme.red600,
        textTitleColor = UIKitColorTheme.light01
    )

    class Amount : UIKitOrderType(
        backgroundColor = UIKitColorTheme.light01,
        textTitleColor = UIKitColorTheme.gray600,
        textDescriptionColor = UIKitColorTheme.secondaryColor
    )
}