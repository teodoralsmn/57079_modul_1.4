android {
    //...
    kotlinOptions {
        jvmTarget = '1.8'
    }
    buildFeatures {
        //...
        compose true
    }
    composeOptions {
        kotlinCompilerExtensionVersion '1.3.2'
    }
}

dependencies {
    //...
    // Compose
    def composeBom = platform('androidx.compose:compose-bom:2024.09.02')
    implementation(composeBom)
    androidTestImplementation(composeBom)

    implementation "androidx.compose.runtime:runtime"
    implementation "androidx.compose.ui:ui"
    implementation "androidx.compose.foundation:foundation"
    implementation "androidx.compose.foundation:foundation-layout"
    implementation "androidx.compose.material3:material3"
    implementation "androidx.compose.runtime:runtime-livedata"
    implementation "androidx.compose.ui:ui-tooling"
    //...
}