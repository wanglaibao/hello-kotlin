package com.laibao.kotlin.invariance

fun main() {
    val oranges = Crate(mutableListOf(Orange(), Orange()))
    //foo(oranges)
    val orange: Orange = oranges.last()
}

open class Fruit

class Apple : Fruit()

class Orange : Fruit()

class Crate<T>(val elements: MutableList<T>) {
    fun add(t: T) = elements.add(t)

    fun last(): T = elements.last()
}

fun foo(crate: Crate<Fruit>): Unit {
    crate.add(Apple()) // does not compile
}

class CovariantCrate<out T>(val elements: List<T>)