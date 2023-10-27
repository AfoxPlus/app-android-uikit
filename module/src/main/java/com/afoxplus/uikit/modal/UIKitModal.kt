package com.afoxplus.uikit.modal

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import com.afoxplus.uikit.databinding.CustomViewModalBinding
import com.afoxplus.uikit.extensions.setGone

class UIKitModal(
    private val title: String = "",
    private val message: String = "",
    private val positiveButton: String? = null,
    private val negativeButton: String? = null,
    private val positiveButtonClickListener: ((UIKitModal) -> Unit)? = null,
    private val negativeButtonClickListener: ((UIKitModal) -> Unit)? = null
) : DialogFragment() {
    private lateinit var binding: CustomViewModalBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = CustomViewModalBinding.inflate(inflater, container, false)
        setUpView()
        isCancelable = false
        return binding.root
    }

    private fun setUpView() {
        binding.uikitModalTitle.text = title
        binding.uikitModalMessage.text = message
        setUpActions()
    }

    private fun setUpActions() {
        if (!positiveButton.isNullOrEmpty())
            binding.uikitModalPositive.text = positiveButton
        else
            binding.uikitModalPositive.setGone()
        if (!negativeButton.isNullOrEmpty())
            binding.uikitModalNegative.text = negativeButton
        else
            binding.uikitModalNegative.setGone()

        positiveButtonClickListener?.let {
            binding.uikitModalPositive.setOnClickListener { it(this) }
        }
        negativeButtonClickListener?.let {
            binding.uikitModalNegative.setOnClickListener { it(this) }
        }
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }

    data class Builder(
        val supportFragmentManager: FragmentManager,
        val defaultTag: String = "",
        private var title: String = "",
        private var message: String = "",
        private var positiveButton: String? = null,
        private var negativeButton: String? = null,
        private var positiveButtonClickListener: ((UIKitModal) -> Unit)? = null,
        private var negativeButtonClickListener: ((UIKitModal) -> Unit)? = null
    ) {
        fun title(title: String) = apply { this.title = title }
        fun message(message: String) = apply { this.message = message }
        fun positiveButton(
            positiveButton: String,
            positiveButtonClickListener: ((UIKitModal) -> Unit)? = null
        ) =
            apply {
                this.positiveButton = positiveButton
                this.positiveButtonClickListener = positiveButtonClickListener
            }

        fun negativeButton(
            negativeButton: String,
            negativeButtonClickListener: ((UIKitModal) -> Unit)? = null
        ) =
            apply {
                this.negativeButton = negativeButton
                this.negativeButtonClickListener = negativeButtonClickListener
            }

        private fun create() = UIKitModal(
            title,
            message,
            positiveButton,
            negativeButton,
            positiveButtonClickListener,
            negativeButtonClickListener
        )

        fun show() = create().apply { show(supportFragmentManager, defaultTag) }
    }

}