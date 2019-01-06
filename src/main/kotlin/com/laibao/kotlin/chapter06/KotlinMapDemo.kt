package com.laibao.kotlin.chapter06

fun main(args: Array<String>) {

    // {b=2, a=1}
    val map1 = mapOf("b" to 2, "a" to 1)

    // {a=1, b=2}
    val map2 = hashMapOf("b" to 2, "a" to 1)

    // {b=2, a=1}
    val map3 = linkedMapOf("b" to 2, "a" to 1)

    // {a=1, b=2}
    val map4 = sortedMapOf("b" to 2, "a" to 1)

    // {b=2, a=1}
    val map5 = mutableMapOf("b" to 2, "a" to 1)


    println(map1.javaClass)
    println(map1.javaClass.kotlin)
    println(map2.javaClass)
    println(map2.javaClass.kotlin)
    println(map3.javaClass)
    println(map3.javaClass.kotlin)
    println(map4.javaClass)
    println(map4.javaClass.kotlin)
    println(map5.javaClass)
    println(map5.javaClass.kotlin)
}