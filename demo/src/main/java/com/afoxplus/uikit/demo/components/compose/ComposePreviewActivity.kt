package com.afoxplus.uikit.demo.components.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.afoxplus.uikit.designsystem.atoms.UIKitIcon
import com.afoxplus.uikit.designsystem.atoms.UIKitText
import com.afoxplus.uikit.designsystem.businesscomponents.UIKitCategoryMap
import com.afoxplus.uikit.designsystem.businesscomponents.UIKitEstablishmentMap
import com.afoxplus.uikit.designsystem.businesscomponents.UIKitMapSearch
import com.afoxplus.uikit.designsystem.businesscomponents.UIKitProductHorizontalItem
import com.afoxplus.uikit.designsystem.businesscomponents.UIKitProductItem
import com.afoxplus.uikit.designsystem.extensions.getUIKitIcon
import com.afoxplus.uikit.designsystem.foundations.UIKitIconTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme
import com.afoxplus.uikit.objects.vendor.Establishment
import com.afoxplus.uikit.objects.vendor.RestaurantCategory

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
                            .verticalScroll(rememberScrollState())
                            .fillMaxSize()
                    ) {
                        Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing12))
                        UIKitMapSearch(
                            modifier = Modifier.padding(UIKitTheme.spacing.spacing12),
                            placeholderText = "Buscar más aquí"
                        )
                        Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing20))
                        UIKitText(text = "Hello World!", style = UIKitTheme.typography.title03)
                        UIKitIcon(icon = UIKitTheme.icons.icon_whatsapp_outline)
                        UIKitIcon(icon = UIKitIconTheme.icon_pin_location_outline)
                        UIKitIcon(icon = UIKitIconTheme.icon_calendar_small_outline)
                        getUIKitIcon("icon_trash_outline")?.let { UIKitIcon(icon = it) }
                        UIKitProductItem(
                            imageUrl = "https://static.wixstatic.com/media/8fb78d_c77b22a3f89744a4bb1329a8d5c4e2a5~mv2.jpg",
                            title = "Lomito saltado a la norteñita...",
                            description = "200 gr meat + rice lettuce + tomato...",
                            price = "S/ 22.00"
                        ) {}
                        Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing10))
                        UIKitProductHorizontalItem(
                            imageUrl = "https://static.wixstatic.com/media/8fb78d_c77b22a3f89744a4bb1329a8d5c4e2a5~mv2.jpg",
                            title = "Pure con asado de rez Pure con asado de rez Pure con asado de rez",
                            description = "Acompañado con arroz y pure de papa mas ensalada, Acompañado con arroz y pure de papa mas ensalada ,Acompañado con arroz y pure de papa mas ensalada",
                            price = "S/ 15.00"
                        ) {}
                        Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing10))
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

                        UIKitMapSearch(placeholderText = "Buscar más aquí") {

                        }

                        UIKitCategoryMap(
                            chipItems = listOf(
                                RestaurantCategory("01", false, "Cafe"),
                                RestaurantCategory("02", false, "Sandwich"),
                                RestaurantCategory("03", false, "Cevicheria"),
                                RestaurantCategory("03", false, "Criollo"),
                                RestaurantCategory("03", false, "Campestre")
                            )
                        ) {
                            println("Here is the data: $it")
                        }
                    }
                }
            }
        }
    }
}
