package com.afoxplus.uikit.customview.quantitybutton


enum class ButtonType(var code: Int) {
    EDITABLE(1), QUANTITY(2), DELETE(3);

    companion object {
        fun valueOfCode(code: Int): ButtonType {
            for (f in values()) {
                if (f.code == code) return f
            }
            return QUANTITY
        }
    }
}