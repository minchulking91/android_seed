plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("kotlin-parcelize")
//    id("dagger.hilt.android.plugin")
    id("androidx.navigation.safeargs.kotlin")
}


android {

    buildFeatures {
        viewBinding = true
    }

    compileSdk = 31

    defaultConfig {
        applicationId = "kr.co.sleeptime.androidseed"
        minSdk = 21
        targetSdk = 31
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildTypes {
        getByName("release") {
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("debug") {
            splits.abi.isEnable = false
            splits.density.isEnable = false
            androidResources {
                isCrunchPngs = false
            }
            ext.set("alwaysUpdateBuildId", false)
        }
    }
}

dependencies {

    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar", "*.aar"))))
    implementation(Deps.Kotlin.stdlib)
    implementation(Deps.AndroidX.livedata)

    //log
    implementation(Deps.Timber.timber)


    //navigation
    implementation(Deps.Navigation.navigation_fragment)
    implementation(Deps.Navigation.navigation_ui)
    implementation(Deps.Navigation.navigation_dynamic_features_fragment)
    androidTestImplementation(Deps.Navigation.navigation_testing)

    //reactive
    implementation(Deps.ReactiveX.rxandroid)
    implementation(Deps.ReactiveX.rxkotlin)
    implementation(Deps.ReactiveX.rxbinding)

    //time library
    implementation(Deps.Threetenabp.threetenabp)

    //remote
    implementation(Deps.Retrofit.retrofit)
    implementation(Deps.Retrofit.adapter_rxjava2)
    implementation(Deps.Retrofit.converter_gson)
    testImplementation(Deps.Retrofit.mock)
    implementation(Deps.Retrofit.logging_interceptor)

    //glide
    implementation(Deps.Glide.glide)
    implementation(Deps.Glide.recycler_view)
    kapt(Deps.Glide.compiler)

    //androidx
    implementation(Deps.AndroidX.appcompat)
    implementation(Deps.AndroidX.core)
    implementation(Deps.AndroidX.constraint_layout)
    implementation(Deps.AndroidX.material)
    implementation(Deps.AndroidX.coordinatorlayout)
    implementation(Deps.AndroidX.recyclerview)
    implementation(Deps.AndroidX.selection)
    implementation(Deps.AndroidX.biometric)
    implementation(Deps.AndroidX.viewpager2)
    implementation(Deps.AndroidX.swiperefreshlayout)
    implementation(Deps.AndroidX.dynamicanimation)
    implementation(Deps.AndroidX.fragment)
    implementation(Deps.AndroidX.activity)
    implementation(Deps.AndroidX.palette)
    implementation(Deps.AndroidX.ads_identifier)

    //google
    implementation(Deps.Google.phone)
    implementation(Deps.Google.flexbox)
    implementation(Deps.Google.gson)

    //hilt
    implementation(Deps.Hilt.hiltAndroid)
    kapt(Deps.Hilt.hiltAndroidCompiler)
    implementation(Deps.Hilt.googleDagger)
    implementation(Deps.Hilt.androidxHiltCommon)
    implementation(Deps.Hilt.androidxHiltLifecycleViewModel)
    kapt(Deps.Hilt.androidxHiltCompiler)
    androidTestImplementation(Deps.Hilt.hiltAndroidTesting)
    kaptAndroidTest(Deps.Hilt.hiltAndroidCompiler)

    //jsoup
    implementation(Deps.Jsoup.jsoup)
    //test
    testImplementation(Deps.Junit.junit)
    androidTestImplementation(Deps.Junit.junit)
    androidTestImplementation(Deps.AndroidX.test_junit)
    androidTestImplementation(Deps.Espresso.espresso)
    androidTestImplementation(Deps.Espresso.idlingResource)
    androidTestImplementation(Deps.Espresso.espressoContrib)
    androidTestImplementation(Deps.Espresso.espressoIntent)
    debugImplementation(Deps.AndroidX.test_fragment)
    androidTestImplementation(Deps.AndroidX.test_rules)
    androidTestImplementation(Deps.AndroidX.test_arch)
}