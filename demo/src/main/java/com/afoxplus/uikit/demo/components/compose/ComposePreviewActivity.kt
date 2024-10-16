package com.afoxplus.uikit.demo.components.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.afoxplus.uikit.designsystem.atoms.UIKitIcon
import com.afoxplus.uikit.designsystem.atoms.UIKitText
import com.afoxplus.uikit.designsystem.businesscomponents.UIKitProductHorizontalItem
import com.afoxplus.uikit.designsystem.businesscomponents.UIKitProductItem
import com.afoxplus.uikit.designsystem.extensions.getUIKitIcon
import com.afoxplus.uikit.designsystem.foundations.UIKitIconTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme

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
                            .fillMaxSize()
                    ) {
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
                        )
                        UIKitProductHorizontalItem(
                            imageUrl = "https://static.wixstatic.com/media/8fb78d_c77b22a3f89744a4bb1329a8d5c4e2a5~mv2.jpg",
                            title = "Pure con asado de rez Pure con asado de rez Pure con asado de rez",
                            description = "Acompañado con arroz y pure de papa mas ensalada, Acompañado con arroz y pure de papa mas ensalada ,Acompañado con arroz y pure de papa mas ensalada",
                            price = "S/ 15.00"
                        )
                    }
                }
            }
        }
    }
}