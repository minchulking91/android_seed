package kr.co.sleeptime.androidseed.utils

import androidx.lifecycle.Observer

class EventObserver<T>(private val onHandle: (T) -> Unit) : Observer<Event<T>> {
    override fun onChanged(t: Event<T>?) {
        t?.handleLet {
            onHandle.invoke(it)
        }
    }
}