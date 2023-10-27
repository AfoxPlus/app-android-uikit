package com.afoxplus.uikit.customview.quantitybutton

enum class ButtonEnableType(var code: Int) {
    MINUS(1), PLUS(2), ALL(3), NONE(4);

    companion object {
        fun valueOfCode(code: Int): ButtonEnableType {
            for (f in ButtonEnableType.values()) {
                if (f.code == code) return f
            }
            return NONE
        }
    }
}