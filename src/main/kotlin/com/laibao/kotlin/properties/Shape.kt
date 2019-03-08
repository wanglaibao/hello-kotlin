package com.laibao.kotlin.properties

fun main() {
    val container= Container()

    container.initProperty(DelayedInstance(10))

    println("with delayed initialization:Number=${container.delayedInitProperty.number}")

    val record = Record("111")
    println(record.id)
}

interface Shape {
    val area: Double
        get;
}

class Rectangle(val width: Double, val height: Double) : Shape{
    override val area:Double
        get() = width * height

    val isSquare: Boolean = width == height
}

class DelayedInstance (val number:Int)

class Container {

    lateinit var delayedInitProperty: DelayedInstance


    fun initProperty(instance: DelayedInstance): Unit {
        this.delayedInitProperty = instance
    }
}


interface WithId {
    val id: String
}


data class WithIdImpl(override val id: String) : WithId


class Record(id: String) : WithId by Record.identifier(id) {

    companion object {
        fun identifier(identifier: String) = WithIdImpl(identifier)
    }

}