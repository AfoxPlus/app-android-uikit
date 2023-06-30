package com.afoxplus.uikit.customview.type.order

enum class OrderType(val code: Int, val acronym: String) {
    RESTAURANT(1, "SALON"),
    DELIVERY(2, "DELI"),
    AMOUNT(3, "AMOUNT");

    companion object {
        fun valueOfCode(code: Int): OrderType {
            for (type in values()) {
                if (type.code == code)
                    return type
            }
            return AMOUNT
        }

        fun valueOfAcronym(acronym: String): OrderType {
            for (type in values()) {
                if (type.acronym == acronym)
                    return type
            }
            return AMOUNT
        }
    }
}