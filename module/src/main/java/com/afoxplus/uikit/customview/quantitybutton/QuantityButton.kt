package com.afoxplus.uikit.customview.quantitybutton

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.afoxplus.uikit.R
import com.afoxplus.uikit.databinding.CustomViewButtonQuantityBinding

class QuantityButton @JvmOverloads constructor(
    context: Context,
    private val attrs: AttributeSet,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val binding = CustomViewButtonQuantityBinding.inflate(
        LayoutInflater.from(this.context), this, true
    )

    var buttonType: ButtonType = ButtonType.QUANTITY
        set(value) {
            field = value
            configComponentsVisibility()
        }

    var quantityPlushIcon: Int = R.drawable.ic_plus
    var quantityMinusIcon: Int = R.drawable.ic_minus
    var editIcon: Int = R.drawable.ic_edit
    var deleteIcon: Int = R.drawable.ic_delete

    var value = 0
        set(value) {
            field = value
            configComponentsVisibility()
        }
    var onValueChangeListener: (Int) -> Unit = {}
    var onEditActionListener: () -> Unit = {}
    var onDeleteActionListener: () -> Unit = {}

    private var buttonEnableType = ButtonEnableType.NONE

    init {
        loadAttributes()
        configComponentsVisibility()
        configActions()
    }

    private fun loadAttributes() {
        context.obtainStyledAttributes(attrs, R.styleable.QuantityButton).apply {
            buttonType = ButtonType.valueOfCode(
                this.getInt(R.styleable.QuantityButton_buttonType, ButtonType.QUANTITY.code)
            )
            value = this.getInt(R.styleable.QuantityButton_value, 0)
            //isEnable = this.getBoolean(R.styleable.QuantityButton_isEnable, true)
        }.recycle()
    }


    private fun configComponentsVisibility() {
        when (buttonType) {
            ButtonType.QUANTITY -> {
                configLeftComponentVisibility()
                configRightIconQuantity()
                configLeftIconQuantity()
                displayValue()
            }

            ButtonType.EDITABLE -> {
                changeRightIconToEdit()
                displayValue()
            }

            else -> {
                configRightIconDelete()
            }
        }
    }

    private fun configActions() {
        binding.buttonActionRight.setOnClickListener {
            onRightAction()
        }
        binding.buttonActionLeft.setOnClickListener {
            onLeftAction()
        }
    }

    private fun configRightIconDelete() {
        binding.buttonActionRight.setImageResource(deleteIcon)
        binding.buttonActionValue.visibility = View.GONE
        binding.buttonActionLeft.visibility = View.GONE
    }

    private fun configLeftComponentVisibility() {
        val visibility = if (value >= 1) View.VISIBLE else View.GONE
        binding.buttonActionLeft.visibility = visibility
        binding.buttonActionValue.visibility = visibility
    }

    private fun configRightIconQuantity() {
        binding.buttonActionRight.setImageResource(quantityPlushIcon)
    }

    private fun configLeftIconQuantity() {
        val icon = if (value == 1) deleteIcon else quantityMinusIcon
        binding.buttonActionLeft.setImageResource(icon)
    }

    private fun changeRightIconToEdit() {
        binding.buttonActionRight.setImageResource(editIcon)
        binding.buttonActionValue.visibility = View.VISIBLE
        binding.buttonActionLeft.visibility = View.GONE
    }

    private fun configEnableButton(isEnable: Boolean) {
        when (buttonEnableType) {
            ButtonEnableType.MINUS -> {
                handleButtonEnable(binding.buttonActionLeft, isEnable)
            }

            ButtonEnableType.PLUS -> {
                handleButtonEnable(binding.buttonActionRight, isEnable)
            }

            ButtonEnableType.ALL -> {
                handleButtonEnable(binding.buttonActionLeft, isEnable)
                handleButtonEnable(binding.buttonActionRight, isEnable)
                handleButtonEnable(binding.buttonActionValue, isEnable)
            }

            ButtonEnableType.NONE -> {
                handleButtonEnable(binding.buttonActionLeft, true)
                handleButtonEnable(binding.buttonActionRight, true)
                handleButtonEnable(binding.buttonActionValue, true)
            }
        }
    }

    private fun handleButtonEnable(view: View, isEnable: Boolean) {
        view.apply {
            isClickable = isEnable
            isEnabled = isEnable
        }
    }

    private fun onLeftAction() {
        decreaseValue()
        displayValue()
        configComponentsVisibility()
    }

    private fun onRightAction() {
        when (buttonType) {
            ButtonType.QUANTITY -> {
                increaseValue()
                displayValue()
                configComponentsVisibility()
                configLeftIconQuantity()
            }

            ButtonType.EDITABLE -> {
                changeRightIconToEdit()
                editAction()
            }

            else -> {
                deleteAction()
            }
        }
    }

    private fun increaseValue() {
        value += 1
        changedValue()
    }

    private fun decreaseValue() {
        if (value == 0) return
        if (value == 1) deleteAction()
        value -= 1
        changedValue()
    }

    private fun displayValue() {
        binding.buttonActionValue.text = value.toString()
    }

    private fun deleteAction() {
        onDeleteActionListener()
    }

    private fun editAction() {
        onEditActionListener()
    }

    private fun changedValue() {
        onValueChangeListener(value)
    }

    fun setEnableButtonType(buttonEnableType: ButtonEnableType, isEnable: Boolean) {
        this.buttonEnableType = buttonEnableType
        configEnableButton(isEnable)
    }
}