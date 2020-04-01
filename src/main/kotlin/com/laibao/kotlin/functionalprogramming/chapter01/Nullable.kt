package com.laibao.kotlin.functionalprogramming.chapter01

/*
fun main(args: Array<String>) {
    val myBlueberryCupcake: Cupcake = null //Compilation error: Null can not be a value of a non-null type Cupcake
}*/


fun main(args: Array<String>) {
    val myBlueberryCupcake: Cupcake? = null

    val myAlmondCupcake = CupcakeFour.almond()
    eat(myAlmondCupcake)
    eat(null)


    val cupcake: Cupcake = CupcakeFour.almond()

    val nullabeCupcake: Cupcake? = CupcakeFour.almond()



    cupcake.eat() // Happy days
    nullabeCupcake?.eat() //Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type Cupcake?

    if (nullabeCupcake != null) {
        nullabeCupcake.eat()
    }


    if (nullabeCupcake is Cupcake) {
        nullabeCupcake.eat()
    }

    when (nullabeCupcake) {
        is Cupcake -> nullabeCupcake.eat()
    }


    nullabeCupcake?.eat()

    val result: String? = nullabeCupcake?.eat()

    val length: Int? = nullabeCupcake?.eat()?.length

    val result2: String = nullabeCupcake?.eat() ?: ""

    val length2: Int = nullabeCupcake?.eat()?.length ?: 0


    val result3: String = nullabeCupcake !! .eat()

    val result4: String = nullabeCupcake !! .eat()

    val length1: Int = nullabeCupcake.eat().length

}

fun eat(cupcake: Cupcake?){
// something happens here
}

