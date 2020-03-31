package com.laibao.kotlin.functionalprogramming.chapter01

interface OvenTwo {
    fun process(product: Bakeable)
}

interface Machine<T> {
    fun process(product: T)
}

interface OvenThree: Machine<Bakeable>