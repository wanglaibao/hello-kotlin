package com.laibao.kotlin.chapter02

import java.io.BufferedReader
import java.io.File
import java.io.FileNotFoundException
import java.io.IOException

/**
 * Basic syntax
 * try {
 *       // some exception-throwing code
 *   }
 *   catch (e: SomeException) {
 *       // code
 *   }
 *   catch (e: SomeOtherException) {
 *       // code
 *   }
 *   finally {
 *       // optional
 *   }
 */
fun main(args: Array<String>) {
    val filename = "C:\\application.properties"
    var linesFromFile = listOf<String>()
    var br: BufferedReader? = null

    try {
        br = File(filename).bufferedReader()
        linesFromFile = br.readLines()
    }
    catch (e: IOException) {
        e.printStackTrace()
    }
    catch (e: FileNotFoundException) {
        e.printStackTrace()
    }
    finally {
        br?.close()
    }

    linesFromFile.forEach { println(">  " + it) }


    println()
    println()
    println()


    /**
     * Try is an expression
     * Try in Kotlin is different than Java because Kotlin’s try is an expression, meaning that it returns a value
     */

    val s = "1"

    // using try as an expression
    val i = try {
        s.toInt()
    }
    catch (e: NumberFormatException) {
        0
    }

    println("the s value is $s")

    val l = "foo"
    val m = try { l.toInt() } catch (e: NumberFormatException) { 0 }
    println("the m value is $m")
}