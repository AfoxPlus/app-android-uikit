package com.afoxplus.uikit.service.annotations

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class MockService(val jsonFileName: String)
