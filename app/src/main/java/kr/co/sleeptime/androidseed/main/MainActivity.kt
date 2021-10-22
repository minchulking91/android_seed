package kr.co.sleeptime.androidseed.main

import android.os.Bundle
import androidx.core.view.WindowCompat
import androidx.fragment.app.FragmentActivity
import kr.co.sleeptime.androidseed.R
import kr.co.sleeptime.androidseed.fragment.InsetsCallbackBindingFragmentLifecycleCallback
import kr.co.sleeptime.androidseed.fragment.ViewBindingFragmentLifecycleCallback

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        supportFragmentManager.apply {
            registerFragmentLifecycleCallbacks(ViewBindingFragmentLifecycleCallback, true)
            registerFragmentLifecycleCallbacks(InsetsCallbackBindingFragmentLifecycleCallback, true)
        }
        setContentView(R.layout.activity_main)
    }
}
