package kr.co.sleeptime.androidseed.utils


class Event<out T> private constructor(val content: T?) {

    override fun toString(): String {
        return "Event{$content, handled: $hasBeenHandled}"
    }

    var hasBeenHandled = false
        private set // Allow external read but not write

    /**
     * Returns the content and prevents its use again.
     */
    fun getContentIfNotHandled(): T? {
        return if (hasBeenHandled) {
            null
        } else {
            hasBeenHandled = true
            content
        }
    }

    fun handleWith(run: T.() -> Unit) {
        if (hasBeenHandled) {
            return
        } else {
            content?.let {
                hasBeenHandled = true
                run.invoke(it)
            }
        }
    }

    fun handleLet(run: (T) -> Unit) {
        if (hasBeenHandled) {
            return
        } else {
            content?.let {
                hasBeenHandled = true
                run.invoke(it)
            }
        }
    }

    /**
     * Returns the content, even if it's already been handled.
     */
    fun peekContent(): T = content!!


    companion object {
        fun <T> get(content: T): Event<T> {
            return Event(content)
        }

        fun <T> orEmpty(content: T?): Event<T> {
            return Event(content)
        }

        fun <T> empty(): Event<T> {
            return Event(null)
        }
    }
}