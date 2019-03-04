package com.laibao.kotlin.inherit

fun main(args: Array<String>) {
    val panel = Panel(RectangleForm(10,100,30,100))
    println("Panel height:"+panel.getHeight())
    println("Panel witdh:" + panel.getWidth())
}

interface UIElement {
    fun getHeight(): Int
    fun getWidth(): Int
}

class RectangleForm(val x1: Int, val x2: Int, val y1: Int, val y2: Int) : UIElement {
    override fun getHeight() = y2 - y1
    override fun getWidth() = x2 - x1
}

class Panel(uIElement: UIElement): UIElement by uIElement