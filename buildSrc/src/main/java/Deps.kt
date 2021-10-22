object Deps {

    object AndroidX {
        const val appcompat = "androidx.appcompat:appcompat:1.4.0-beta01"
        const val core = "androidx.core:core-ktx:1.7.0-rc01"
        const val constraint_layout = "androidx.constraintlayout:constraintlayout:2.1.1"
        const val material = "com.google.android.material:material:1.5.0-alpha04"
        const val coordinatorlayout = "androidx.coordinatorlayout:coordinatorlayout:1.1.0"
        const val recyclerview = "androidx.recyclerview:recyclerview:1.3.0-alpha01"
        const val selection = "androidx.recyclerview:recyclerview-selection:1.2.0-alpha01"
        const val biometric = "androidx.biometric:biometric-ktx:1.2.0-alpha03"
        const val viewpager2 = "androidx.viewpager2:viewpager2:1.1.0-beta01"
        const val swiperefreshlayout = "androidx.swiperefreshlayout:swiperefreshlayout:1.2.0-alpha01"
        const val dynamicanimation = "androidx.dynamicanimation:dynamicanimation-ktx:1.0.0-alpha03"
        const val ads_identifier = "androidx.ads:ads-identifier:1.0.0-alpha04"
        const val fragment = "androidx.fragment:fragment-ktx:1.4.0-alpha10"
        const val activity = "androidx.activity:activity-ktx:1.4.0-rc01"
        const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:2.4.0-rc01"
        const val palette = "androidx.palette:palette-ktx:1.0.0"
        const val test_junit = "androidx.test.ext:junit:1.1.4-alpha03"
        const val test_fragment = "androidx.fragment:fragment-testing:1.4.0-alpha10"
        const val test_rules = "androidx.test:rules:1.4.1.alpha03"
        const val test_arch = "androidx.arch.core:core-testing:2.1.0"
    }

    object Android {
        const val installreferrer = "com.android.installreferrer:installreferrer:2.2"
        const val gradle = "com.android.tools.build:gradle:7.0.3"
    }

    object Espresso{
        private const val version = "3.5.0-alpha03"
        const val espresso = "androidx.test.espresso:espresso-core:$version"
        const val idlingResource = "androidx.test.espresso:espresso-idling-resource:$version"
        const val espressoContrib = "androidx.test.espresso:espresso-contrib:$version"
        const val espressoIntent = "androidx.test.espresso:espresso-intents:$version"
    }

    object Firebase {

        //firebase
        // Import the BoM for the Firebase platform
        const val bom = "com.google.firebase:firebase-bom:28.4.2"

        // Declare the dependency for the Analytics library
        // When using the BoM, you don't specify versions in Firebase library dependencies
        const val analytics = "com.google.firebase:firebase-analytics-ktx"
        const val messaging = "com.google.firebase:firebase-messaging-ktx"
        const val crashlytics = "com.google.firebase:firebase-crashlytics-ktx"
        const val config = "com.google.firebase:firebase-config-ktx"
        const val perf = "com.google.firebase:firebase-perf-ktx"
        const val firestore = "com.google.firebase:firebase-firestore-ktx"
        const val crashylytics_gradle = "com.google.firebase:firebase-crashlytics-gradle:2.2.0"
        const val perf_plugin = "com.google.firebase:perf-plugin:1.3.1"
        const val appdistribution_gradle = "com.google.firebase:firebase-appdistribution-gradle:2.1.1"
    }

    object PlayService {
        const val base = "com.google.android.gms:play-services-base:17.6.0"
        const val auth = "com.google.android.gms:play-services-auth:19.2.0"
        const val identity = "com.google.android.gms:play-services-identity:17.0.1"
        const val ads = "com.google.android.gms:play-services-ads:20.4.0"
        const val auth_api_phone = "com.google.android.gms:play-services-auth-api-phone:17.5.1"
    }

    object Timber {
        const val timber = "com.jakewharton.timber:timber:4.7.1"
    }

    object Navigation {
        private const val version = "2.4.0-alpha10"
        const val navigation_fragment = "androidx.navigation:navigation-fragment-ktx:$version"
        const val navigation_ui = "androidx.navigation:navigation-ui-ktx:$version"
        const val navigation_dynamic_features_fragment = "androidx.navigation:navigation-dynamic-features-fragment:$version"
        const val navigation_testing = "androidx.navigation:navigation-testing:$version"
        const val safe_args_gradle_plugin = "androidx.navigation:navigation-safe-args-gradle-plugin:$version"
    }

    object ReactiveX {
        const val rxandroid = "io.reactivex.rxjava3:rxandroid:3.0.0"
        const val rxkotlin = "io.reactivex.rxjava3:rxkotlin:3.0.1"
        const val rxbinding = "com.jakewharton.rxbinding4:rxbinding:4.0.0"
    }

    object Threetenabp {
        const val threetenabp = "com.jakewharton.threetenabp:threetenabp:1.3.1"
    }

    object Google {
        const val gson = "com.google.code.gson:gson:2.8.6"
        const val phone = "com.googlecode.libphonenumber:libphonenumber:8.12.5"
        const val flexbox = "com.google.android.flexbox:flexbox:3.0.0"
        const val google_service = "com.google.gms:google-services:4.3.10"
    }

    object Retrofit {
        private const val version = "2.9.0"
        const val retrofit = "com.squareup.retrofit2:retrofit:${version}"
        const val adapter_rxjava2 = "com.squareup.retrofit2:adapter-rxjava3:${version}"
        const val converter_gson = "com.squareup.retrofit2:converter-gson:${version}"
        const val mock = "com.squareup.retrofit2:retrofit-mock:${version}"
        const val logging_interceptor = "com.squareup.okhttp3:logging-interceptor:4.3.1"
    }

    object Glide {
        const val glide = "com.github.bumptech.glide:glide:4.11.0"
        const val compiler = "com.github.bumptech.glide:compiler:4.11.0"
        const val recycler_view = "com.github.bumptech.glide:recyclerview-integration:4.11.0"
    }


    object Jsoup {
        const val jsoup = "org.jsoup:jsoup:1.11.3"
    }

    object Junit {
        const val junit = "junit:junit:4.13"
    }

    object Kotlin {
        const val version = "1.5.31"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${version}"
        const val gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
    }

    object Hilt {
        private const val hiltCoreVersion = "2.36"
        const val hilt_android_gradle_plugin = "com.google.dagger:hilt-android-gradle-plugin:${hiltCoreVersion}"
        const val hiltAndroid = "com.google.dagger:hilt-android:${hiltCoreVersion}"
        const val googleDagger = "com.google.dagger:dagger-lint-aar:${hiltCoreVersion}"
        const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:${hiltCoreVersion}"
        const val hiltAndroidTesting = "com.google.dagger:hilt-android-testing:${hiltCoreVersion}"

        private const val hiltVersion = "1.0.0"
        const val androidxHiltCompiler = "androidx.hilt:hilt-compiler:${hiltVersion}"
        const val androidxHiltCommon = "androidx.hilt:hilt-common:${hiltVersion}"
        const val androidxHiltLifecycleViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03"

    }

}
