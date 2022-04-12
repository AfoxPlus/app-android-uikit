package com.afoxplus.uikit.demo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.afoxplus.uikit.demo.components.quantitybutton.QuantityButtonActivity
import com.afoxplus.uikit.demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadComponents()
    }

    private fun loadComponents() {
        binding.openQuantity.setOnClickListener {
            startActivity(Intent(this, QuantityButtonActivity::class.java))
        }
    }
}