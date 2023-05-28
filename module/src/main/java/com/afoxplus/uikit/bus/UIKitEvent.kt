package com.afoxplus.uikit.bus

import androidx.lifecycle.Observer

open class UIKitEvent<out T>(private val content: T) {
    var hasBeenHandled = false
        private set

    fun getContentIfNotHandled(): T? {
        return if (hasBeenHandled) {
            null
        } else {
            hasBeenHandled = true
            content
        }
    }

    fun peekContent(): T = content
}

class UIKitEventObserver<T>(private val onEventUnhandledContent: (T) -> Unit) : Observer<UIKitEvent<T>> {
    override fun onChanged(UIKitEvent: UIKitEvent<T>?) {
        UIKitEvent?.getContentIfNotHandled()?.let {
            onEventUnhandledContent(it)
        }
    }
}