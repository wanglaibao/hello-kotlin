package com.laibao.kotlin.chapter01

fun showFirstCharacter(input:String):Char{
    if(input.isEmpty()) throw IllegalArgumentException()
    return input.first()
}


interface StudentFactory {
    fun create(name: String): Student
}

class Student private constructor(val name: String) {
    companion object : StudentFactory{
        override fun create(name: String): Student {
            return Student(name)
        }
    }

    fun hehe():Unit {
        println("呵呵呵呵呵呵呵呵呵呵呵")
    }
}

fun main(args: Array<String>) {

    val student11 = Student.create("金戈")
    student11.hehe()
}