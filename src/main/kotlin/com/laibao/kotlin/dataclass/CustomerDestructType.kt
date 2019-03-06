package com.laibao.kotlin.dataclass

fun main() {
    for ((x,y,z) in listOf(Vector3(0.2,0.1,0.5), Vector3(-12.0, 3.145, 5.100))){
        println("Coordinates: x=$x, y=$y, z=$z")
    }

    val countriesAndCaptial = listOf( Pair("UK", "London"), Pair("France", "Paris"), Pair("Australia", "Canberra"))

    for ((country, capital) in countriesAndCaptial) {
        println("The capital of $country is $capital")
    }

    val colours = listOf( Triple("#ff0000", "rgb(255, 0, 0)", "hsl(0, 100%,50%)"), Triple("#ff4000", "rgb(255, 64, 0)", "hsl(15, 100%, 50%)"))

    for((hex, rgb, hsl) in colours){
        println("hex=$hex; rgb=$rgb;hsl=$hsl")
    }

}

class Vector3(val x:Double, val y:Double, val z:Double){
    operator fun component1()=x

    operator fun component2()=y

    operator fun component3()=z
}