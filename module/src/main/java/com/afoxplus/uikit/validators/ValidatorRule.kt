package com.afoxplus.uikit.validators

fun interface ValidatorRule {
    fun rule(value: String?): Boolean
}