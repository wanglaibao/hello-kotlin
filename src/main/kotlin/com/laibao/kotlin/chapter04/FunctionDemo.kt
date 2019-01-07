package com.laibao.kotlin.chapter04

fun main(args: Array<String>) {
    println(addThenDouble(5,5))
    addAndPrint(1,2)
    addAndPrintln(10,10)
    println()

    connect()
    connect(2500)
    connect(10000, "https")

    printName(firstName="Hala", lastName="Terra")

    printName(lastName="戈", firstName="金")

    println(localFunctionExample(100,200))
}



/**
 * One-line functions (single-expression)
 */

fun plus2(i: Int): Int = i + 2

fun plus3(i: Int) = i + 3


/**
 * Multiline functions with return values
 */
fun addThenDouble(a: Int, b: Int): Int {
    val sum = a + b
    return sum * 2
}


/**
 * Multiline functions without return values
 */
fun addAndPrint(a: Int, b: Int) {
    val sum = a + b
    println(sum)
}

fun addAndPrintln(a: Int, b: Int): Unit {
    val sum = a + b
    println(sum)
}


/**
 * Function parameters can have default values
 */
fun connect(timeout: Int = 5000, protocol: String = "http"): Unit {
    println("timeout = ${timeout}, protocol = ${protocol}")
}


/**
 * Functions can use named arguments
 */
fun printName(firstName: String, lastName: String) {
    println("Your name is ${firstName} ${lastName}")
}



fun localFunctionExample(a: Int, b: Int): Int {
    fun add(a: Int, b: Int) = a + b  //local function
    fun double(a: Int) = a * 2       //local function
    return double(add(a, b))
}