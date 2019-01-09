package com.laibao.kotlin.chapter04

fun main(args: Array<String>) {

    val animalTypes = listOf("dog" to "bulldog", "dog" to "beagle", "cat" to "persian", "dog" to "poodle", "cat" to "russian blue", "cat" to "siamese")
    val factory = AnimalFactory()
    for ((type, breed) in animalTypes) {
        val animal = factory.createAnimal(type, breed)
        println("${animal.id} and  ${animal.animalType} and breed is ${animal.breed}")
        //println(animal)
    }

}

interface Animal {
    val id : Int
    val animalType: String
    val breed:String
}

open class Cat(override val id: Int, override val breed: String) : Animal {
    override val animalType: String = "cat"

}

class PersianCat(id:Int,breed:String):Cat(id,breed)

class RussianBlueCat(id:Int,breed:String):Cat(id,breed)

class SiameseCat(id:Int,breed: String):Cat(id,breed)


open class Dog(override val id: Int, override val breed: String) : Animal {
    override val animalType: String = "dog"
}

class Beagle(id: Int,breed:String) : Dog(id,breed)


class Bulldog(id: Int,breed:String) : Dog(id,breed)

class Poodle(id:Int,breed:String):Dog(id,breed)


class AnimalFactory {
    var counter = 0
    private val dogFactory = DogFactory()
    private val catFactory = CatFactory()
    fun createAnimal(animalType: String, animalBreed: String) : Animal {
        return when(animalType.trim().toLowerCase()) {
            "cat" -> catFactory.createCat(animalBreed, ++counter)
            "dog" -> dogFactory.createDog(animalBreed, ++counter)
            else -> throw RuntimeException("Unknown animal $animalType")
        }
    }
}

class DogFactory {
    fun createDog(breed: String, id: Int) = when(breed.trim().toLowerCase()) {
        "beagle" -> Beagle(id,"beagle")
        "bulldog" -> Bulldog(id,"bulldog")
        "poodle" -> Poodle(id,"poodle")
        else -> throw RuntimeException("Unknown dog breed $breed")
    }
}


class CatFactory {
    fun createCat(breed: String, id: Int) = when(breed.trim().toLowerCase()) {
        "persian" -> PersianCat(id,"persian")
        "russian blue" -> RussianBlueCat(id,"russian blue")
        "siamese" -> SiameseCat(id,"siamese")
        else -> throw RuntimeException("Unknown cat breed $breed")
    }
}