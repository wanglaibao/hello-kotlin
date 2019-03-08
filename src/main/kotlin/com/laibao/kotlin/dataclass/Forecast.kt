package com.laibao.kotlin.dataclass

import org.joda.time.DateTime
import java.io.Serializable

fun main() {
    val f1 = Forecast(DateTime.now(), 27.5, "Shiny day")

    val f2 = f1.copy(temperature = 30.0)

    println(f1)

    println(f2)

    val (date, temperature, details) = f1

    println(date)
    println(temperature)
    println(details)

    val randomGreeting = random("hello", "willkommen", "bonjour")
    println(randomGreeting)
    println()

    val any = random("a", 1, false)
    println(any)


    val a: Int = min(4, 5)

    val b: String = min("e", "c")

    //val c: Pair<String,String> = min(Pair("asdf","asdf"), Pair("asdf","asdfsadf"))


    //val d = min("e", 100)
}

data class Forecast(val date: DateTime, val temperature: Double, val details: String)


fun <T> random(one:T,two:T,three:T):T{
    return one
}

fun <K, V> put(key: K, value: V): Unit {

}

fun <T : Comparable<T>> min(first: T, second: T): T {
    val k = first.compareTo(second)
    return if (k <= 0) first else second
}



fun <T>minSerializable(first: T, second: T): T
        where T : Comparable<T>,T:Serializable {
    val k = first.compareTo(second)
    return if (k <= 0) first else second
}

class MultipleBoundedClass<T> where T : Comparable<T>, T : Serializable