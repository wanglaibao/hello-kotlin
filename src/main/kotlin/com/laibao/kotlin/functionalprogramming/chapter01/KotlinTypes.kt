package com.laibao.kotlin.functionalprogramming.chapter01

fun main(args: Array<String>) {
    val myAlmondCupcake = CupcakeFour.almond()
    val anyMachine = object : Machine<Any> {
        override fun process(product: Any) {
            println(product.toString())
        }
    }
    anyMachine.process(3)
    anyMachine.process("")
    anyMachine.process(myAlmondCupcake)

    val nullableCupcake: Cupcake? = CupcakeFour.almond()
    //anyMachine.process(nullableCupcake) //Error:(32, 24) Kotlin: Type mismatch: inferred type is Cupcake? but Any was expected



    val length0 = nullableCupcake?.eat()?.length ?: ""

    val length1 = nullableCupcake?.eat()?.length ?: 0.0

    val length: Number = nullableCupcake?.eat()?.length ?: 0.0

}

data class Item(val product: BakeryGood,
                val unitPrice: Double,
                val quantity: Int)