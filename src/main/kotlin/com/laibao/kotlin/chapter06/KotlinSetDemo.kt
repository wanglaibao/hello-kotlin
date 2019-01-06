package com.laibao.kotlin.chapter06

fun main(args: Array<String>) {
    // [3, 5, 1]
    val set1 = setOf(3, 5, 1)
    // [5, 1, 3]
    val set2 = hashSetOf(3, 5, 1)
    // [3, 5, 1]
    val set3 = linkedSetOf(3, 5, 1)
    // [1, 3, 5]
    val set4 = sortedSetOf(3, 5, 1)
    // [3, 5, 1]
    val set5 = mutableSetOf(3, 5, 1)

    println(set1.javaClass)
    println(set1.javaClass.kotlin)
    println(set1.javaClass.simpleName)

    println(set2.javaClass)
    println(set2.javaClass.kotlin)
    println(set2.javaClass.simpleName)

    println(set3.javaClass)
    println(set3.javaClass.kotlin)
    println(set3.javaClass.simpleName)

    println(set4.javaClass)
    println(set4.javaClass.kotlin)
    println(set4.javaClass.simpleName)

    println(set5.javaClass)
    println(set5.javaClass.kotlin)
    println(set5.javaClass.simpleName)
}