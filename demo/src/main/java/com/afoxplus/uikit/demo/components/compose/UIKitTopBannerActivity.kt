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
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme
import com.afoxplus.uikit.designsystem.organisms.UIKitTopBanner
import com.afoxplus.uikit.objects.vendor.Banner

class UIKitTopBannerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("TAG", "Here - onCreate: UiKitCardEstablishmentActivity")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UIKitTheme {
                Scaffold { paddingValues ->
                    Log.d("TAG", "Here - onCreate: paddingValues: $paddingValues")
                    UIKitTopBannerBase()
                }
            }
        }
    }
}

@Composable
@Preview(backgroundColor = 0x00000000, showBackground = true, showSystemUi = true)
fun UIKitTopBannerPreview() {
    UIKitTheme {
        UIKitTopBannerBase()
    }
}

@Composable
fun UIKitTopBannerBase() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        UIKitTopBanner(
            context = LocalContext.current,
            banner = Banner(
                title = "Busca tu restaurante favorito",
                subtitle = "Todos los restaurantes cerca de ti Encuéntralos Aquí",
                imageUrl = "https://static.vecteezy.com/system/resources/previews/047/554/336/non_2x/three-hamburgers-with-lettuce-tomato-and-cheese-png.png",
                buttonText = "Probar"
            )
        )
        Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing16))
        UIKitTopBanner(
            context = LocalContext.current,
            banner = Banner(
                title = "Busca tu restaurante favorito",
                subtitle = "Todos los restaurantes cerca de ti Encuéntralos Aquí",
                imageUrl = "https://freshburger.ca/wp-content/uploads/2020/09/highcompress_Kenix-Angus.png",
                buttonText = "Probar"
            )
        )
        Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing16))
        UIKitTopBanner(
            context = LocalContext.current,
            banner = Banner(
                title = "Busca tu restaurante favorito y disfruta de los mejores descuentos.",
                subtitle = "Todos los restaurantes cerca de ti, encuéntralos aquí y haz tu pedido.",
                imageUrl = "https://static.vecteezy.com/system/resources/previews/047/554/336/non_2x/three-hamburgers-with-lettuce-tomato-and-cheese-png.png",
                buttonText = "Probar"
            )
        )
    }
}