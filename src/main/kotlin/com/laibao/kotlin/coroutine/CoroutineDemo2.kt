package com.laibao.kotlin.coroutine

import kotlinx.coroutines.runBlocking
import java.util.*
import kotlin.concurrent.schedule
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine
import kotlin.system.measureTimeMillis

class PersonalDetails(val name: String)

class FinancialDetails(val amount: Long)


fun main() = runBlocking<Unit>{

    val timeMillis = measureTimeMillis {
        val personalDetails = loadPersonalDetails()

        val financialDetails = loadFinancialDetails()

        println("name = ${personalDetails.name}, " + "amount = ${financialDetails.amount}")
    }

    println ("time = $timeMillis")   // time = 6045
}

private val timer = Timer(true)

suspend fun mySleep1(delay: Long): Unit = suspendCoroutine { callback ->
    timer.schedule(delay) {
        callback.resume(Unit)
    }
}

suspend fun loadPersonalDetails(): PersonalDetails {
    mySleep1(2_000)
    return PersonalDetails("John")
}

suspend fun loadFinancialDetails(): FinancialDetails {
    mySleep1(4_000)
    return FinancialDetails(120)
}


















