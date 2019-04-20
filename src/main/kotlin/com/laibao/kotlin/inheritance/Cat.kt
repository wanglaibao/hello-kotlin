package com.laibao.kotlin.inheritance


class Cat (name:String): Animal(name),ExampleInterface{

    override fun abstractFunction(): String = "Meow"

    override fun openFunction(): String {
        println("Overriding open function")
        //openFunction is known in both: ExampleInterface and Animal
        println("open function of Animal: ${super<Animal>.openFunction()}")

        println("open function of ExampleInterface: ${super<ExampleInterface>.openFunction()}")

        return "Overriding open function finished"
    }
    //not working because method is final: override fun notOpenFunction() = "trying to override"

    override fun interfaceFunction() = "Override of interface function"


    //Override of Any-methods
    override fun hashCode(): Int = name.hashCode()

    override fun toString(): String = "Cat(catName='$name')"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other?.javaClass != javaClass) return false
        other as Cat
        if (name != other.name) return false
        return true
    }
}