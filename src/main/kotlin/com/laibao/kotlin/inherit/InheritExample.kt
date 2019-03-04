package com.laibao.kotlin.inherit

import java.io.InputStream
import java.lang.reflect.Modifier
import java.util.*

fun main(args: Array<String>) {
    val derivedContainer = DerivedContainer()
    println("DerivedContainer.fieldA:${derivedContainer.fieldA}")

    derivedContainer.javaClass.superclass.getDeclaredFields().forEach {
        field-> field.setAccessible(true)

        println("Field:${field.name},${Modifier.toString(field.modifiers)} , Value=${field.get(derivedContainer)}")
    }

    derivedContainer.javaClass.getDeclaredFields().forEach {
        field-> field.setAccessible(true)
        println("Field:${field.name},${Modifier.toString(field.modifiers)} , Value=${field.get(derivedContainer)}")
    }
}

interface Drivable {
    fun drive()
}

interface Sailable {
    fun saill()
}

class AmphibiousCar(val name: String) : Drivable, Sailable {

    override fun drive() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun saill() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

interface IPersistable {
    fun save(stream: InputStream)
}

interface IPrintable {
    fun print()
}

abstract class Document(val title: String)

class TextDocument(title: String) : IPersistable, Document(title), IPrintable {
    override fun save(stream: InputStream) {
        println("Saving to input stream")
    }

    override fun print() {
        println("Document name:$title")
    }
}


open class Container {
    protected open val fieldA: String = "Some value"
}

class DerivedContainer : Container() {
    public override val fieldA: String = "Something else"
}


open class AParent {
    open fun someMethod(): Int = Random().nextInt()
}

abstract class DDerived : AParent() {
    abstract override fun someMethod(): Int
}

class AlwaysOne : DDerived() {
    override fun someMethod(): Int {
        return 1
    }
}