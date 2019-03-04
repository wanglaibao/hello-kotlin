package com.laibao.kotlin.chapter01

import java.sql.Connection

class PersonExample constructor (val firstName: String, val lastName: String, val age: Int?){
    init{
        require(firstName.trim().length > 0) { "Invalid firstName argument." }

        require(lastName.trim().length > 0) { "Invalid lastName argument." }

        if (age != null) {
            require(age >= 0 && age < 150) { "Invalid age argument." }
        }

    }

    constructor(firstName: String, lastName: String): this(firstName, lastName,null)


}

class PersonExample2(firstName: String, lastName: String, howOld: Int?) {
    private val name: String

    private val age: Int?

    init {
        this.name = "$firstName,$lastName"
        this.age = howOld
    }

    fun getName(): String = this.name

    fun getAge(): Int? = this.age
}

class Database internal constructor(connection: Connection)

class OuterClassName {
    class NestedClassName {
    }
}


class Outer {
    internal class StaticNested
    internal inner class Inner
}

fun main(args: Array<String>) {
    val person1 = PersonExample("Alex", "Smith", 29)

    val person2 = PersonExample("Jane", "Smith", null)

    println("${person1.firstName},${person1.lastName} is ${person1.age} years old")

    println("${person2.firstName},${person2.lastName} is ${person2.age?.toString() ?: "?"} years old")

    val person3 = PersonExample("Jane", "Smith")
    println("${person3.firstName},${person3.lastName} is ${person3.age?.toString() ?: "?"} years old")


    val person4 = PersonExample2("Alex", "Smith", 29)

    val person5 = PersonExample2("Jane", "Smith", null)

    println("${person4.getName()} is ${person4.getAge()} years old")

    println("${person5.getName()} is ${person5.getAge().toString() ?: "?"} years old")
}
