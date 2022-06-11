package com.afoxplus.uikit.demo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.afoxplus.uikit.demo.components.quantitybutton.QuantityButtonActivity
import com.afoxplus.uikit.demo.databinding.ActivityMainBinding
import com.afoxplus.uikit.objects.vendor.Vendor
import com.afoxplus.uikit.objects.vendor.VendorAction
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var vendorAction: VendorAction

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
        binding.openQuantity.setOnClickListener {
            startActivity(Intent(this, QuantityButtonActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        //Example Vendor Inject
        println("Here - onResume MainActivity: ${vendorAction.fetch()}")
    }
}