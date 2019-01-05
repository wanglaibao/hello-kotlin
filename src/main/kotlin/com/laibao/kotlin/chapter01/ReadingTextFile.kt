package com.laibao.kotlin.chapter01

import java.io.File

fun main(args: Array<String>) {

    val filename:String = "C:\\application.properties"
    val lines = readFile(filename)
    //lines.forEach{ println(it) }
    lines.forEach{ line -> println(line) }

    println()
    System.err.println("afdasfdasfa")
    val lines_1 = readFile_1(filename)
    lines_1.forEach{ line -> println(line) }

    println()
    println()

    val lines_2 = readFile_2(filename)
    lines_2.forEach{ line -> println(line) }

    println()
    println()

    val lines_3 = readFile_3(filename)
    lines_3.forEach{ line -> println(line) }
    println()
    println()

    val text = File("C:\\application.properties").bufferedReader().use { it.readText() }
    System.err.println(text)

}


/**
 * @param filename
 * this approach isn’t recommended for large text files,
 * it’s a simple way to read small-ish text files into a List<String>
 */
fun readFile(filename: String): List<String> = File(filename).readLines()



fun readFile_1(filename: String): List<String> = File(filename).bufferedReader().readLines()

fun readFile_2(filename: String): List<String> = File(filename).useLines { it.toList() }

fun readFile_3(filename: String): String = File(filename).inputStream().readBytes().toString(Charsets.UTF_8)

// This method is not recommended on huge files. It has an internal limitation of 2 GB byte array size.
//fun File.readBytes(): ByteArray

// This method is not recommended on huge files. It has an internal limitation of 2 GB file size.
//fun File.readText(charset: Charset = Charsets.UTF_8): String