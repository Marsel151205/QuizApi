plugins {
    id(Plugins.application)
    id(Plugins.kotlinAndroid)

    // Kapt
    id(Plugins.kapt)

    // Hilt
    id(Plugins.hilt)

    // Save Args
    id(Plugins.saveArgs)
}

android {
    namespace = "com.example.presentatio"
    compileSdk = 32

    defaultConfig {
        minSdk = 24
        targetSdk = 32

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    buildFeatures.viewBinding = true
}

dependencies {

    // Core
    implementation(Dependencies.Core.core)

    // AppCompat
    implementation(Dependencies.UIComponents.appCompat)

    // Material
    implementation(Dependencies.UIComponents.material)

    // ConstraintLayout
    implementation(Dependencies.UIComponents.constraintLayout)

    // NavComponent
    implementation(Dependencies.NavComponents.navigationFragment)
    implementation(Dependencies.NavComponents.navigationUI)

    // Lifecycle
    implementation(Dependencies.Lifecycle.viewModel)
    implementation(Dependencies.Lifecycle.viewModelCompose)
    implementation(Dependencies.Lifecycle.liveData)

    // ViewBindingPropertyDelegate
    implementation(Dependencies.ViewBindingPropertyDelegate.viewBindingPropertyDelegate)

    // Hilt
    kapt(Dependencies.Hilt.compiler)
    implementation(Dependencies.Hilt.hilt)

    // Domain
    implementation(project(":domain"))

    // Common
    implementation(project(":common"))
}