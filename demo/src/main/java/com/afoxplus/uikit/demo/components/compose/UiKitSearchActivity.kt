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
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import com.afoxplus.uikit.designsystem.businesscomponents.UIKitChipCollection
import com.afoxplus.uikit.designsystem.businesscomponents.UIKitChipCollectionShimmer
import com.afoxplus.uikit.designsystem.businesscomponents.UIKitItemAutocompleteShimmer
import com.afoxplus.uikit.designsystem.businesscomponents.UIKitMapSearch
import com.afoxplus.uikit.designsystem.businesscomponents.UIKitSearchAutocomplete
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme
import com.afoxplus.uikit.objects.vendor.ChipItem

class UiKitSearchActivity : ComponentActivity() {
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
                        UIKitMapSearch(
                            modifier = Modifier.padding(UIKitTheme.spacing.spacing12),
                            placeholderText = "Buscar más aquí"
                        )
                        Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing08))
                        val focusRequester = remember { FocusRequester() }
                        UIKitSearchAutocomplete(
                            focusRequester = focusRequester,
                            placeholder = "Buscar más aquí",
                            onBackClick = {  println("On back action") },
                            onTextClear = {  println("On onTextClear") }) {
                            println("this is a new text $it")
                        }
                        Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing08))
                        UIKitChipCollection(
                            chipItems = listOf(
                                ChipItem("01", false, "Cafe"),
                                ChipItem("02", false, "Sandwich"),
                                ChipItem("03", false, "Cevicheria"),
                                ChipItem("03", false, "Criollo"),
                                ChipItem("03", false, "Campestre")
                            )
                        ) {
                            println("Here is the data: $it")
                        }
                        Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing08))
                        UIKitChipCollectionShimmer()
                        UIKitItemAutocompleteShimmer()
                    }
                }
            }
        }
    }
}