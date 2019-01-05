package com.laibao.kotlin.chapter01

/**
 * a val variable must be initialized exactly once during the execution of the block where it’s defined,
 * but we can initialize it with different values depend on some condition.
 */
fun main(args: Array<String>) {

    val name: String

    val num: Int

    val r = (1..10).shuffled().first()

    //assign `name` and `num`
    name = if (r % 2 == 0) "jinge" else "alading"

    num = r

    println("name = $name, num = $num")
}