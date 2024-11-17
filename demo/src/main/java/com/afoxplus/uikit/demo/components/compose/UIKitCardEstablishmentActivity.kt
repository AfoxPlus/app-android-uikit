package com.afoxplus.uikit.demo.components.compose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.afoxplus.uikit.designsystem.businesscomponents.UIKitEstablishmentMap
import com.afoxplus.uikit.designsystem.businesscomponents.UIKitEstablishmentMapShimmer
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme
import com.afoxplus.uikit.designsystem.molecules.UIKitItemTextIcon
import com.afoxplus.uikit.designsystem.organisms.UIKitCardEstablishment
import com.afoxplus.uikit.objects.vendor.Establishment

class UIKitCardEstablishmentActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("TAG", "Here - onCreate: UiKitCardEstablishmentActivity")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UIKitTheme {
                Scaffold { paddingValues ->
                    Log.d("TAG", "Here - onCreate: paddingValues: $paddingValues")
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .verticalScroll(rememberScrollState())
                            .padding(paddingValues = paddingValues)
                            .padding(8.dp)
                    ) {
                        UIKitItemTextIcon(
                            modifier = Modifier
                                .background(color = UIKitTheme.colors.green700)
                                .padding(5.dp),
                            leftIcon = UIKitTheme.icons.icon_pin_location_outline,
                            text = "Hello World",
                            textPaddingValues = PaddingValues(start = 6.dp),
                            textStyle = UIKitTheme.typography.paragraph02Bold,
                            rightIcon = UIKitTheme.icons.icon_whatsapp_outline
                        )
                        Spacer(modifier = Modifier.padding(16.dp))
                        UIKitCardEstablishment(
                            establishment = Establishment(
                                imageLandscape = "https://static.bandainamcoent.eu/high/dragon-ball/dragon-ball-sparking-zero/00-page-setup/Page-Setup-Revamp/DBSZ_banner_mobile.jpg",
                                imagePortrait = "https://image.api.playstation.com/vulcan/ap/rnd/202405/2216/e6550a5a29624aee479b088bbefa4abc0097dc9253bca3d0.png",
                                name = "Kitchen Resto",
                                description = "Cafe & Resto",
                                hasSubscription = false,
                                isOpen = false,
                                rating = 4f,
                                addressDescription = "Av. Arenales 1241",
                                phoneDescription = "966885488"
                            ),
                            context = LocalContext.current
                        ) {}
                        Spacer(modifier = Modifier.padding(16.dp))
                        UIKitCardEstablishment(
                            establishment = Establishment(
                                imageLandscape = "https://static.bandainamcoent.eu/high/dragon-ball/dragon-ball-sparking-zero/00-page-setup/Page-Setup-Revamp/DBSZ_banner_mobile.jpg",
                                imagePortrait = "https://image.api.playstation.com/vulcan/ap/rnd/202405/2216/e6550a5a29624aee479b088bbefa4abc0097dc9253bca3d0.png",
                                name = "Kitchen Resto",
                                description = "Cafe & Resto",
                                hasSubscription = true,
                                isOpen = true,
                                rating = 4f,
                                addressDescription = "Av. Arenales 1241",
                                phoneDescription = "966885488"
                            ),
                            context = LocalContext.current
                        ) {}
                        Spacer(modifier = Modifier.padding(16.dp))
                        UIKitEstablishmentMap(
                            establishment = Establishment(
                                imageLandscape = "https://static.wixstatic.com/media/8fb78d_c77b22a3f89744a4bb1329a8d5c4e2a5~mv2.jpg",
                                imagePortrait = "https://static.wixstatic.com/media/8fb78d_c77b22a3f89744a4bb1329a8d5c4e2a5~mv2.jpg",
                                name = "Kitchen Resto",
                                description = "Cafe & Resto",
                                hasSubscription = true,
                                isOpen = false,
                                rating = 1f,
                                addressDescription = "Av. Arenales 1241",
                                phoneDescription = "966885488"
                            )
                        ) {}

                        Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing10))
                        UIKitEstablishmentMap(
                            establishment = Establishment(
                                imageLandscape = "https://static.wixstatic.com/media/8fb78d_c77b22a3f89744a4bb1329a8d5c4e2a5~mv2.jpg",
                                imagePortrait = "https://static.wixstatic.com/media/8fb78d_c77b22a3f89744a4bb1329a8d5c4e2a5~mv2.jpg",
                                name = "Kitchen Resto",
                                description = "Cafe & Resto",
                                hasSubscription = true,
                                isOpen = true,
                                rating = 4f,
                                addressDescription = "Av. Arenales 1241",
                                phoneDescription = "966885488"
                            )
                        ) {

                        }
                        Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing10))
                        UIKitEstablishmentMapShimmer()
                    }
                }
            }
        }
    }
}


@Composable
@Preview(backgroundColor = 0x00000000, showBackground = true)
fun UiKitCardEstablishmentPreview() {
    UIKitTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            UIKitItemTextIcon(
                modifier = Modifier
                    .background(color = UIKitTheme.colors.green700)
                    .padding(5.dp),
                leftIcon = UIKitTheme.icons.icon_pin_location_outline,
                text = "Hello World",
                textPaddingValues = PaddingValues(start = 6.dp),
                textStyle = UIKitTheme.typography.paragraph02Bold,
                rightIcon = UIKitTheme.icons.icon_whatsapp_outline
            )
            Spacer(modifier = Modifier.padding(16.dp))
            UIKitCardEstablishment(
                establishment = Establishment(
                    imageLandscape = "https://static.bandainamcoent.eu/high/dragon-ball/dragon-ball-sparking-zero/00-page-setup/Page-Setup-Revamp/DBSZ_banner_mobile.jpg",
                    imagePortrait = "https://image.api.playstation.com/vulcan/ap/rnd/202405/2216/e6550a5a29624aee479b088bbefa4abc0097dc9253bca3d0.png",
                    name = "Kitchen Resto",
                    description = "Cafe & Resto",
                    hasSubscription = false,
                    isOpen = false,
                    rating = 4f,
                    addressDescription = "Av. Arenales 1241",
                    phoneDescription = "966885488"
                ),
                context = LocalContext.current
            ) {}
            Spacer(modifier = Modifier.padding(16.dp))
            UIKitCardEstablishment(
                establishment = Establishment(
                    imageLandscape = "https://static.bandainamcoent.eu/high/dragon-ball/dragon-ball-sparking-zero/00-page-setup/Page-Setup-Revamp/DBSZ_banner_mobile.jpg",
                    imagePortrait = "https://image.api.playstation.com/vulcan/ap/rnd/202405/2216/e6550a5a29624aee479b088bbefa4abc0097dc9253bca3d0.png",
                    name = "Kitchen Resto",
                    description = "Cafe & Resto",
                    hasSubscription = true,
                    isOpen = true,
                    rating = 4f,
                    addressDescription = "Av. Arenales 1241",
                    phoneDescription = "966885488"
                ),
                context = LocalContext.current
            ) {}
        }
    }
}