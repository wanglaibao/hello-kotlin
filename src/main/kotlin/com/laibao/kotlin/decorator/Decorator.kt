package com.laibao.kotlin.decorator

import java.util.*


fun main(args: Array<String>) {

    val happyMap = HappyMap<String,String>()
    happyMap["jinge"] = "金戈"
    happyMap["jinge"] = "金戈来了"

    val a = listOf("a")
    val b = listOf("b")
    println(a + b)



    val happy = HappyMap<String,String>()
    happy["alading"] = "阿拉丁"
    happy["alading"] = "阿拉丁"
}

class HappyMap0<K,V>: HashMap<K,V> (){
    override fun put(key: K, value: V): V? {
        return super.put(key, value).apply {
            this?.let {
                println("Yay! Very useful")
            }
        }
    }
}

class SadMap0<K, V>: HashMap<K, V>() {
    override fun remove(key: K): V? {
        return super.remove(key).apply {
            this?.let {
                //println("Okay...")
            }
        }
    }
}

/**
 *  通过委托来实现装饰器模式
 */
class HappyMap<K, V>(private val map: MutableMap<K, V> = mutableMapOf()) : MutableMap<K, V> by map {
    override fun put(key: K, value: V): V? {
        return map.put(key, value).apply {
            this?.let { println("Yay! $key") }
        }
    }
}

/**
 *  通过委托来实现装饰器模式
 */
class SadMap<K, V>(private val map: MutableMap<K, V> = mutableMapOf()) : MutableMap<K, V> by map {
    override fun remove(key: K): V? {
        println("Okay...")
        return map.remove(key)
    }
}