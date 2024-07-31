package com.afoxplus.uikit.common

import com.afoxplus.uikit.exceptions.UIException

sealed interface UIState<T> {
    class OnLoading<T> : UIState<T>
    data class OnSuccess<T>(val data: T) : UIState<T>
    data class OnError<T>(val uiException: UIException) : UIState<T>
}