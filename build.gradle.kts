// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {

    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(Deps.Kotlin.gradle_plugin)
        classpath(Deps.Android.gradle)
        classpath(Deps.Google.google_service)
        classpath(Deps.Navigation.safe_args_gradle_plugin)
        classpath(Deps.Firebase.crashylytics_gradle)
        classpath(Deps.Firebase.perf_plugin)
        classpath(Deps.Firebase.appdistribution_gradle)
        classpath(Deps.Hilt.hilt_android_gradle_plugin)
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
