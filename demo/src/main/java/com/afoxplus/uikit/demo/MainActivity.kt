package com.afoxplus.uikit.demo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.afoxplus.uikit.demo.components.alert.AlertsActivity
import com.afoxplus.uikit.demo.components.compose.ComposePreviewActivity
import com.afoxplus.uikit.demo.components.compose.UIKitCardEstablishmentActivity
import com.afoxplus.uikit.demo.components.compose.UIKitTopBannerActivity
import com.afoxplus.uikit.demo.components.edittext.EditTextActivity
import com.afoxplus.uikit.demo.components.modal.ModalActivity
import com.afoxplus.uikit.demo.components.quantitybutton.QuantityButtonActivity
import com.afoxplus.uikit.demo.databinding.ActivityMainBinding
import com.afoxplus.uikit.objects.vendor.Vendor
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
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadComponents()
        //Example Vendor Inject
        vendorAction.save(Vendor("121", "212"))
        println("Here - MainActivity: ${vendorAction.fetch()}")
    }

    private fun loadComponents() {
        with(binding) {
            openQuantity.setOnClickListener {
                startActivity(Intent(this@MainActivity, QuantityButtonActivity::class.java))
            }
            openEditText.setOnClickListener {
                startActivity(Intent(this@MainActivity, EditTextActivity::class.java))
            }

            openModal.setOnClickListener {
                startActivity(Intent(this@MainActivity, ModalActivity::class.java))
            }

            openAlerts.setOnClickListener {
                startActivity(Intent(this@MainActivity, AlertsActivity::class.java))
            }

            openCompose.setOnClickListener {
                startActivity(Intent(this@MainActivity, ComposePreviewActivity::class.java))
            }

            bEstablishmentPreview.setOnClickListener {
                startActivity(Intent(this@MainActivity, UIKitCardEstablishmentActivity::class.java))
            }

            bTopBannerPreview.setOnClickListener {
                startActivity(Intent(this@MainActivity, UIKitTopBannerActivity::class.java))
            }
        }
    }

    override fun onResume() {
        super.onResume()
        //Example Vendor Inject
        println("Here - onResume MainActivity: ${vendorAction.fetch()}")
    }
}