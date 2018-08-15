package kr.co.sleeptime.androidseed.rx

import androidx.annotation.MainThread
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import timber.log.Timber
import java.util.concurrent.atomic.AtomicBoolean

class SingleLiveEvent<T : Any?> : MutableLiveData<T>() {

    private val mPending: AtomicBoolean = AtomicBoolean(false)
    private var _oldOwner: LifecycleOwner? = null

    @MainThread
    override fun observe(owner: LifecycleOwner, observer: Observer<in T>) {
        if (hasActiveObservers()) {
            Timber.w("마지막 옵저버에만 이벤트가 전달됩니다.")
        }
        _oldOwner?.let {
            removeObservers(it)
        }
        _oldOwner = owner
        super.observe(owner, Observer<T> {
            if (mPending.compareAndSet(true, false)) {
                observer.onChanged(it)
            }
        })
    }

    @MainThread
    override fun setValue(value: T?) {
        mPending.set(true)
        super.setValue(value)
    }

    @MainThread
    fun call() {
        mPending.set(true)
        super.setValue(null)
    }

    companion object {
        const val TAG = "SingleLiveEvent"
    }
}
