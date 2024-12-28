plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

kotlin {
    jvmToolchain(17)
}

android {
    namespace = "com.example.uasproject"
    compileSdk = 34  // Update this according to your project configuration

    defaultConfig {
        applicationId = "com.example.uasproject"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false // Correct syntax for Kotlin DSL
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.0" // Adjust based on your compose version
        kotlinCompilerVersion = "1.8.10" // Adjust based on your Kotlin version
    }

    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.activity:activity-compose:1.7.2")
    implementation("androidx.compose.ui:ui:1.5.0") // Use your Compose version here
    implementation("androidx.compose.material3:material3:1.0.0") // Use your Material3 version here
    implementation("androidx.compose.foundation:foundation:1.5.0") // Use your Compose foundation version
    implementation("androidx.compose.runtime:runtime-livedata:1.5.0") // Same as above
    implementation("androidx.navigation:navigation-compose:2.7.0")
    implementation("io.coil-kt:coil-compose:2.5.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.5.0")
    debugImplementation("androidx.compose.ui:ui-tooling:1.5.0")
}
