package com.afoxplus.uikit.demo.components.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
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
import com.afoxplus.uikit.designsystem.foundations.UIKitColorTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitIconTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitTypographyTheme
import com.afoxplus.uikit.designsystem.foundations.styles.UIKitCheckboxStyle
import com.afoxplus.uikit.designsystem.foundations.styles.UIKitRadioButtonStyle
import com.afoxplus.uikit.designsystem.molecules.UIKitItemVerticalPhotoGrid

class ComposePreviewActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UIKitTheme {
                Scaffold { paddingValues ->
                    val isChecked = remember { mutableStateOf(false) }
                    val isCardChecked = remember { mutableStateOf(false) }
                    val isSelected = remember { mutableStateOf(false) }
                    LazyColumn(
                        modifier = Modifier
                            .padding(paddingValues = paddingValues)
                            .padding(horizontal = getUIKitSpacing("medium"))
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.spacedBy(getUIKitSpacing("spacing08"))
                    ) {
                        item { Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing12)) }

                        item { Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing20)) }

                        item {
                            UIKitText(
                                text = "Hello World!",
                                style = UIKitTheme.typography.title03
                            )
                        }
                        item { UIKitIcon(icon = UIKitTheme.icons.icon_whatsapp_outline) }
                        item { UIKitIcon(icon = UIKitIconTheme.icon_pin_location_outline) }
                        item { UIKitIcon(icon = UIKitIconTheme.icon_calendar_small_outline) }

                        item {
                            UIKitText(
                                text = "By string token",
                                style = getUIKitTypography(token = "title03"),
                                color = getUIKitColor(token = "red700")
                            )
                        }
                        item { UIKitIcon(icon = getUIKitIcon("icon_trash_outline")) }
                        item { UIKitIcon(icon = getUIKitIcon("icon_dish_outline")) }
                        item { Spacer(modifier = Modifier.height(getUIKitSpacing("extraMedium"))) }
                        item { UIKitIcon(icon = getUIKitIcon("icon_three_dots_filled")) }

                        item {
                            UIKitItemVerticalPhotoGrid(
                                photos = listOf(
                                    "https://comedera.com/wp-content/uploads/sites/9/2022/05/Arroz-con-pato-peruano-shutterstock_1846729603.jpg",
                                    "https://cdn.recetasderechupete.com/wp-content/uploads/2020/11/Tallarines-rojos-con-pollo.jpg",
                                    "https://static.wixstatic.com/media/9755d8_a1a612def03a4b3e885d421ec3edf0c6~mv2.png/v1/fill/w_568,h_320,al_c,q_85,usm_0.66_1.00_0.01,enc_auto/9755d8_a1a612def03a4b3e885d421ec3edf0c6~mv2.png",
                                    "https://comedera.com/wp-content/uploads/sites/9/2022/05/Arroz-con-pato-peruano-shutterstock_1846729603.jpg",
                                    "https://cdn.recetasderechupete.com/wp-content/uploads/2020/11/Tallarines-rojos-con-pollo.jpg",
                                    "https://comedera.com/wp-content/uploads/sites/9/2022/05/Arroz-con-pato-peruano-shutterstock_1846729603.jpg",
                                    "https://cdn.recetasderechupete.com/wp-content/uploads/2020/11/Tallarines-rojos-con-pollo.jpg",
                                    "https://static.wixstatic.com/media/9755d8_a1a612def03a4b3e885d421ec3edf0c6~mv2.png/v1/fill/w_568,h_320,al_c,q_85,usm_0.66_1.00_0.01,enc_auto/9755d8_a1a612def03a4b3e885d421ec3edf0c6~mv2.png"
                                ), onPhotoClick = {})
                        }
                        item {
                            UIKitCheckbox(checked = isChecked.value, onCheckedChange = {
                                isChecked.value = it
                            })
                        }

                        item {
                            UIKitCardCheckbox(
                                checked = isCardChecked.value,
                                text = "Prueba",
                                onCheckedChange = {
                                    isCardChecked.value = it
                                })
                        }


                        item {
                            UIKitCardCheckbox(
                                checked = false,
                                text = "Efectivo",
                                checkboxStyle = UIKitCheckboxStyle.checkboxGreenStyle,
                                onCheckedChange = {

                                })
                        }

                        item {
                            UIKitCardRadioButton(
                                selected = isSelected.value,
                                text = "Tarjeta",
                                onClick = {
                                    isSelected.value = !isSelected.value
                                })
                        }

                        item {
                            UIKitCardRadioButton(
                                selected = false,
                                text = "Plin",
                                radioButtonStyle = UIKitRadioButtonStyle.radioButtonBlueStyle,
                                onClick = {

                                })
                        }

                        item {
                            UIKitSectionTitle(
                                modifier = Modifier.fillMaxWidth(),
                                title = "Establecimiento"
                            )
                        }

                        item {
                            UIKitSectionTitle(
                                modifier = Modifier.fillMaxWidth(),
                                title = "Menu",
                                iconToken = "icon_dish_outline",
                                backgroundToken = "gray100",
                                contentColorToken = "gray700"
                            )
                        }

                        item {
                            UIKitText(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
                                maxLines = 2,
                                colorExpandableText = UIKitColorTheme.primaryColor,
                                styleExpandableText = UIKitTypographyTheme.header02Bold
                            )
                        }
                    }
                }
            }
        }
    }
}
