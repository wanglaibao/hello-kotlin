package com.laibao.kotlin.chapter02

fun main(args: Array<String>) {
    val numberList = listOf(1,2,3)
    for (element in numberList) { println(element)}
    println()

    for (element in 1 ..  300) {
        System.err.println(element)
    }
    println()

    for (element in 1 until 100) {
        println(element)
    }


    // directly on listOf
    for (n in listOf(1,2,3)) println(n)
    println()

    // 1..3 creates a range
    for (n in 1..3) println(n)
    println()


    /**
     * Using for with Maps
     */

    val ratings = hashMapOf(
            "Lady in the Water"  to 3.0,
            "Snakes on a Plane"  to 4.0,
            "You, Me and Dupree" to 3.5
    )

    for ((name,rating) in ratings) println("Movie: $name, Rating: $rating")

    /**
     * for is not an expression
     */

    // error
//    val x = for (n in 1..3) {
//        return n * 2
//    }
}