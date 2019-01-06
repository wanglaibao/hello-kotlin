package com.laibao.kotlin.chapter06

fun main(args: Array<String>) {

    val list1 = listOf(1, 2, 3)
    val list2 = arrayListOf(1, 2, 3)
    val list3 = mutableListOf("a", "b", "c")

    println(list1.javaClass)
    println(list2.javaClass)
    println(list3.javaClass)

    println(list1.javaClass.kotlin)
    println(list2.javaClass.kotlin)
    println(list3.javaClass.kotlin)


    // empty lists
    val intList = listOf<Int>()
    val doubleList = arrayListOf<Double>()
    val stringList = mutableListOf<String>()
    val emplist: List<Int> = emptyList()

    println(intList)
    println(doubleList)
    println(stringList)
    println(emplist)


    // nullability (implicit or explicit)
    // [a, null]
    val nullableList = listOf("a", null)
    println(nullableList)

    // [a, null]
    val nullableStringList: List<String?> = listOf("a", null)
    println(nullableStringList)


    // [a, null]
    val list_1 = arrayListOf("a", null)

    // [a, null]
    val list_2 = mutableListOf("a", null)

    // [a]
    val list_3 = listOfNotNull<String>("a", null)

    // [a]
    val list_4 = listOfNotNull("a", null)
    println(list_1)
    println(list_2)
    println(list_3)
    println(list_4)



    /**
     * comparison: listOf vs listOfNotNull
     * listOf: Returns an immutable list containing only the specified object element.
     * listOfNotNull: Returns a new read-only list either of single given element,
     * if it is not null, or empty list if the element is null.
     */
    // [a, null]
    val list_5 = listOf("a", null)

    // [a]
    val list_6 = listOfNotNull("a", "b",null)

    println(list_5)
    println(list_6)

}