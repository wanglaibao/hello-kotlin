package com.laibao.kotlin.functionalprogramming.chapter01


fun main() {
    val expression = object {
        val property = ""
        fun method(): Int {
            println("from an object expressions")
            return 42
        }
    }

    val i = "${expression.method()} ${expression.property}"
    println(i)


    val outer = Outer()
    /*
    println(outer.internal.property) // Compilation error: Unresolved reference: property
    */
}

class Outer {
    val internal = object {
        val property = ""
    }
}


object OvenObj {
    fun process(product: Bakeable) {
        println(product.bake())
    }
}

interface Oven {
    fun process(product: Bakeable)
}


object ElectricOven: Oven {
    override fun process(product: Bakeable) {
        println(product.bake())
    }
}


fun main(args: Array<String>) {
    val myAlmondCupcake = CupcakeThree("Almond")
    ElectricOven.process(myAlmondCupcake)

    val myBlueberryCupcake: BakeryGood = CupcakeFour("Blueberry")
    val myAlmondCupcake1 = CupcakeFour.almond()
    val myCheeseCupcake = CupcakeFour.cheese()
    val myCaramelCupcake = Cupcake("Caramel")
}

class CupcakeFour(flavour: String) : BakeryGood(flavour), Bakeable {

    override fun name(): String {
        return "cupcake"
    }

    companion object {
        fun almond(): Cupcake {
            return Cupcake("almond")
        }
        fun cheese(): Cupcake {
            return Cupcake("cheese")
        }
    }
}