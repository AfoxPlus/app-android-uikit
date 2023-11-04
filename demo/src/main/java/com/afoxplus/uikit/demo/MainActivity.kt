package com.afoxplus.uikit.demo

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.afoxplus.uikit.demo.components.alert.AlertsActivity
import com.afoxplus.uikit.demo.components.edittext.EditTextActivity
import com.afoxplus.uikit.demo.components.modal.ModalActivity
import com.afoxplus.uikit.demo.components.quantitybutton.QuantityButtonActivity
import com.afoxplus.uikit.demo.databinding.ActivityMainBinding
import com.afoxplus.uikit.designsystem.atoms.UIKitText
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme
import com.afoxplus.uikit.objects.vendor.VendorShared

import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var vendorAction: VendorShared

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UIKitTheme {
                Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
                    UIKitText(text = "Hello World!", style = UIKitTheme.typography.title03)
                }
            }
        }

        /* binding = ActivityMainBinding.inflate(layoutInflater)
         setContentView(binding.root)
         loadComponents()
         //Example Vendor Inject
         vendorAction.save(Vendor("121", "212"))
         println("Here - MainActivity: ${vendorAction.fetch()}")*/
    }

    private fun loadComponents() {
        binding.openQuantity.setOnClickListener {
            startActivity(Intent(this, QuantityButtonActivity::class.java))
        }
        binding.openEditText.setOnClickListener {
            startActivity(Intent(this, EditTextActivity::class.java))
        }

        binding.openModal.setOnClickListener {
            startActivity(Intent(this, ModalActivity::class.java))
        }

        binding.openAlerts.setOnClickListener {
            startActivity(Intent(this, AlertsActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        //Example Vendor Inject
        println("Here - onResume MainActivity: ${vendorAction.fetch()}")
    }
}