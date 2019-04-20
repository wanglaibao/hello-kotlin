package com.laibao.kotlin.inheritance

interface ExampleInterface {
    /**
     * As in Java8 interfaces can provide default implementations
     */
    fun openFunction():String {

        return "openFunction ExampleInterface"

    }

    /**
     * This function is implicitly abstract
     */
    fun interfaceFunction():String
}