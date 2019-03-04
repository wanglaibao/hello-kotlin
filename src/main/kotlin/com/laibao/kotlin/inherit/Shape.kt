package com.laibao.kotlin.inherit

abstract class Shape protected constructor() {
    var XLocation: Int
        get() = this.XLocation
        set(value: Int) {
            this.XLocation = value
        }

    var YLocation: Int
        get() = this.YLocation
        set(value: Int) {
            this.YLocation = value
        }

    var Width: Double
        get() = this.Width
        set(value: Double) {
            this.Width = value
        }

    var Height: Double
        get() = this.Height
        set(value: Double) {
            this.Height = value
        }

    abstract fun isHit(x: Int, y: Int): Boolean
}


class Ellipsis : Shape() {

    override fun isHit(x: Int, y: Int): Boolean {
        val xRadius = Width.toDouble() / 2
        val yRadius = Height.toDouble() / 2
        val centerX = XLocation + xRadius
        val centerY = YLocation + yRadius

        if (xRadius == 0.0 || yRadius == 0.0)
            return false

        val normalizedX = centerX - XLocation
        val normalizedY = centerY - YLocation

        return (normalizedX * normalizedX) / (xRadius * xRadius) +
                (normalizedY * normalizedY) / (yRadius * yRadius) <= 1.0
    }
}

class Rectangle : Shape() {
    override fun isHit(x: Int, y: Int): Boolean {
        return x >= XLocation && x <= (XLocation + Width) && y >=
                YLocation && y <= (YLocation + Height)
    }
}

fun main(args: Array<String>) {

    /*
    val e1 = Ellipsis()
    e1.Height = 10.0
    e1.Width = 12.0
    val e2 = Ellipsis()
    e2.XLocation = 100
    e2.YLocation = 96
    e1.Height = 21.0
    e1.Width = 19.0
    val r1 = Rectangle()
    r1.XLocation = 49
    r1.YLocation = 45
    r1.Width = 10.0
    r1.Height = 10.0

    val shapes = listOf<Shape>(e1, e2, r1)

    val selected:Shape? = shapes.firstOrNull {shape -> shape.isHit(50, 52)}

    if(selected == null){
        println("There is no shape at point(50,52)")
    }
    else {
        println("A shape of type ${selected.javaClass.simpleName} has been selected.")
    }
    */

    val baseB = BaseB("BaseB:value")
    val derivedB= DerivedB()
    derivedB.propertyFoo = "on the spot value"
    println("BaseB:${baseB.propertyFoo}")
    println("DerivedB:${derivedB.propertyFoo}")


}

abstract class SingleEngineAirplane protected constructor() {
    abstract fun fly()
}

class CesnaAirplane : SingleEngineAirplane() {
    final override fun fly() {
        println("Flying a cesna")
    }
}


open class Base {
    open val property1: String
        get() = "Base::value"
}


class Derived1 : Base() {
    override val property1: String
        get() = "Derived::value"
}

class Derived2(override val property1: String) : Base() {}

open class BaseB(open val propertyFoo: String) {}

class DerivedB : BaseB("") {
    private var _propFoo: String = ""
    override var propertyFoo: String
        get() = _propFoo
        set(value) {
            _propFoo = value
        }
}

