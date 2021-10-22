package kr.co.sleeptime.androidseed.main

import android.os.Bundle
import androidx.core.view.OnApplyWindowInsetsListener
import androidx.core.view.WindowInsetsAnimationCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import kr.co.sleeptime.androidseed.R
import kr.co.sleeptime.androidseed.databinding.FragmentMainBinding
import kr.co.sleeptime.androidseed.fragment.InsetsCallbackBinding
import kr.co.sleeptime.androidseed.fragment.ViewBinding
import kr.co.sleeptime.androidseed.fragment.RootViewDeferringInsetsCallback

class MainFragment : Fragment(R.layout.fragment_main),
    ViewBinding<FragmentMainBinding>,
    InsetsCallbackBinding {
    override val bindingClass: Class<FragmentMainBinding> = FragmentMainBinding::class.java
    override var binding: FragmentMainBinding? = null

    private val insetsCallback = RootViewDeferringInsetsCallback(
        persistentInsetTypes = WindowInsetsCompat.Type.systemBars(),
        deferredInsetTypes = WindowInsetsCompat.Type.ime()
    )

    override val windowInsetsAnimationCallback: WindowInsetsAnimationCompat.Callback =
        insetsCallback
    override val onApplyWindowInsetsListener: OnApplyWindowInsetsListener = insetsCallback
    override val defaultLightTheme: Boolean = true


    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        requireBinding.text.text = "hello there!"
    }


}