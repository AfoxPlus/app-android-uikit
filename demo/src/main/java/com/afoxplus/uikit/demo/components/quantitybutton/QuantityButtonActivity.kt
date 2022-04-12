package com.afoxplus.uikit.demo.components.quantitybutton

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.afoxplus.uikit.demo.databinding.ActivityQuantityButtonBinding

class QuantityButtonActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuantityButtonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuantityButtonBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initComponents()
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
    }
}