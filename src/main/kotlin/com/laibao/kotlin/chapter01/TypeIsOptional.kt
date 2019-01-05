package com.laibao.kotlin.chapter01

fun main(args: Array<String>) {
    val count: Int = 1
    val name: String = "jinge"

    println("the count is $count and the name is $name")

    val count1 = 100
    val name1 = "Alvin"
    println("the count1 is $count1 and the name1 is $name1")

    val person = Person("金戈")
    println("the person's name is ${person.name}")
}

class Person(val name:String)