plugins {
    id("com.android.application")
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()

    buildFeatures { viewBinding = true }
}

dependencies {
    //Libs
    implementation(fileTree("libs") { include(listOf("*.jar", "*.aar")) })
    //kotlin
    implementation(Deps.Jetpack.kotlin)
    implementation(Deps.Jetpack.core)
    //View
    implementation(Deps.Jetpack.appcompat)
    implementation(Deps.UI.materialDesign)
    implementation(Deps.UI.constraintLayout)
    //Test
    testImplementation(Deps.Test.jUnit)
    androidTestImplementation(Deps.Test.androidJUnit)
    androidTestImplementation(Deps.Test.espresso)
    //Modules
    implementation(project(mapOf("path" to ":module")))
}