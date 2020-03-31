package com.laibao.kotlin.functionalprogramming.chapter01


fun main(args: Array<String>) {
    val anyGood = BakeryGood("Generic flavour")

    val myDonut = Donut("Custard", "Powdered sugar")
    val mario = Customer("Mario")
    mario.eats(myDonut)


    // object expression
    mario.eats(object : BakeryGood("TEST_1") {
        override fun name(): String {
            return "TEST_2"
        }
    })
}

abstract class BakeryGoodTwo(val flavour: String) {
    fun eat(): String {
        return "nom, nom, nom... delicious $flavour ${name()}"
    }

    open fun name(): String {
        return "bakery good"
    }
}

abstract class BakeryGoodThree(val flavour: String) {
    fun eat(): String {
        return "nom, nom, nom... delicious $flavour ${name()}"
    }

    abstract fun name(): String
}


class Customer(val name: String) {
    fun eats(food: BakeryGood) {
        println("$name is eating... ${food.eat()}")
    }
}

abstract class BakeryGoodFour(val flavour: String) {
  fun eat(): String {
    return "nom, nom, nom... delicious $flavour ${name()}"
  }

  fun bake(): String {
    return "is hot here, isn't??"
  }

  abstract fun name(): String
}

/*
abstract class Bakeable {
    fun bake(): String {
        return "is hot here, isn't??"
    }
}
*/

/*
class CupcakeThree(flavour: String) : BakeryGood(flavour), Bakeable() { //Compilation error: Only one class may appear in a supertype list
    override fun name(): String {
        return "cupcake"
    }
}
*/


interface Bakeable {
    fun bake(): String {
        return "is hot here, isn't??"
    }
}

class CupcakeThree(flavour: String) : BakeryGood(flavour), Bakeable {
    override fun name(): String {
        return "cupcake"
    }
}

interface Fried {
    fun fry(): String
}

open class DonutTwo(flavour: String, val topping: String) : BakeryGood(flavour), Fried {
    override fun fry(): String {
        return "*swimming on oil*"
    }

    override fun name(): String {
        return "donut with $topping topping"
    }
}