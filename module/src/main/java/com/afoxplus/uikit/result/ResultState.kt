package com.afoxplus.uikit.result

sealed interface ResultState<T> {
    data class Success<T>(val data: T) : ResultState<T>
    data class Error<T>(val errorMessage: ErrorMessage) : ResultState<T>
}

data class ErrorMessage(
    val code: Int = 0,
    val title: String,
    val message: String,
    var errorType: ErrorType
)

enum class ErrorType {
    ERROR, EXCEPTION
}
