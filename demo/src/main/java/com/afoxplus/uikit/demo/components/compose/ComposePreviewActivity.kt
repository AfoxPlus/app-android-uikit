package com.afoxplus.uikit.demo.components.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.afoxplus.uikit.designsystem.atoms.UIKitCheckbox
import com.afoxplus.uikit.designsystem.atoms.UIKitIcon
import com.afoxplus.uikit.designsystem.atoms.UIKitText
import com.afoxplus.uikit.designsystem.businesscomponents.UIKitCardCheckbox
import com.afoxplus.uikit.designsystem.businesscomponents.UIKitCardRadioButton
import com.afoxplus.uikit.designsystem.extensions.getUIKitColor
import com.afoxplus.uikit.designsystem.businesscomponents.UIKitSectionTitle
import com.afoxplus.uikit.designsystem.extensions.getUIKitIcon
import com.afoxplus.uikit.designsystem.extensions.getUIKitSpacing
import com.afoxplus.uikit.designsystem.extensions.getUIKitTypography
import com.afoxplus.uikit.designsystem.foundations.UIKitIconTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme
import com.afoxplus.uikit.designsystem.foundations.styles.UIKitCheckboxStyle
import com.afoxplus.uikit.designsystem.foundations.styles.UIKitRadioButtonStyle

class ComposePreviewActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UIKitTheme {
                Scaffold { paddingValues ->
                    Column(
                        modifier = Modifier
                            .padding(paddingValues = paddingValues)
                            .padding(horizontal = getUIKitSpacing("medium"))
                            .verticalScroll(rememberScrollState())
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.spacedBy(getUIKitSpacing("spacing08"))
                    ) {
                        Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing12))
                        Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing20))
                        UIKitText(text = "Hello World!", style = UIKitTheme.typography.title03)
                        UIKitIcon(icon = UIKitTheme.icons.icon_whatsapp_outline)
                        UIKitIcon(icon = UIKitIconTheme.icon_pin_location_outline)
                        UIKitIcon(icon = UIKitIconTheme.icon_calendar_small_outline)

                        UIKitText(
                            text = "By string token",
                            style = getUIKitTypography(token = "title03"),
                            color = getUIKitColor(token = "red700")
                        )
                        UIKitIcon(icon = getUIKitIcon("icon_trash_outline"))
                        UIKitIcon(icon = getUIKitIcon("icon_dish_outline"))
                        Spacer(modifier = Modifier.height(getUIKitSpacing("extraMedium")))
                        UIKitIcon(icon = getUIKitIcon("icon_three_dots_filled"))


                        val isChecked = remember { mutableStateOf(false) }
                        val isCardChecked = remember { mutableStateOf(false) }

                        val isSelected = remember { mutableStateOf(false) }

                        UIKitCheckbox(checked = isChecked.value, onCheckedChange = {
                            isChecked.value = it
                        })

                        UIKitCardCheckbox(
                            checked = isCardChecked.value,
                            text = "Prueba",
                            onCheckedChange = {
                                isCardChecked.value = it
                            })


                        UIKitCardCheckbox(
                            checked = false,
                            text = "Efectivo",
                            checkboxStyle = UIKitCheckboxStyle.checkboxGreenStyle,
                            onCheckedChange = {

                            })

                        UIKitCardRadioButton(
                            selected = isSelected.value,
                            text = "Tarjeta",
                            onClick = {
                                isSelected.value = !isSelected.value
                            })

                        UIKitCardRadioButton(
                            selected = false,
                            text = "Plin",
                            radioButtonStyle = UIKitRadioButtonStyle.radioButtonBlueStyle,
                            onClick = {

                            })

                        UIKitSectionTitle(
                            modifier = Modifier.fillMaxWidth(),
                            title = "Establecimiento"
                        )

                        UIKitSectionTitle(
                            modifier = Modifier.fillMaxWidth(),
                            title = "Menu",
                            iconToken = "icon_dish_outline",
                            backgroundToken = "gray100",
                            contentColorToken = "gray700"
                        )
                    }
                }
            }
        }
    }
}
