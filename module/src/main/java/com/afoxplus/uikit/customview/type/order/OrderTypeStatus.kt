package com.afoxplus.uikit.customview.type.order

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.withStyledAttributes
import com.afoxplus.uikit.R
import com.afoxplus.uikit.databinding.CustomViewOrderTypeStatusBinding

class OrderTypeStatus @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr, defStyleRes) {

    private val binding = CustomViewOrderTypeStatusBinding.inflate(
        LayoutInflater.from(this.context),
        this,
        true
    )

    init {
        loadAttributes(attrs, defStyleAttr)
    }

    var cardType: OrderType = OrderType.AMOUNT
        set(value) {
            field = value
            configVisibility(value)
        }

    var title: String = ""
        set(value) {
            field = value
            setupTitle(value)
        }

    var description: String = ""
        set(value) {
            field = value
            setupDescription(value)
        }

    private fun configVisibility(value: OrderType) {
        goneAll()
        when (value) {
            OrderType.RESTAURANT -> binding.clTypeOrderStatusRestaurant.visibility = VISIBLE
            OrderType.DELIVERY -> binding.clTypeOrderStatusDelivery.visibility = VISIBLE
            OrderType.AMOUNT -> binding.clTypeOrderStatusAmount.visibility = VISIBLE
        }
    }

    private fun setupTitle(value: String) {
        binding.tvTitleRestaurant.text = value
        binding.tvTitleDelivery.text = value
        binding.tvTitleAmount.text = value
    }

    private fun setupDescription(value: String) {
        binding.tvDescriptionRestaurant.text = value
        binding.tvDescriptionAmount.text = value
    }

    fun configType(value: String) {
        goneAll()
        when (value) {
            OrderType.RESTAURANT.acronym -> {
                cardType = OrderType.RESTAURANT
                binding.clTypeOrderStatusRestaurant.visibility = VISIBLE
            }

            OrderType.DELIVERY.acronym -> {
                cardType = OrderType.DELIVERY
                binding.clTypeOrderStatusDelivery.visibility = VISIBLE
            }

            else -> {
                cardType = OrderType.AMOUNT
                binding.clTypeOrderStatusAmount.visibility = VISIBLE
            }
        }
    }

    private fun goneAll() {
        binding.clTypeOrderStatusRestaurant.visibility = GONE
        binding.clTypeOrderStatusDelivery.visibility = GONE
        binding.clTypeOrderStatusAmount.visibility = GONE
    }

    private fun loadAttributes(attrs: AttributeSet?, defStyleAttr: Int = 0) {
        context.withStyledAttributes(attrs, R.styleable.OrderTypeStatus, defStyleAttr) {
            cardType = OrderType.valueOfCode(
                this.getInt(R.styleable.OrderTypeStatus_orderType, OrderType.AMOUNT.code)
            )
            title = getString(R.styleable.OrderTypeStatus_title) ?: ""
            description = getString(R.styleable.OrderTypeStatus_description) ?: ""
        }
    }
}