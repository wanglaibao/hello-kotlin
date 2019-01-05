package com.laibao.kotlin.chapter02

fun main(args: Array<String>) {

    /**
     * Kotlin when expressions are like Java switch statements, but we’ll see in this lesson, they’re much more powerful.
     * when expression is similar to Scala’s match expression
     */

    /**
     * Replacement for switch
     */

    val dayAsInt = 1

    when (dayAsInt) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> {
            // notice you can use a block
            println("invalid day")
        }
    }
}