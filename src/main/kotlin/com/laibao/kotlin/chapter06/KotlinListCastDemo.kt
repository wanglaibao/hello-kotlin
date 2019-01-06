package com.laibao.kotlin.chapter06

fun main(args: Array<String>) {

    /**
     * Understanding casting
     *
     * Some examples of casting and explicitly declaring list types
     */


    val a: List<Int>               = listOf(1,2,3)
    val b: Collection<Int>         = listOf(1,2,3)
    val c: Iterable<Int>           = listOf(1,2,3)

    val d: MutableList<Int>        = mutableListOf(1,2,3)
    val e: List<Int>               = mutableListOf(1,2,3)
    val f: MutableCollection<Int>  = mutableListOf(1,2,3)
    val g: Collection<Int>         = mutableListOf(1,2,3)
    val h: Iterable<Int>           = mutableListOf(1,2,3)
    val i: MutableIterable<Int>    = mutableListOf(1,2,3)

    val j: ArrayList<Int>          = arrayListOf(1,2,3)
    //val k: AbstractList<Int>       = arrayListOf(1,2,3)
    val l: MutableList<Int>        = arrayListOf(1,2,3)
    //val m: AbstractCollection<Int> = arrayListOf(1,2,3)
    val n: MutableCollection<Int>  = arrayListOf(1,2,3)
    val o: Collection<Int>         = arrayListOf(1,2,3)
    val p: MutableIterable<Int>    = arrayListOf(1,2,3)
    val q: Iterable<Int>           = arrayListOf(1,2,3)
    val r: List<Int>               = arrayListOf(1,2,3)


    println(a.javaClass.simpleName)
    println(b.javaClass.simpleName)
    println(c.javaClass.simpleName)
    println(d.javaClass.simpleName)
    println(e.javaClass.simpleName)
    println(f.javaClass.simpleName)
    println(g.javaClass.simpleName)
    println(h.javaClass.simpleName)
    println(i.javaClass.simpleName)
    println(j.javaClass.simpleName)
    println(l.javaClass.simpleName)
    println(n.javaClass.simpleName)
    println(o.javaClass.simpleName)
    println(p.javaClass.simpleName)
    println(q.javaClass.simpleName)
    println(r.javaClass.simpleName)
    println()
    println()
}