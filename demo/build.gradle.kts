plugins {
    id("com.android.application")
    id("dagger.hilt.android.plugin")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-parcelize")

}

android {
    compileSdk = Versions.compileSdkVersion
    buildToolsVersion = Versions.buildToolsVersion

    defaultConfig {
        applicationId = "com.afoxplus.app_android_home.demo"
        minSdk = Versions.minSdkVersion
        targetSdk = Versions.targetSdkVersion
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = Versions.testInstrumentationRunner
        vectorDrawables.useSupportLibrary = true
    }


    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
    buildFeatures { viewBinding = true }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()

}

dependencies {
    implementation(fileTree("libs") { include(listOf("*.jar", "*.aar")) })
    implementation(Deps.Jetpack.kotlin)
    implementation(Deps.Jetpack.core)
    implementation(Deps.Jetpack.appcompat)
    implementation(Deps.UI.materialDesign)
    implementation(Deps.UI.constraintLayout)
    implementation(Deps.Arch.hiltAndroid)
    kapt(Deps.Arch.hiltCompiler)
    testImplementation(Deps.Test.jUnit)
    androidTestImplementation(Deps.Test.androidJUnit)
    androidTestImplementation(Deps.Test.espresso)
    implementation(project(mapOf("path" to ":module")))
}