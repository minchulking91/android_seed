package kr.co.sleeptime.androidseed.ui

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import kr.co.sleeptime.androidseed.R


abstract class BaseActivity : AppCompatActivity() {

    @get:LayoutRes
    abstract val layoutRes: Int
    open val useToolbar: Boolean = true
    open val isHomeAsUpEnabled: Boolean = true
    open val isUseDataBinding: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (layoutRes != 0) {
            if (!isUseDataBinding) {
                setContentView(layoutRes)
            } else {
                onDataBinding()
            }
            if (useToolbar) {
                setupToolbar()
            }
        }
        setupViews()
    }

    open fun onDataBinding() {

    }

    abstract fun setupViews()

    private fun setupToolbar() {
        findViewById<Toolbar>(R.id.toolbar)?.let {
            setSupportActionBar(it)
            supportActionBar?.apply {
                setDisplayHomeAsUpEnabled(isHomeAsUpEnabled)
                setDisplayShowTitleEnabled(true)
            }
        }
    }

}