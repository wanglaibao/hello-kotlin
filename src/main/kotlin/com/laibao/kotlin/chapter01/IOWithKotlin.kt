package com.laibao.kotlin.chapter01

import java.util.*


fun main(args: Array<String>) {

    /**
     * Writing to STDOUT and STDERR
     */
    // includes newline
    println("Hello, world")

    // no newline character
    print("Hello without newline")
    println()

    System.err.println("yikes, an error happened")


    /**
     * Reading command-line input
     * 1: A simple way to read command-line (console) input is with the readLine() function:
     */

    println("Enter your name: ")
    val name = readLine()

    /**
     * readLine() provides a simple way to read input.
     * For more complicated needs we can also use the java.util.Scanner class, as shown in below example
     */

    val scanner = Scanner(System.`in`)
    print("Enter an int: ")
    val i: Int = scanner.nextInt()
    println("i = $i")

}