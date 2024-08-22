plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.kapt")
    id("com.google.dagger.hilt.android")
    id("org.jetbrains.kotlin.plugin.parcelize")
    id("org.sonarqube") version "3.3"
    id("jacoco")
}

apply {
    from(Gradle.Sonarqube)
    from(Gradle.Jacoco)
    from(Gradle.UploadArtifact)
    from("graph.gradle.kts")
}

android {
    namespace = "com.afoxplus.uikit"
    compileSdk = Versions.compileSdkVersion

    defaultConfig {
        minSdk = Versions.minSdkVersion
        targetSdk = Versions.targetSdkVersion
        testInstrumentationRunner = Versions.testInstrumentationRunner
        consumerProguardFiles("consumer-rules.pro")
        renderscriptSupportModeEnabled = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        create("staging") {
            initWith(getByName("debug"))
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        getByName("debug") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions.jvmTarget = JavaVersion.VERSION_17.toString()

    buildFeatures {
        viewBinding = true
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.8"
    }

    lint {
        disable.addAll(
            listOf(
                "TypographyFractions",
                "TypographyQuotes",
                "JvmStaticProvidesInObjectDetector",
                "FieldSiteTargetOnQualifierAnnotation",
                "ModuleCompanionObjects",
                "ModuleCompanionObjectsNotInModuleParent"
            )
        )
        checkDependencies = true
        abortOnError = false
        ignoreWarnings = false
    }

    publishing {
        singleVariant("release") {
            withSourcesJar()
            withJavadocJar()
        }
    }
}

dependencies {
    //Jetpack
    implementation(Deps.Jetpack.kotlin)
    implementation(Deps.Jetpack.core)
    implementation(Deps.Jetpack.appcompat)

    //Jetpack UI
    implementation(Deps.UI.materialDesign)
    implementation(Deps.UI.constraintLayout)

    // Jetpack Compose
    implementation(Deps.JetpackCompose.activity)
    implementation(Deps.JetpackCompose.constraintlayout)
    implementation(Deps.JetpackCompose.navigation)
    implementation(platform(Deps.JetpackCompose.bom))
    implementation(Deps.JetpackCompose.ui)
    implementation(Deps.JetpackCompose.graphics)
    implementation(Deps.JetpackCompose.toolingPreview)
    debugImplementation(Deps.JetpackCompose.tooling)
    implementation(Deps.JetpackCompose.material3)
    implementation(Deps.JetpackCompose.materialIconExtended)
    //Image Async
    implementation(Deps.JetpackCompose.coilCompose)
    implementation(Deps.UI.glide)
    kapt(Deps.UI.glideCompiler)

    // Coroutines
    implementation(Deps.Arch.coroutinesCore)
    implementation(Deps.Arch.coroutinesAndroid)

    // Dagger - Hilt
    implementation(Deps.Arch.hiltAndroid)
    kapt(Deps.Arch.hiltAndroidCompiler)
    implementation(Deps.JetpackCompose.hiltNavigationCompose)
    kapt(Deps.Arch.hiltCompiler)

    testImplementation(Deps.Test.jUnit)
    androidTestImplementation(Deps.Test.androidJUnit)
    androidTestImplementation(Deps.Test.espresso)
}
