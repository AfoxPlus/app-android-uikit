package com.afoxplus.uikit.objects.vendor

import javax.inject.Inject

interface VendorShared {
    fun save(vendor: Vendor)
    fun fetch(): Vendor?
}

class VendorAction @Inject constructor() : VendorShared {

    companion object {
        var vendor: Vendor? = null
    }

    override fun save(vendor: Vendor) {
        VendorAction.vendor = vendor
    }

    override fun fetch(): Vendor? {
        return vendor
    }
}
