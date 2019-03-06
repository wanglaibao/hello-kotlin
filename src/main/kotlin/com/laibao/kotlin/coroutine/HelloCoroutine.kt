package com.laibao.kotlin.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    println("Start")

    //Start a coroutine
    GlobalScope.launch {
        delay(10000)
        println("Hello")
    }

    Thread.sleep(20000) // wait for 2 seconds
    println("Stop")
}