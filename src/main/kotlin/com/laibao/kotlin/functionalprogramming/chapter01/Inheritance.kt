package com.laibao.kotlin.functionalprogramming.chapter01

/*
class Biscuit(val flavour: String) {
    fun eat(): String {
        return "nom, nom, nom... delicious $flavour biscuit"
    }
}*/

open class BakeryGood(val flavour: String) {
    fun eat(): String {
        return "nom, nom, nom... delicious $flavour bakery good"
    }

    open fun name(): String {
        return "bakery good"
    }
}

class CupcakeTwo(flavour: String): BakeryGood(flavour) {
    override fun name(): String {
        return "cupcake"
    }
}

class Biscuit(flavour: String): BakeryGood(flavour) {
    override fun name(): String {
        return "biscuit"
    }
}


open class Roll(flavour: String): BakeryGood(flavour) {
    override fun name(): String {
        return "roll"
    }
}

class CinnamonRoll: Roll("Cinnamon")


open class Donut(flavour: String, val topping: String) : BakeryGood(flavour) {
    override fun name(): String {
        return "donut with $topping topping"
    }
}


fun main(args: Array<String>) {
    val myBlueberryCupcake: BakeryGood = CupcakeTwo("Blueberry")
    println(myBlueberryCupcake.eat())

    val myDonut = Donut("Custard", "Powdered sugar")
    println(myDonut.eat())
}