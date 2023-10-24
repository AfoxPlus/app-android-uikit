package com.afoxplus.uikit.designsystem.foundations.primitives

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.afoxplus.uikit.designsystem.foundations.BlueGray900
import com.afoxplus.uikit.designsystem.foundations.Mulish

data class Typography internal constructor(
    val fontSize: TextUnit,
    val fontWeight: FontWeight,
    val font: FontFamily = Mulish,
    val letterSpacingPercentage: Float = 0f
) {

    fun asTextStyle(
        color: Color = BlueGray900
    ) = TextStyle(
        color = color,
        fontFamily = font,
        fontSize = fontSize,
        fontWeight = fontWeight,
        letterSpacing = getLetterSpacingInSp()
    )

    fun getLetterSpacingInSp() = (letterSpacingPercentage / 100f * fontSize.value).sp
}

