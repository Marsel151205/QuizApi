plugins {
    id(Plugins.application)
    id("org.jetbrains.kotlin.android")
    kotlin(Plugins.kapt)
    id(Plugins.hilt)
}

android {
    namespace = Config.namespace
    compileSdk = Config.targetAndCompileSdk

    defaultConfig {
        applicationId = Config.namespace
        minSdk = Config.minSdk
        targetSdk = Config.targetAndCompileSdk
        versionCode = Config.versionCode
        versionName = Config.versionName

        testInstrumentationRunner = Config.testInstrumentationRunner
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    // Core
    implementation(Dependencies.Core.core)

    // Domain
    implementation(project(":domain"))

    // Hilt
    implementation(Dependencies.Hilt.hilt)
    kapt(Dependencies.Hilt.compiler)

    // Coroutines
    implementation(Dependencies.Coroutines.coroutineAndroid)
    implementation(Dependencies.Coroutines.coroutineCore)

    // Domain
    implementation(project(":domain"))

    // Data
    implementation(project(":data"))
}