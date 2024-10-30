package com.afoxplus.uikit.demo.components.compose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.afoxplus.uikit.designsystem.atoms.UIKitButton
import com.afoxplus.uikit.designsystem.atoms.UIKitButtonStatus
import com.afoxplus.uikit.designsystem.atoms.UIKitButtonType
import com.afoxplus.uikit.designsystem.atoms.UIKitText
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme

class UIKitButtonsActivity : ComponentActivity() {

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
                            .padding(8.dp),
                        verticalArrangement = Arrangement.spacedBy(UIKitTheme.spacing.spacing08)
                    ) {
                        UIKitButtonsBase()
                    }
                }
            }
        }
    }
}

@Composable
@Preview(backgroundColor = 0x00000000, showBackground = true, showSystemUi = true)
fun UIKitButtonsPreview() {
    UIKitTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(UIKitTheme.spacing.spacing08)
        ) {
            UIKitButtonsBase()
        }
    }
}

@Composable
fun UIKitButtonsBase() {
    UIKitText(
        text = "OutlineLarge",
        modifier = Modifier.background(color = UIKitTheme.colors.green700),
        color = UIKitTheme.colors.light01
    )
    UIKitText(text = "Active", modifier = Modifier.padding(start = 15.dp))
    UIKitButton(
        modifier = Modifier.fillMaxWidth(),
        text = "Ir al inicio",
        type = UIKitButtonType.OutlineLarge(status = UIKitButtonStatus.ACTIVE)
    ) { }
    UIKitText(text = "Disable", modifier = Modifier.padding(start = 15.dp))
    UIKitButton(
        modifier = Modifier.fillMaxWidth(),
        text = "Ir al inicio",
        type = UIKitButtonType.OutlineLarge(status = UIKitButtonStatus.DISABLED)
    ) { }
    UIKitText(text = "Loading", modifier = Modifier.padding(start = 15.dp))
    UIKitButton(
        modifier = Modifier.fillMaxWidth(),
        type = UIKitButtonType.OutlineLarge(status = UIKitButtonStatus.LOADING)
    ) { }


    UIKitText(
        text = "FilledLarge",
        modifier = Modifier.background(color = UIKitTheme.colors.green700),
        color = UIKitTheme.colors.light01
    )
    UIKitText(text = "Active", modifier = Modifier.padding(start = 15.dp))
    UIKitButton(
        modifier = Modifier.fillMaxWidth(),
        text = "Hacer otro pedido",
        type = UIKitButtonType.FilledLarge(status = UIKitButtonStatus.ACTIVE)
    ) { }
    UIKitText(text = "Disable", modifier = Modifier.padding(start = 15.dp))
    UIKitButton(
        modifier = Modifier.fillMaxWidth(),
        text = "Hacer otro pedido",
        type = UIKitButtonType.FilledLarge(status = UIKitButtonStatus.DISABLED)
    ) { }
    UIKitText(text = "Loading", modifier = Modifier.padding(start = 15.dp))
    UIKitButton(
        modifier = Modifier.fillMaxWidth(),
        type = UIKitButtonType.FilledLarge(status = UIKitButtonStatus.LOADING)
    ) { }


    UIKitText(
        text = "OutlineMedium",
        modifier = Modifier.background(color = UIKitTheme.colors.green700),
        color = UIKitTheme.colors.light01
    )
    UIKitText(text = "Active", modifier = Modifier.padding(start = 15.dp))
    UIKitButton(
        modifier = Modifier.fillMaxWidth(),
        text = "No, continuar pedido",
        type = UIKitButtonType.OutlineMedium(status = UIKitButtonStatus.ACTIVE)
    ) { }
    UIKitText(text = "Disable", modifier = Modifier.padding(start = 15.dp))
    UIKitButton(
        modifier = Modifier.fillMaxWidth(),
        text = "No, continuar pedido",
        type = UIKitButtonType.OutlineMedium(status = UIKitButtonStatus.DISABLED)
    ) { }
    UIKitText(text = "Loading", modifier = Modifier.padding(start = 15.dp))
    UIKitButton(
        modifier = Modifier.fillMaxWidth(),
        type = UIKitButtonType.OutlineMedium(status = UIKitButtonStatus.LOADING)
    ) { }


    UIKitText(
        text = "FilledMedium",
        modifier = Modifier.background(color = UIKitTheme.colors.green700),
        color = UIKitTheme.colors.light01
    )
    UIKitText(text = "Active", modifier = Modifier.padding(start = 15.dp))
    UIKitButton(
        modifier = Modifier.fillMaxWidth(),
        text = "Entendido",
        type = UIKitButtonType.FilledMedium(status = UIKitButtonStatus.ACTIVE)
    ) { }
    UIKitText(text = "Disable", modifier = Modifier.padding(start = 15.dp))
    UIKitButton(
        modifier = Modifier.fillMaxWidth(),
        text = "Entendido",
        type = UIKitButtonType.FilledMedium(status = UIKitButtonStatus.DISABLED)
    ) { }
    UIKitText(text = "Loading", modifier = Modifier.padding(start = 15.dp))
    UIKitButton(
        modifier = Modifier.fillMaxWidth(),
        type = UIKitButtonType.FilledMedium(status = UIKitButtonStatus.LOADING)
    ) { }


    UIKitText(
        text = "OutlineSmall",
        modifier = Modifier.background(color = UIKitTheme.colors.green700),
        color = UIKitTheme.colors.light01
    )
    UIKitText(text = "Active", modifier = Modifier.padding(start = 15.dp))
    UIKitButton(
        modifier = Modifier
            .width(83.dp)
            .height(31.dp),
        text = "Probar",
        type = UIKitButtonType.OutlineSmall(status = UIKitButtonStatus.ACTIVE)
    ) { }

    UIKitText(text = "Active - Modificado", modifier = Modifier.padding(start = 15.dp))
    UIKitButton(
        modifier = Modifier
            .width(83.dp)
            .height(31.dp),
        type = UIKitButtonType.OutlineSmall(status = UIKitButtonStatus.ACTIVE),
        text = "Probar",
        textStyle = UIKitTheme.typography.paragraph02,
        textColor = UIKitTheme.colors.secondaryColor,
        buttonColor = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = Color.Transparent
        ),
        buttonBorder = BorderStroke(
            width = UIKitTheme.spacing.spacing01,
            color = UIKitTheme.colors.secondaryColor
        ),
        onClick = { })

    UIKitText(
        text = "FilledSmall",
        modifier = Modifier.background(color = UIKitTheme.colors.green700),
        color = UIKitTheme.colors.light01
    )
    UIKitText(text = "Active", modifier = Modifier.padding(start = 15.dp))
    UIKitButton(
        modifier = Modifier
            .width(83.dp)
            .height(31.dp),
        text = "Probar",
        type = UIKitButtonType.FilledSmall(status = UIKitButtonStatus.ACTIVE)
    ) { }
}