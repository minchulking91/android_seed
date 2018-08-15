package kr.co.sleeptime.androidseed.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    @get:LayoutRes
    abstract val layoutRes: Int
    open val isUseDataBinding: Boolean = false


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if (layoutRes != 0) {
            return if (!isUseDataBinding) {
                inflater.inflate(layoutRes, container, false)
            } else {
                onDataBinding(inflater, container)
            }
        }
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    open fun onDataBinding(inflater: LayoutInflater, container: ViewGroup?): View? {
        return null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews(view)
    }

    open fun setupViews(view: View) {

    }
}