package com.afoxplus.uikit.bus

interface UIKitEventBus
data class OnClickDeeplinkEvent(val deeplink: String) : UIKitEventBus