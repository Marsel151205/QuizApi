object Version {
    const val applicationAndKotlinAndroid = "7.3.1"
    const val lifecycle = "2.5.1"
    const val hilt = "2.44"
    const val navigation = "2.5.3"
    const val saveArgs = "2.5.3"
}

object Plugins {
    const val application = "com.android.application"
    const val kotlinAndroid = "org.jetbrains.kotlin.android"
    const val hilt = "com.google.dagger.hilt.android"
    const val saveArgs = "androidx.navigation.safeargs"
    const val kapt = "kotlin-kapt"
}

object Dependencies {

    object Core {
        const val core = "androidx.core:core-ktx:1.7.0"
    }

    object UIComponents {
        const val appCompat = "androidx.appcompat:appcompat:1.5.1"
        const val material = "com.google.android.material:material:1.7.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.4"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
    }

    object GsonConverter {
        const val gsonConverter = "com.squareup.retrofit2:converter-gson:2.9.0"
    }

    object OkHttp {
        const val bom = "com.squareup.okhttp3:okhttp-bom:4.10.0"
        const val okHttp = "com.squareup.okhttp3:okhttp"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor"
    }

    object ViewBindingPropertyDelegate {
        const val viewBindingPropertyDelegate =
            "com.github.kirich1409:viewbindingpropertydelegate-noreflection:1.5.6"
    }

    object Lifecycle {
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.lifecycle}"
        const val viewModelCompose =
            "androidx.lifecycle:lifecycle-viewmodel-compose:${Version.lifecycle}"
        const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Version.lifecycle}"
    }

    object Coil {
        const val coil = "io.coil-kt:coil:2.2.2"
    }

    object Hilt {
        const val hilt = "com.google.dagger:hilt-android:${Version.hilt}"
        const val compiler = "com.google.dagger:hilt-android-compiler:${Version.hilt}"
    }

    object NavComponents {
        const val navigationFragment =
            "androidx.navigation:navigation-fragment-ktx:${Version.navigation}"
        const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Version.navigation}"
    }

    object Coroutines {
        const val coroutineAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9"
        const val coroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9"
        const val coroutineCoreJVM = "org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:1.6.4"
    }
}