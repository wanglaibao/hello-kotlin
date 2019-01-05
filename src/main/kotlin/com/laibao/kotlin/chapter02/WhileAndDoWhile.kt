package com.laibao.kotlin.chapter02

fun main(args: Array<String>) {

    /**
     * while
     */

    var i = 0

    while (i < 100) {
        println(i++)
    }

    println()
    println()

    /**
     *  do..while
     */

    var j = 1

    do {
        println(j++)
    } while (j < 0)
}