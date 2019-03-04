package com.laibao.kotlin.adapter

import java.util.stream.Stream
import kotlin.streams.toList

fun main(args: Array<String>) {
    cellPhone(charger(powerOutlet().toEUPlug()).toUsbTypeC())


    val list = listOf("a", "b", "c")

    // Doesn't compile
    //streamProcessing(list)

    //Luckily, collections provide us with the .stream() method:

    streamProcessing(list.stream()) // Adapted successfully


    val stream = Stream.generate { 42 }.limit(100)
    collectionProcessing(stream.toList())
}

fun <T> collectionProcessing(collection: Collection<T>) {
    for (element in collection) {
        println(element)
    }
}

fun <T> streamProcessing(stream: Stream<T>) {
    // Do something with stream
}

interface UsbTypeC

interface UsbMini

interface EUPlug

interface USPlug


// Power outlet exposes USPlug interface
fun powerOutlet() : USPlug {
    return object : USPlug {}
}


fun cellPhone(chargeCable: UsbTypeC) {

}


// Charger accepts EUPlug interface and exposes UsbMini interface
fun charger(plug: EUPlug) : UsbMini {
    return object : UsbMini {}
}

fun USPlug.toEUPlug(): EUPlug {
    return object : EUPlug {
        // Do something to convert
    }
}

fun UsbMini.toUsbTypeC() : UsbTypeC {
    return object : UsbTypeC {
        // Do something to convert
    }
}


































































