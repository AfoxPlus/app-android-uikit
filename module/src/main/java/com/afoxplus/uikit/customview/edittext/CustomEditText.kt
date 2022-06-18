package com.afoxplus.uikit.customview.edittext

import android.R.attr.maxLength
import android.content.Context
import android.text.InputFilter
import android.text.InputFilter.LengthFilter
import android.text.InputType
import android.util.AttributeSet
import android.view.inputmethod.EditorInfo
import androidx.core.widget.doOnTextChanged
import com.afoxplus.uikit.R
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout


class CustomEditText @JvmOverloads constructor(
    context: Context,
    private val attrs: AttributeSet,
    defStyleAttr: Int = 0
) : TextInputLayout(context, attrs, defStyleAttr) {
    private val mEditText: TextInputEditText = TextInputEditText(context, attrs)

    var text: String = ""
        set(value) {
            field = value
            mEditText.setText(value)
        }
        get() = mEditText.text.toString()

    var imeOptions: Int = EditorInfo.IME_ACTION_NEXT
        set(value) {
            field = value
            mEditText.imeOptions = value
        }

    var maxLines: Int = 1
        set(value) {
            field = value
            configLinesText()
        }

    var inputType: Int = InputType.TYPE_CLASS_TEXT
        set(value) {
            field = value
            mEditText.inputType = value
        }

    var maxTextSize: Int = 0
        set(value) {
            field = value
            configMaxTextSize()
        }

    init {
        loadAttributes()
        setUpView()
    }

    private fun loadAttributes() {
        context.obtainStyledAttributes(attrs, R.styleable.CustomEditText).also {
            text = it.getString(R.styleable.CustomEditText_android_text) ?: ""
            imeOptions =
                it.getInt(R.styleable.CustomEditText_android_imeOptions, EditorInfo.IME_ACTION_NEXT)
            inputType =
                it.getInt(R.styleable.CustomEditText_android_inputType, InputType.TYPE_CLASS_TEXT)
            maxLines = it.getInt(R.styleable.CustomEditText_android_maxLines, 1)
            maxTextSize = it.getInt(R.styleable.CustomEditText_android_maxLength, 0)
        }.recycle()
    }

    private fun configMaxTextSize() {
        if (maxTextSize > 0) {
            val filters = arrayOf<InputFilter>(LengthFilter(maxTextSize))
            mEditText.filters = filters
        }
    }

    private fun configLinesText() {
        if (maxLines > 1) {
            mEditText.inputType =
                EditorInfo.TYPE_CLASS_TEXT or EditorInfo.TYPE_TEXT_FLAG_MULTI_LINE
        }
        mEditText.maxLines = maxLines
    }

    private fun setUpView() {
        setUpEditText()
    }

    private fun setUpEditText() {
        val parameters = LayoutParams(
            LayoutParams.MATCH_PARENT,
            LayoutParams.WRAP_CONTENT
        )
        addView(mEditText, 0, parameters)
    }

    fun setOnTextChange(onTextChange: (String) -> Unit) {
        mEditText.doOnTextChanged { text, _, _, _ ->
            onTextChange(text.toString())
        }
    }

    fun setOnFocusChangeListener(onFocusChange: (Boolean) -> Unit) {
        mEditText.setOnFocusChangeListener { _, hasFocus ->
            onFocusChange(hasFocus)
        }
    }

}