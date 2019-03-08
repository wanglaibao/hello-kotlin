package com.laibao.kotlin.properties

import kotlin.reflect.KProperty

fun main() {
    val measure = Measure()
    measure.writeTimestamp = System.currentTimeMillis()
    println("Current measure taken at:${measure.writeTimestamp}")
}

class TimestampValueDelegate {
    private var timestamp = 0L

    operator fun getValue(ref: Any?, property: KProperty<*>): Long {
        return timestamp;
    }

    operator fun setValue(ref: Any?, property: KProperty<*>, value: Long) {
        timestamp = value
    }
}

class Measure {
    var writeTimestamp: Long by TimestampValueDelegate()
}