package com.laibao.kotlin.inheritance

abstract class Animal(val name: String) {

    fun notOpenFunction():String  {

        return "I'm not an open function and cannot be overridden"

    }

    /**
     * MUST be overriden
     */
    abstract fun abstractFunction(): String

    open fun openFunction(): String {

        return "I'm an open function and I can be overriden"

    }
}