package com.afoxplus.uikit.demo.components.modal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.afoxplus.uikit.demo.databinding.ActivityModalBinding
import com.afoxplus.uikit.extensions.setOnClickListenerDelay
import com.afoxplus.uikit.modal.UIKitModal

class ModalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityModalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityModalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.modalDisplayModal.setOnClickListenerDelay {
            displayModal()
        }
    }

    private fun displayModal() {
        UIKitModal.Builder(supportFragmentManager, "")
            .title("Debes elegir nuevamente tus entradas")
            .message("El total de tus unidades es menor a tus entradas seleccionadas")
            .positiveButton("Entendido") {
                println("Here is the positive button click")
                it.dismiss()
            }
            .show()
    }
}