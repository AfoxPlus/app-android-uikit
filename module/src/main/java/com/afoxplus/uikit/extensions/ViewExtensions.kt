package com.afoxplus.uikit.extensions

import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import java.io.InputStream

fun InputStream.convertToString(): String? {
    return try {
        this.bufferedReader().use { it.readText() }
    } catch (exception: Exception) {
        null
    } finally {
        this.close()
    }
}

fun EditText.setUpActionFormSearchClick(actions: () -> Unit) {
    setOnEditorActionListener { v, actionId, event ->
        if (actionId == EditorInfo.IME_ACTION_SEARCH)
            actions()
        false
    }
}

fun View.setGone() {
    this.visibility = View.GONE
}

fun View.setVisible() {
    this.visibility = View.VISIBLE
}