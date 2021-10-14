package com.afoxplus.uikit.validators

class LiveDataValidatorResolver(private val validators: List<Validator>) : Validator {
    override fun isValid(): Boolean {
        for (validator in validators) {
            if (!validator.isValid()) return false
        }
        return true
    }
}