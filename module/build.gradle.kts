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
    implementation(fileTree("libs") { include(listOf("*.jar", "*.aar")) })

    implementation(Deps.Jetpack.kotlin)
    implementation(Deps.Jetpack.core)
    implementation(Deps.Jetpack.appcompat)
    implementation(Deps.UI.materialDesign)
    implementation(Deps.UI.constraintLayout)
    implementation(Deps.Arch.retrofit2)
    implementation(Deps.Arch.loggingInterceptor)
    implementation(Deps.Arch.coroutinesCore)
    implementation(Deps.Arch.coreHiltAndroid)

    testImplementation(Deps.Test.jUnit)
    androidTestImplementation(Deps.Test.androidJUnit)
    androidTestImplementation(Deps.Test.espresso)
}