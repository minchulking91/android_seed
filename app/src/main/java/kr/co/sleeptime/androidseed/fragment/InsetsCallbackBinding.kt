package kr.co.sleeptime.androidseed.fragment

import androidx.core.view.OnApplyWindowInsetsListener
import androidx.core.view.WindowInsetsAnimationCompat

interface InsetsCallbackBinding {
    val windowInsetsAnimationCallback: WindowInsetsAnimationCompat.Callback?
    val onApplyWindowInsetsListener: OnApplyWindowInsetsListener?
    val defaultLightTheme: Boolean
}