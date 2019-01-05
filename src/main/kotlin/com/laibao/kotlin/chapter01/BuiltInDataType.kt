package com.laibao.kotlin.chapter01

fun main(args: Array<String>) {
    /**
     * Kotlin comes with the standard numeric data types you’d expect,
     * and in Kotlin all of these data types are full-blown objects — not primitive data types
     */

    val b: Byte = 1
    val i: Int = 1
    val l: Long = 1
    val s: Short = 1
    val d: Double = 2.0
    val f: Float = 3.0f

    /**
     * In the first four examples, if you don’t explicitly specify a type,
     * the number 1 will default to an Int,
     * so if we want one of the other data types — Byte, Long, or Short — we need to explicitly declare those types, as shown.
     * Numbers with a decimal (like 2.0) will default to a Double, so if we want a Float we need to declare a Float, as shown in the last example.
     * We can also declare Long and Float types like this:
     */

    val longNumber = 1L
    val floatNumber = 3.0f


    /**
     * Because Int and Double are the default numeric types,
     * we typically create them without explicitly declaring the data type:
     *
     */

    val intNumber = 123   // defaults to Int
    val doubleNumber = 1.0   // defaults to Double
}
