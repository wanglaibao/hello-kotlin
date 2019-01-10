package com.laibao.kotlin.decorator

fun main(args: Array<String>) {

    val happyMap = HappyMap<String,String>()
    happyMap["jinge"] = "金戈"
    happyMap["jinge"] = "金戈来了"
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