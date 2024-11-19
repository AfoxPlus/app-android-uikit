package com.afoxplus.uikit.designsystem.foundations.styles

import androidx.compose.ui.graphics.Color
import com.afoxplus.uikit.designsystem.foundations.UIKitColorTheme

class UIKitRadioButtonStyle(
    val selectedColor: Color = UIKitColorTheme.secondaryColor,
    val unselectedColor: Color = UIKitColorTheme.secondaryColor,
    val disabledSelectedColor: Color = UIKitColorTheme.gray300,
    val disabledUnselectedColor: Color = UIKitColorTheme.gray300,
    val backgroundColor: Color = UIKitColorTheme.light01
) {

    companion object {
        val radioButtonDefaultStyle: UIKitRadioButtonStyle
            get() = UIKitRadioButtonStyle()

        val radioButtonGreenStyle: UIKitRadioButtonStyle
            get() = UIKitRadioButtonStyle(
                selectedColor = UIKitColorTheme.green700,
                unselectedColor = UIKitColorTheme.green700,
                disabledSelectedColor = UIKitColorTheme.green300,
                disabledUnselectedColor = UIKitColorTheme.green300,
                backgroundColor = UIKitColorTheme.green50
            )

        val radioButtonBlueStyle: UIKitRadioButtonStyle
            get() = UIKitRadioButtonStyle(
                selectedColor = UIKitColorTheme.blue700,
                unselectedColor = UIKitColorTheme.blue700,
                disabledSelectedColor = UIKitColorTheme.blue300,
                disabledUnselectedColor = UIKitColorTheme.blue300,
                backgroundColor = UIKitColorTheme.blue50
            )
    }
}