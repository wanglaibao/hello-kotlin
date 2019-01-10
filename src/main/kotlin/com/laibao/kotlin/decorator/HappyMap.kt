package com.laibao.kotlin.decorator

import java.util.*


fun main(args: Array<String>) {

    val happyMap = HappyMap<String,String>()
    happyMap["jinge"] = "金戈"
    happyMap["jinge"] = "金戈来了"

    val a = listOf("a")
    val b = listOf("b")
    println(a + b)



    val HappySadMap = HappySadMap<String,String>()
    happyMap["alading"] = "阿拉丁"
    happyMap["alading"] = "阿拉丁"
}

class HappyMap<K,V>: HashMap<K,V> (){
    override fun put(key: K, value: V): V? {
        return super.put(key, value).apply {
            this?.let {
                println("Yay! Very useful")
            }
        }
    }
}

class SadMap<K, V>: HashMap<K, V>() {
    override fun remove(key: K): V? {
        return super.remove(key).apply {
            this?.let {
                //println("Okay...")
            }
        }
    }
}


class HappySadMap<K, V>(private val map: MutableMap<K, V> = mutableMapOf()) : MutableMap<K, V> by map {
    override fun put(key: K, value: V): V? {
        return map.put(key, value).apply {
            this?.let { println("Yay! $key") }
        }
    }
}