package com.afoxplus.uikit.bus

import androidx.lifecycle.Observer

@Deprecated("Use SharedFlow for emit events in yours viewmodels")
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

@Deprecated("Use SharedFlow in yours viewmodels")
class UIKitEventObserver<T>(private val onEventUnhandledContent: (T) -> Unit) : Observer<UIKitEvent<T>> {
    override fun onChanged(UIKitEvent: UIKitEvent<T>?) {
        UIKitEvent?.getContentIfNotHandled()?.let {
            onEventUnhandledContent(it)
        }
    }
}