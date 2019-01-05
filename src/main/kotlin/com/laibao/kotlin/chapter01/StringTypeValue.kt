package com.laibao.kotlin.chapter01

/**
 *  String templates
 *  Multiline strings
 *  How to convert a list or array to a String
 */
fun main(args: Array<String>) {

    /**
     * String templates
     */

    val firstName = "金"
    val lastName = "戈"

    val name = "$firstName $lastName"

    println("Name: $name")

    val x = 2
    val y = 3
    println("$x times $y is ${x * y}.")
}