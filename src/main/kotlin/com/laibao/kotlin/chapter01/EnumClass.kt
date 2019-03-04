package com.laibao.kotlin.chapter01

fun main(args: Array<String>) {

}

enum class Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

enum class Planet constructor(val mass: Double, val radius: Double) {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7),
    NEPTUNE(1.024e+26, 2.4746e7)
}

interface Printable {
    fun print(): Unit
}


enum class Word : Printable {
    HELLO {
        override fun print() {
            println("Word is HELLO")
        }

        override fun sayHello(greeting: String) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    BYE {
        override fun print() {
            println("Word is BYE")
        }

        override fun sayHello(greeting: String) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    };

    abstract fun sayHello(greeting:String)
}