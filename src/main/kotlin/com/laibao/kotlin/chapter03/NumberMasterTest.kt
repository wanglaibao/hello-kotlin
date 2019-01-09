package com.laibao.kotlin.chapter03

fun main(args: Array<String>) {
    println(NumberMaster.valueOf("123"))
    val listOfStrings = mutableListOf("a", "b", "c")
    listOfStrings.forEach { println() }

    listOfStrings.add("11111")
}