plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-parcelize")
    id("dagger.hilt.android.plugin")
}

apply(from = "sonarqube.gradle")
apply(from = "jacoco.gradle")
apply(from = "upload.gradle")

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
    buildFeatures { viewBinding = true }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions{
        jvmTarget = "${JavaVersion.VERSION_11}"
    }

    kapt {
        correctErrorTypes = true
    }
}

dependencies {
    implementation(fileTree("libs") { include(listOf("*.jar", "*.aar")) })
    implementation(Deps.Jetpack.core)
    implementation(Deps.Jetpack.kotlin)
    implementation(Deps.Jetpack.appcompat)
    implementation(Deps.UI.materialDesign)
    implementation(Deps.UI.constraintLayout)
    implementation(Deps.Arch.retrofit2)
    implementation(Deps.Arch.loggingInterceptor)
    implementation(Deps.Arch.coroutinesCore)
    implementation(Deps.Arch.hiltAndroid)
    kapt(Deps.Arch.hiltCompiler)
    implementation(Deps.Arch.gson)
    implementation(Deps.Arch.loggingInterceptor)
    testImplementation(Deps.Test.jUnit)
    androidTestImplementation(Deps.Test.androidJUnit)
    androidTestImplementation(Deps.Test.espresso)
}