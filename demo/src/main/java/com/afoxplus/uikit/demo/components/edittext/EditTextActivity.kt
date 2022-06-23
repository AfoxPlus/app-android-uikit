package com.afoxplus.uikit.demo.components.edittext

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.afoxplus.uikit.demo.databinding.ActivityEditTextBinding

class EditTextActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditTextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditTextBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpView()
    }

    private fun setUpView() {
        binding.editText1.run {
            hint = "Nombre*"
            text = "This is my text"
        }

        binding.editText2.run {
            error = "This is an invalid email"
        }

        binding.editText1.onTextChangeListener = {
            println("Here is edittext change value $it")
        }

        binding.editText1.setOnFocusChangeListener {
            println("Here is edittext focus value $it")
        }

        binding.btnSetError.setOnClickListener {
            binding.editText2.error = "This is an error"
        }
    }
}