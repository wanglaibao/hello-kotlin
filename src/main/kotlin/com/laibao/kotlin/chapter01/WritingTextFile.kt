package com.laibao.kotlin.chapter01

import java.io.File

fun main(args: Array<String>) {
    val filename = "C:\\application_test.properties"
    File(filename).writeText("我是金戈我是金戈我是金戈")


    /**
     * Other ways to write files
     */

    val byteArray = "我是中国人是".toByteArray()
    File(filename).writeBytes(byteArray)
    System.err.println("我是金哥")

    File(filename).printWriter().use { out -> out.write("asdfasfdaf") }

    System.err.println("我是金哥")

    File(filename).bufferedWriter().use { out -> out.write("fddasdfasdfasfdasfasfdasfdasf") }

    System.err.println("我是金戈")
}