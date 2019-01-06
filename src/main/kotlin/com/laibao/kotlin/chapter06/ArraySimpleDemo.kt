package com.laibao.kotlin.chapter06

fun main(args: Array<String>) {

    /**
     * Arrays are created with various arrayOf functions.
     * Here are two ways to create arrays (implicit and explicit syntax)
     */

    val x = arrayOf(1,2,3)

    val y: Array<Int> = arrayOf(1,2,3)

    println(x.javaClass)

    println(y.javaClass)

    println(x.javaClass.simpleName)

    println(y.javaClass.simpleName)

    println(x.javaClass.name)

    println(y.javaClass.name)

    println(x.javaClass.canonicalName)

    println(y.javaClass.canonicalName)


    val w = arrayOf("a", "b", "c")

    val z: Array<String> = arrayOf("a", "b", "c")

    println(w.javaClass)

    println(z.javaClass)


    println(w.javaClass.simpleName)

    println(z.javaClass.simpleName)

    println(w.javaClass.canonicalName)

    println(z.javaClass.canonicalName)
}