package kr.co.sleeptime.androidseed.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

object ViewBindingFragmentLifecycleCallback : FragmentManager.FragmentLifecycleCallbacks() {
    override fun onFragmentViewCreated(
        fm: FragmentManager,
        f: Fragment,
        v: View,
        savedInstanceState: Bundle?
    ) {
        super.onFragmentViewCreated(fm, f, v, savedInstanceState)
        if (f is ViewBinding<*>) {
            f.injectBinding(
                f.bindingClass.getDeclaredMethod("bind", View::class.java)
                    .invoke(null, v)
            )
        }
    }

    override fun onFragmentViewDestroyed(fm: FragmentManager, f: Fragment) {
        super.onFragmentViewDestroyed(fm, f)
        if (f is ViewBinding<*>) {
            f.clearBinding()
        }
    }

}