package com.afoxplus.uikit.demo.components.quantitybutton

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.afoxplus.uikit.customview.quantitybutton.ButtonType
import com.afoxplus.uikit.demo.databinding.ActivityQuantityButtonBinding
import com.afoxplus.uikit.objects.vendor.Vendor
import com.afoxplus.uikit.objects.vendor.VendorShared
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class QuantityButtonActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuantityButtonBinding

    @Inject
    lateinit var vendorAction: VendorShared

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuantityButtonBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initComponents()

        //Example Vendor Inject
        println("Here - QuantityButtonActivity: ${vendorAction.fetch()}")
        vendorAction.save(Vendor("789456", "123456"))
    }

    private fun initComponents() {
        binding.quantityButtonDelete.onDeleteActionListener = {
            println("Here on delete action listener")
        }

        binding.quantityButtonEditable.onEditActionListener = {
            println("Here on edit action listener")
        }

        binding.quantityButtonQuantity.onValueChangeListener = {
            println("Here on value change: $it")
        }

        binding.quantityButtonQuantity.onDeleteActionListener = {
            println("Here on delete action listener")
        }

        binding.quantityButtonEnableAction.setOnClickListener {
            binding.quantityButtonEnableType.isEnable = !binding.quantityButtonEnableType.isEnable
            binding.quantityButtonEnableAction.text = if (binding.quantityButtonEnableType.isEnable) "Deshabilitar" else "Habilitar"
        }

        binding.quantityButtonDynamicQuantity.value = 2

        binding.quantityButtonDynamicType.buttonType = ButtonType.DELETE

    }
}