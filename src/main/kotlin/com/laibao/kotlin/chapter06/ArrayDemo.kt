package com.laibao.kotlin.chapter06

fun main(args: Array<String>) {
    /**
     * Array creation functions
     * Kotlin has these array-creation functions that are listed in kotlin.Library.kt:
     */

    /**
        fun <reified @PureReifiable T> arrayOfNulls(size: Int): Array<T?>
        fun doubleArrayOf(vararg elements: Double): DoubleArray
        fun floatArrayOf(vararg elements: Float): FloatArray
        fun longArrayOf(vararg elements: Long): LongArray
        fun intArrayOf(vararg elements: Int): IntArray
        fun charArrayOf(vararg elements: Char): CharArray
        fun shortArrayOf(vararg elements: Short): ShortArray
        fun byteArrayOf(vararg elements: Byte): ByteArray
        fun booleanArrayOf(vararg elements: Boolean): BooleanArray
    */

    /**
     * Warning: Array is not the same as IntArray
     */

    val b = arrayOf(1,2,3)
    println("the b.javaClass is ${b.javaClass}")
    println("the b.javaClass.name is ${b.javaClass.name}")
    println("the b.javaClass.simpleName is ${b.javaClass.simpleName}")
    println("the b.javaClass.kotlin is ${b.javaClass.kotlin}")

    println()
    println()
    val c = intArrayOf(1,2,3)
    println("the c.javaClass is ${c.javaClass}")
    println("the c.javaClass.name is ${c.javaClass.name}")
    println("the c.javaClass.simpleName is ${c.javaClass.simpleName}")
    println("the c.javaClass.kotlin is ${c.javaClass.kotlin}")
}