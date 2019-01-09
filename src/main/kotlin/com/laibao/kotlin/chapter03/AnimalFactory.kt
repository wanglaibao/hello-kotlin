package com.laibao.kotlin.chapter03

fun main(args: Array<String>) {
    val c = catFactory()
    // Indeed prints "Cat"
    println(c.name)
}

class Cat {
    val name = "Cat"
}

fun catFactory() : Cat = Cat()
