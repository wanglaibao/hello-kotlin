package com.laibao.kotlin.chapter01

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

fun main(args: Array<String>) {
    val line = BasicGraph.Line(1, 0, -2, 0)
    line.draw()
}

class BasicGraph(val name: String) {
    fun draw(): Unit {
        println("Drawing the graph $name")
    }

    class Line(val x1: Int, val y1: Int, val x2: Int, val y2: Int) {
        fun draw(): Unit {
            println("Drawing Line from ($x1:$y1) to ($x2, $y2)")
        }
    }
}

class BasicGraphWithInner(graphName: String){

    private val name: String

    init {
        name = graphName
    }


    inner class InnerLine(val x1: Int, val y1: Int, val x2: Int, val y2: Int) {
        fun draw(): Unit {
            println("Drawing Line from ($x1:$y1) to ($x2, $y2) for graph $name ")
        }
    }

    fun draw(): Unit {
        println("Drawing the graph $name")
    }
}

class A {
    private val somefield: Int = 1
    inner class B {
        private val somefield: Int = 1
        fun foo(s: String) {
            println("Field <somefield> from B" + this.somefield)
            println("Field <somefield> from B" + this@B.somefield)
            println("Field <somefield> from A" + this@A.somefield)
        }
    }
}

data class Customer(val id:Int, val name:String, var address:String)