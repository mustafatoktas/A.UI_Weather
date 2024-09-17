buildscript {
    dependencies {
        classpath(libs.hilt.android.gradle.plugin)
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false

    //kotlin 2.0.0 üstü için
    alias(libs.plugins.compose.compiler) apply false

    //ksp
    alias(libs.plugins.devtools.ksp) apply false

    //hilt
    alias(libs.plugins.dagger.hilt.android) apply false

    //detekt
    alias(libs.plugins.detekt) apply false
}