package com.afoxplus.uikit.demo.components.compose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.afoxplus.uikit.designsystem.atoms.UIKitIcon
import com.afoxplus.uikit.designsystem.atoms.UIKitText
import com.afoxplus.uikit.designsystem.extensions.getUIKitIcon
import com.afoxplus.uikit.designsystem.foundations.UIKitIconTheme
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme

class ComposePreviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UIKitTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
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