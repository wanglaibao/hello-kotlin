package com.laibao.kotlin.abstractFactory

fun main(args: Array<String>) {

}

interface Types

enum class InfantryUnits : Types {
    RIFLEMEN,
    ROCKET_SOLDIER
}

enum class VehicleUnits : Types {
    APC,
    TANK
}



