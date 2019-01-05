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


    /**
     * Multiline strings
     */

    val speech0 = """Four score and
               seven years ago
               our fathers ..."""

    println(speech0)
    println()


    val speech1 = """Four score and
               |seven years ago
               |our fathers ...""".trimMargin()
    println(speech1)
    println()

    /**
     * How to convert a list to a String
     */
    val nums = listOf(1,2,3,4,5)
    println(nums)

    val numstrings = nums.joinToString()
    println(numstrings)
    println()

    val numstrings1 = nums.joinToString(
            separator = ", ",
            prefix = "[",
            postfix = "]",
            limit = 3,
            truncated = "there’s more ..."
    )
    println(numstrings1)
    println()

    val wordsArray = arrayOf("Al", "was", "here")
    val wordsArrayToString = wordsArray.joinToString("||")
    println(wordsArrayToString)

    val wordsArrayToString1 = wordsArray.joinToString(separator = " ")
    println(wordsArrayToString1)
}