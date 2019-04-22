package com.laibao.kotlin.coroutine

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import java.util.*
import kotlin.concurrent.schedule
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine
import kotlin.system.measureTimeMillis

class PersonalDetails1(val name: String)

class FinancialDetails1(val amount: Long)

fun main() = runBlocking<Unit>{

    val timeMillis = measureTimeMillis {
        val personalDetails = async { loadPersonalDetails() }
        val financialDetails = async { loadFinancialDetails() }

        println("name = ${personalDetails.await().name}, " + "amount = ${financialDetails.await().amount}")
    }

    println ("time = $timeMillis") // time = 4017


    async { loadImageAsync1("金戈") }

}

suspend fun mySleep2(delay: Long): Unit = suspendCoroutine { callback ->
    timer.schedule(delay) {
        callback.resume(Unit)
    }
}

suspend fun loadPersonalDetails2(): PersonalDetails1 {
    mySleep2(2_000)
    return PersonalDetails1("John")
}

suspend fun loadFinancialDetails2(): FinancialDetails1 {
    mySleep2(4_000)
    return FinancialDetails1(120)
}


private val timer = Timer(true)




suspend fun loadImageAsync1(name: String): String {
    delay(2000)
    return "asfdasfdasdfasdfasd"
}