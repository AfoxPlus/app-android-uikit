package com.afoxplus.uikit.objects.vendor

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PaymentMethod(val id: String, val name: String, var isSelected: Boolean): Parcelable
