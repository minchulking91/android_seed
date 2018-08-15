package kr.co.sleeptime.androidseed.rx

import io.reactivex.Observable
import io.reactivex.subjects.BehaviorSubject
import io.reactivex.subjects.Subject


class Variable<T>(private var value: T) {

    private val serializedSubject: Subject<T> = BehaviorSubject.createDefault(value).toSerialized()

    @Synchronized
    fun get(): T? {
        return value
    }

    @Synchronized
    fun set(value: T) {
        this.value = value
        serializedSubject.onNext(this.value)
    }

    fun asObservable(): Observable<T> {
        return serializedSubject
    }
}