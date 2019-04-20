package com.laibao.kotlin.inheritance

fun main() {
    with(Cat("cat")) {
        println("Cat created: $this")
        println("Cat abstractFunction: ${abstractFunction()}")
        println("Cat openFunction: ${openFunction()}")
        println("Cat notOpenFunction: ${notOpenFunction()}")
        println("Cat interfaceFunction: ${interfaceFunction()}")
    }
}