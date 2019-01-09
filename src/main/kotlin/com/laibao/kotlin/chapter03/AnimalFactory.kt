package com.laibao.kotlin.chapter03

fun main(args: Array<String>) {

    val animalTypes = listOf("dog", "dog", "cat", "dog", "cat", "cat")

    val factory = AnimalFactory()

    for (element in animalTypes) {
        val animal = factory.createAnimal(element)
        println("${animal.id} - ${animal.name}")
    }
}

interface Animal {
    val id:Int
    val name : String
}

class Cat(override val id: Int) : Animal{
    override val name = "Cat"
}


class Dog(override val id: Int) : Animal{
    override val name = "Dog"
}



fun animalFactory(animalType: String) : Animal {
    var counter = 0
    return  when(animalType.trim().toLowerCase()) {
                    "cat" -> Cat(++counter)
                    "dog" -> Dog(++counter)
                    else -> throw RuntimeException("Unknown animal $animalType")
    }
}


class AnimalFactory {
    var counter = 0
    fun createAnimal(animalType: String) : Animal {
        return when(animalType.trim().toLowerCase()) {
            "cat" -> Cat(++counter)
            "dog" -> Dog(++counter)
            else -> throw RuntimeException("Unknown animal $animalType")
        }
    }
}
