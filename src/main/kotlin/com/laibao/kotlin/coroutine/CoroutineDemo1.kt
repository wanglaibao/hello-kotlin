package com.laibao.kotlin.coroutine

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.*
import kotlin.concurrent.schedule
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

fun main() = runBlocking<Unit>{

    val jobs = List(1000_000) {
        launch {
            mySleep(5_000)
            println(" ---------------------------------- ")
        }
    }

    jobs.forEach { it.join() }
}

private val timer = Timer(true)

suspend fun mySleep(delay: Long): Unit = suspendCoroutine { callback ->
    timer.schedule(delay) {
        callback.resume(Unit)
    }
}










































