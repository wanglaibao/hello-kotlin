package com.laibao.kotlin.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    // Suspend functions are only allowed to be called from a coroutine or another suspend function
    // delay(1000)

    println("Start")

    runBlocking {
        delay(2000)
    }

    //Start a coroutine
    GlobalScope.launch {
        delay(10000)
        println("Hello")
    }

    Thread.sleep(20000) // wait for 2 seconds
    println("Stop")
}