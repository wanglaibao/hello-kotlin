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



enum class Flour {
    WHEAT, CORN, CASSAVA
}


interface Exotic {
    fun isExotic(): Boolean
}

enum class FlourTwo : Exotic {
    WHEAT {
        override fun isExotic(): Boolean {
            return false
        }
    },
    CORN {
        override fun isExotic(): Boolean {
            return false
        }
    },
    CASSAVA {
        override fun isExotic(): Boolean {
            return true
        }
    }
}


enum class FlourThree: Exotic {
    WHEAT {
        override fun isGlutenFree(): Boolean {
            return false
        }
        override fun isExotic(): Boolean {
            return false
        }
    },
    CORN {
        override fun isGlutenFree(): Boolean {
            return true
        }
        override fun isExotic(): Boolean {
            return false
        }
    },
    CASSAVA {
        override fun isGlutenFree(): Boolean {
            return true
        }
        override fun isExotic(): Boolean {
            return true
        }
    };
    abstract fun isGlutenFree(): Boolean
}


fun flourDescription(flour: Flour): String {
    return when(flour) { // error
        Flour.CASSAVA -> "A very exotic flavour"
        Flour.WHEAT -> "A very exotic flavour"
        Flour.CORN -> "A very exotic flavour"
    }
}


fun flourDescription1(flour: Flour): String {
    return when(flour) {
        Flour.CASSAVA -> "A very exotic flavour"
        else -> "Boring"
    }
}