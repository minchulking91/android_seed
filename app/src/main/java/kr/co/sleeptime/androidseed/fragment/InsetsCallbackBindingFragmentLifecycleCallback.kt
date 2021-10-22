package kr.co.sleeptime.androidseed.fragment

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

object InsetsCallbackBindingFragmentLifecycleCallback :
    FragmentManager.FragmentLifecycleCallbacks() {
    override fun onFragmentViewCreated(
        fm: FragmentManager,
        f: Fragment,
        v: View,
        savedInstanceState: Bundle?
    ) {
        super.onFragmentViewCreated(fm, f, v, savedInstanceState)
        if (f is InsetsCallbackBinding) {
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.R) {
                ViewCompat.setOnApplyWindowInsetsListener(v, f.onApplyWindowInsetsListener)
            } else {
                ViewCompat.setWindowInsetsAnimationCallback(v, f.windowInsetsAnimationCallback)
                ViewCompat.setOnApplyWindowInsetsListener(v, f.onApplyWindowInsetsListener)
            }
            f.setLightTheme(f.defaultLightTheme)
        }
    }

}