package com.afoxplus.uikit.di.objects

import com.afoxplus.uikit.objects.vendor.VendorAction
import com.afoxplus.uikit.objects.vendor.VendorShared
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ObjectsModule {

    @Singleton
    @Binds
    abstract fun bindsVendor(vendorAction: VendorAction): VendorShared

}