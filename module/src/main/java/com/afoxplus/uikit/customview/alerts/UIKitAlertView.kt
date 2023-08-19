package com.afoxplus.uikit.customview.alerts

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.LayerDrawable
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import com.afoxplus.uikit.R
import com.afoxplus.uikit.databinding.CustomAlertViewBinding


class UIKitAlertView @JvmOverloads constructor(
    context: Context,
    private val attrs: AttributeSet,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {
    private val binding = CustomAlertViewBinding.inflate(
        LayoutInflater.from(this.context), this, true
    )

    var title: String = "Title"
        set(value) {
            field = value
            binding.alertTitle.text = value
        }
    var message: String = "Message"
        set(value) {
            field = value
            binding.alertMessage.text = value
        }
    var alertColor: Int = ResourcesCompat.getColor(resources, R.color.blue_01, null)
        set(value) {
            field = value
            configColors()
        }

    init {
        loadAttributes()
    }

    private fun loadAttributes() {
        context.obtainStyledAttributes(attrs, R.styleable.UIKitAlertView).apply {
            alertColor =
                this.getColor(
                    R.styleable.UIKitAlertView_alert_color,
                    ResourcesCompat.getColor(resources, R.color.blue_01, null)
                )
            title = this.getString(R.styleable.UIKitAlertView_alert_title) ?: ""
            message = this.getString(R.styleable.UIKitAlertView_alert_message) ?: ""
        }.recycle()
    }

    private fun configColors() {
        val shapeRectangle =
            ContextCompat.getDrawable(context, R.drawable.bg_alert) as LayerDrawable?
        val gradientLeft =
            shapeRectangle?.findDrawableByLayerId(R.id.bgAlertLeft) as GradientDrawable?
        val gradientRight =
            shapeRectangle?.findDrawableByLayerId(R.id.bgAlertRight) as GradientDrawable?
        gradientLeft?.setColor(alertColor)
        val strokeWidth =
            TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 2f, resources.displayMetrics)
        gradientRight?.setStroke(strokeWidth.toInt(), alertColor)
        binding.alertContainer.background = shapeRectangle
    }
}