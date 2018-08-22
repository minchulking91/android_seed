/**
 * Created by minchul on 2018-02-26.
 */
object Versions {
    const val room = "2.0.0-alpha1"
    const val anko = "0.10.5"
    const val arch = "2.0.0-alpha1"
    const val constraint_layout = "1.1.2"
    const val firebase = "11.8.0"
    const val google_service_plugin = "3.2.0"
    const val google_play_service = "11.8.0"
    const val paging = "1.0.1"
    const val retrofit = "2.4.0"
    const val rxjava = "2.1.9"
    const val rxbinding_kotlin = "2.1.1"
    const val kotlin = "1.2.51"
    const val rxkotlin = "2.2.0"
    const val rxandroid = "2.0.2"
    const val gson = "2.8.5"
    const val json_simple = "1.1.1"
    const val guava = "23.6.1-android"
    const val glide = "4.7.1"
    const val three_ten_abp = "1.1.0"
    const val okhttp_logging_interceptor = "3.11.0"
    const val lottie = "2.5.1"
    const val junit: String = "4.12"
    const val mockito_kotlin: String = "1.1.0"
    const val test_runner: String = "1.1.0-alpha4"
    const val crashlytics: String = "2.7.1"
    const val spinkit: String = "1.1.0"
    const val timber = "4.7.0"
    const val stetho = "1.5.0"
    const val rx_network = "1.0.0"

    const val androidx = "1.0.0-rc01"
    const val espresso = "3.1.0-alpha4"
    const val koin = "1.0.0-beta-7"
}

object Deps {
    //android X
    const val android_appcompat = "androidx.appcompat:appcompat:${Versions.androidx}"
    const val android_design = "com.google.android.material:material:${Versions.androidx}"

    const val constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"
    const val constraint_layout_solver = "androidx.constraintlayout:constraintlayout-solver:${Versions.constraint_layout}"

    const val crashlytics = "com.crashlytics.sdk.android:crashlytics:${Versions.crashlytics}@aar"
    const val firebase_core = "com.google.firebase:firebase-core:${Versions.firebase}"
    const val firebase_database = "com.google.firebase:firebase-database:${Versions.firebase}"
    const val firebase_messaging = "com.google.firebase:firebase-messaging:${Versions.firebase}"
    const val firebase_config = "com.google.firebase:firebase-config:${Versions.firebase}"
    const val firebase_auth = "com.google.firebase:firebase-auth:${Versions.firebase}"
    const val google_service_apply_plugin = "com.google.gms.google-services"
    const val google_service_plugin = "com.google.gms:google-services:${Versions.google_service_plugin}"
    const val google_play_service = "com.google.android.gms:play-services-base:${Versions.google_play_service}"
    const val google_recaptcha = "com.google.android.gms:play-services-safetynet:${Versions.google_play_service}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofit_rxjava_adapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val retrofit_gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val okhttp_logging_interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp_logging_interceptor}"

    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val kotlin_test = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    const val kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    const val rxjava = "io.reactivex.rxjava2:rxjava:${Versions.rxjava}"
    const val rxkotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxkotlin}"
    const val rxandroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxandroid}"
    const val rxbinding_kotlin = "com.jakewharton.rxbinding2:rxbinding-kotlin:${Versions.rxbinding_kotlin}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val guava = "com.google.guava:guava:${Versions.guava}"

    const val json_simple = "com.googlecode.json-simple:json-simple:${Versions.json_simple}"

    const val glide_runtime = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glide_recyclerview = "com.github.bumptech.glide:recyclerview-integration:${Versions.glide}"
    const val glide_compile = "com.github.bumptech.glide:compiler:${Versions.glide}"
    const val three_ten_abp = "com.jakewharton.threetenabp:threetenabp:${Versions.three_ten_abp}"

    const val lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.arch}"

    const val paging = "android.arch.paging:runtime:${Versions.paging}"
    const val rx_paging = "android.arch.paging:rxjava2:${Versions.paging}"

    const val lottie = "com.airbnb.android:lottie:${Versions.lottie}"
    const val spinkit = "com.github.ybq:Android-SpinKit:${Versions.spinkit}"

    const val anko = "org.jetbrains.anko:anko:${Versions.anko}"
    const val anko_constraint = "org.jetbrains.anko:anko-constraint-layout:${Versions.anko}"
    const val anko_design = "org.jetbrains.anko:anko-design:${Versions.anko}"
    const val anko_appcompat_v7 = "org.jetbrains.anko:anko-appcompat-v7:${Versions.anko}"
    const val anko_recyclerview = "org.jetbrains.anko:anko-recyclerview-v7:${Versions.anko}"

    //di
    const val koin_architecture = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    const val koin_android = "org.koin:koin-android:${Versions.koin}"
    const val koin_android_scope = "org.koin:koin-androidx-scope:${Versions.koin}"
    //forTest
    const val junit = "junit:junit:${Versions.junit}"
    const val mockito_kotlin = "com.nhaarman:mocjkito-kotlin:${Versions.mockito_kotlin}"
    const val test_runner = "androidx.test:runner:${Versions.test_runner}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val hamcrest = "org.hamcrest:hamcrest-library:1.3"

    const val room_runtime = "androidx.room:room-runtime:${Versions.room}"
    const val room_compiler = "androidx.room:room-compiler:${Versions.room}"
    const val room_rxjava = "androidx.room:room-rxjava2:${Versions.room}"

    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    const val stetho = "com.facebook.stetho:stetho:${Versions.stetho}"
    const val stetho_okhttp = "com.facebook.stetho:stetho-okhttp3:${Versions.stetho}"
    const val stetho_rhino = "com.facebook.stetho:stetho-js-rhino:${Versions.stetho}"

    const val rx_network = "com.github.pwittchen:reactivenetwork-rx2:${Versions.rx_network}"
}