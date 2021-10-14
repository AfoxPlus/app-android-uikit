package com.afoxplus.uikit.service.exceptions

import java.io.IOException

class ApiNetworkException(
    val code: Int,
    override val message: String = ""
) : IOException(message)