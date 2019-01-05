package com.laibao.kotlin.chapter01
/**
 *  Use javaClass to see an object’s type
 */
fun main(args: Array<String>) {

    val StringJavaClass  = "foo".javaClass
    println(StringJavaClass)
    println()

    val intJavaClass = 100.javaClass
    println(intJavaClass)
    println()

    val doubleJavaType = 100.0.javaClass
    println(doubleJavaType)
    println()

    val map = hashMapOf(1 to "one", 2 to "two")
    println(map.javaClass)
    println()

    val list = listOf(1,2,3).javaClass
    println(list)
    println()

    val arrayList = arrayListOf(1,2,3).javaClass
    println(arrayList)
    println()

    /*
        The following examples on the result of intArrayOf show other calls you can make after javaClass
     */
    val x = intArrayOf(1,2,3)
    println(x.javaClass.simpleName)
    println(x.javaClass.canonicalName)
    println(x.javaClass.name)
    println()
    println(x.javaClass.kotlin)
    println(x.javaClass.kotlin.qualifiedName)
}