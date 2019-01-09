package com.laibao.kotlin.chapter03

fun main(args: Array<String>) {

    val f = Foo()
    val p = Person("Bill", "Panner")
    val box = Box<Cat1>()

    // This will work
    box.put(Cat1())
    // This will always return a Cat, because that's what our box holds
    val cat = box.get()
    // This won't work, String is not a Cat
    //box.put("Cat")
}

class Foo

class Person constructor(var firstName: String, var lastName: String)


/**
 * The primary constructor is part of the class header.
 * If the primary constructor does not have any annotations or visibility modifiers,
 * the constructor keyword can be omitted
 */

class Student (val firstName: String, val lastName: String)