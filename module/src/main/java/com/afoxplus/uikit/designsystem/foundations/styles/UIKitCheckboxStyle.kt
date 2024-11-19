package com.afoxplus.uikit.designsystem.foundations.styles

import androidx.compose.ui.graphics.Color
import com.afoxplus.uikit.designsystem.foundations.UIKitColorTheme

class UIKitCheckboxStyle(
    val checkedColor: Color = UIKitColorTheme.secondaryColor,
    val uncheckedColor: Color = UIKitColorTheme.secondaryColor,
    val checkmarkColor: Color = UIKitColorTheme.light01,
    val disabledCheckedColor: Color = UIKitColorTheme.gray300,
    val disabledUncheckedColor: Color = UIKitColorTheme.gray300,
    val disabledIndeterminateColor: Color = UIKitColorTheme.gray300,
    val backgroundColor: Color = UIKitColorTheme.light01
) {

    companion object {
        val checkboxDefaultStyle: UIKitCheckboxStyle
            get() = UIKitCheckboxStyle()
        val checkboxGreenStyle: UIKitCheckboxStyle
            get() = UIKitCheckboxStyle(
                checkedColor = UIKitColorTheme.green700,
                uncheckedColor = UIKitColorTheme.green700,
                checkmarkColor = UIKitColorTheme.light01,
                disabledCheckedColor = UIKitColorTheme.green300,
                disabledUncheckedColor = UIKitColorTheme.green300,
                disabledIndeterminateColor = UIKitColorTheme.green300,
                backgroundColor = UIKitColorTheme.green50
            )

        val checkboxBlueStyle: UIKitCheckboxStyle
            get() = UIKitCheckboxStyle(
                checkedColor = UIKitColorTheme.blue700,
                uncheckedColor = UIKitColorTheme.blue700,
                checkmarkColor = UIKitColorTheme.light01,
                disabledCheckedColor = UIKitColorTheme.blue300,
                disabledUncheckedColor = UIKitColorTheme.blue300,
                disabledIndeterminateColor = UIKitColorTheme.blue300,
                backgroundColor = UIKitColorTheme.blue50
            )
    }
}