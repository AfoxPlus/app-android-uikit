package com.afoxplus.uikit.exceptions

import java.io.IOException

class GenericException : IOException()
class UIException(override val message: String?) : Exception(message)