package com.laibao.kotlin.chapter04

fun main(args: Array<String>) {
    println()
    println(plusOne(100))
    println()
    println(plusTwo(100))
    println()

    println(plus1(1000))
    println(x)
}


/**
 * single-expression
 */
fun plusOne(i: Int) = i + 1

fun plusTwo(i: Int): Int = i + 2



/**
 * multiline
 */
fun plus1(i: Int): Int {
    return i + 1
}


// calling a function
val x = plus1(1)