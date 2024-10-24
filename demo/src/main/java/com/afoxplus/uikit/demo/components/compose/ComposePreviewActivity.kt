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
import androidx.compose.ui.Modifier
import com.afoxplus.uikit.designsystem.atoms.UIKitIcon
import com.afoxplus.uikit.designsystem.atoms.UIKitText
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
                            .verticalScroll(rememberScrollState())
                            .fillMaxSize()
                    ) {
                        Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing12))
                        Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing20))
                        UIKitText(text = "Hello World!", style = UIKitTheme.typography.title03)
                        UIKitIcon(icon = UIKitTheme.icons.icon_whatsapp_outline)
                        UIKitIcon(icon = UIKitIconTheme.icon_pin_location_outline)
                        UIKitIcon(icon = UIKitIconTheme.icon_calendar_small_outline)
                        getUIKitIcon("icon_trash_outline")?.let { UIKitIcon(icon = it) }
                    }
                }
            }
        }
    }
}
