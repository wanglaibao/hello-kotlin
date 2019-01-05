package com.laibao.kotlin.chapter01

import java.math.BigDecimal
import java.math.BigInteger

fun main(args: Array<String>) {
    val x = BigInteger("1")
    val y = 42.toBigInteger()
    val z = 420000L.toBigInteger()
    println(x)
    println(y)
    println(z)
    println()


    val h = BigDecimal("1.0")
    val k = 100.00.toBigDecimal()
    println(h)
    println(k)
}