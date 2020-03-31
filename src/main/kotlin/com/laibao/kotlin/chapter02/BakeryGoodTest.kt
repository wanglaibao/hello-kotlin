package com.laibao.kotlin.chapter02

open class BakeryGood(val flavour: String) {

    fun eat(): String {
        return "nom, nom, nom... delicious $flavour bakery good"
    }
}

class Cupcake(flavour: String): BakeryGood(flavour)

class Biscuit(flavour: String): BakeryGood(flavour)

fun main() {
    val emptyList1 = listOf<Any>()
    val emptyList2 = emptyList<Any>()
    println("emptyList1.size = ${emptyList1.size}")
    println("emptyList2.size = ${emptyList2.size}")

    val cupcake = Cupcake("Cupcake")
    val biscuit = Biscuit("Biscuit")

    println(cupcake.eat())

    println(biscuit.eat())

}

