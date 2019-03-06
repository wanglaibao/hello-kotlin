package com.laibao.kotlin.chapter01

fun main() {
    val intArray = arrayOf(1, 2, 3, 4)
    println("Int array:${intArray.joinToString(",")}")
    println("Element at index 1 is:${intArray[1]}")


    val stringArray = arrayOfNulls<String>(3)
    stringArray[0] = "a"
    stringArray[1] = "b"
    stringArray[2] = "c"

    //stringArrays[3]="d" --throws index out of bounds exception
    println("String array:${stringArray.joinToString(",")}")


    val peopleArray = Array<People>(2) { index ->
        when (index) {
            0 -> People(1, "Alexandra", "Brook")
            1 -> People(2, "James", "Smith")
            else ->throw IllegalArgumentException("Too many")
        }
    }

    println("People array:${peopleArray.joinToString(",")}")
    println("People at index 0:${peopleArray[0]}")

    val longArray = emptyArray<Long>()
    println("Long array:${longArray.joinToString(",")}")
}


data class People(val id:Int,val firstName:String,val lastName:String)