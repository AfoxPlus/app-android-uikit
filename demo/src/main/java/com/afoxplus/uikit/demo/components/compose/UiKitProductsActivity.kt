package com.afoxplus.uikit.demo.components.compose

import android.os.Bundle
import android.util.Log
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
import androidx.compose.ui.Modifier
import com.afoxplus.uikit.designsystem.businesscomponents.UIKitProductItem
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme
import com.afoxplus.uikit.designsystem.businesscomponents.UIKitProductHorizontalItem
import com.afoxplus.uikit.designsystem.businesscomponents.UIKitProductItem

class UiKitProductsActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("TAG", "Here - onCreate: UiKitProductsActivity")
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
                    }
                }
            }
        }
    }
}
