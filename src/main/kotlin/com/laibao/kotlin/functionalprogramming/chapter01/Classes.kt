package com.laibao.kotlin.functionalprogramming.chapter01

class VeryBasic

class BlueberryCupcake {
    var flavour = "Blueberry"
}

/*
class BlueberryCupcakeTwo {
    val flavour = "Blueberry"
}*/


class AlmondCupcake {
    val flavour = "Almond"
}

/*
class Cupcake(flavour: String) {
    val flavour = flavour
}
*/


class Cupcake(val flavour: String) {
    fun eat(): String {
        return "nom, nom, nom... delicious $flavour cupcake"
    }
}

/*
fun main() {
    val veryBasic: VeryBasic = VeryBasic()
    println(veryBasic)
    println(veryBasic.javaClass)
    println(veryBasic.toString())
    val basic = VeryBasic()
    println(basic.javaClass)


    val myCupcake = BlueberryCupcake()
    println("My cupcake has ${myCupcake.flavour}")

    myCupcake.flavour = "Almond"
    println("My cupcake has ${myCupcake.flavour}")


    /*
    val myCupcake1 = BlueberryCupcakeTwo()
    myCupcake1.flavour = "Almond" //Compilation error: Val cannot be reassigned
    println("My cupcake has ${myCupcake1.flavour}")
    */

    val mySecondCupcake = AlmondCupcake()
    println("My second cupcake has ${mySecondCupcake.flavour} flavour")


    val myBlueberryCupcake = Cupcake("Blueberry")
    val myAlmondCupcake = Cupcake("Almond")
    val myCheeseCupcake = Cupcake("Cheese")
    val myCaramelCupcake = Cupcake("Caramel")

    println(myBlueberryCupcake.flavour)
    println(myAlmondCupcake.flavour)
    println(myCheeseCupcake.flavour)
    println(myCaramelCupcake.flavour)


    println(myBlueberryCupcake.eat())
    println(myAlmondCupcake.eat())
    println(myCheeseCupcake.eat())
    println(myCaramelCupcake.eat())
}
        */