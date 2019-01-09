package com.laibao.kotlin.chapter03

fun main(args: Array<String>) {
    val c = catFactory()
    // Indeed prints "Cat"
    println(c.name)

    val animalTypes = listOf("dog", "dog", "cat", "dog", "cat", "cat")

    for (animal in animalTypes) {
        val c = animalFactory(animal)
        println(c.name)
    }
}

interface Animal {
    val name : String
}

class Cat : Animal{
    override val name = "Cat"
}


class Dog : Animal{
    override val name = "Dog"
}


fun catFactory() : Cat = Cat()


fun animalFactory(animalType: String) : Animal {
    return  when(animalType.toLowerCase()) {
                    "cat" -> Cat()
                    "dog" -> Dog()
                    else -> throw RuntimeException("Unknown animal $animalType")
    }
}




