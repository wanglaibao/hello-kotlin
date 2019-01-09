package com.laibao.kotlin.chapter03

class Box<T> {
    private var inside: T? = null

    fun put(t: T) {
        inside = t
    }

    fun get(): T? = inside
}