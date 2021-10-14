plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-parcelize")
    id("maven-publish")
}

apply(from = "jacoco.gradle")

android {
    compileSdk = Versions.compileSdkVersion
    buildToolsVersion = Versions.buildToolsVersion

    defaultConfig {
        minSdk = Versions.minSdkVersion
        targetSdk = Versions.targetSdkVersion
        testInstrumentationRunner = Versions.testInstrumentationRunner
        consumerProguardFiles("consumer-rules.pro")
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
}