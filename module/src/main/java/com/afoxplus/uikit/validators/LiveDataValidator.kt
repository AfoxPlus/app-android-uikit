package com.afoxplus.uikit.validators

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class LiveDataValidator(private val liveData: LiveData<String>) : Validator {
    private val validationRules = mutableListOf<ValidatorRule>()
    private val errorMessages = mutableListOf<String>()
    var error = MutableLiveData<String?>()

    override fun isValid(): Boolean {
        for (i in 0 until validationRules.size) {
            if (validationRules[i].rule(liveData.value)) {
                emitErrorMessage(errorMessages[i])
                return false
            }
        }
        emitErrorMessage(null)
        return true
    }

    private fun emitErrorMessage(messageRes: String?) {
        error.value = messageRes
    }

    fun addRule(errorMsg: String, predicate: ValidatorRule) {
        validationRules.add(predicate)
        errorMessages.add(errorMsg)
    }
}