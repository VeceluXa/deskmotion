plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version(Versions.androidPlugin).apply(false)
    id("com.android.library").version(Versions.androidPlugin).apply(false)
    kotlin("android").version(Versions.kotlinPlugin).apply(false)
    kotlin("multiplatform").version(Versions.kotlinPlugin).apply(false)
    id("org.jetbrains.compose").version(Versions.compose).apply(false)
    id("org.jetbrains.kotlin.jvm").version(Versions.kotlin).apply(false)
    id("dev.icerock.mobile.multiplatform-resources").version(Versions.mokoResources).apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}