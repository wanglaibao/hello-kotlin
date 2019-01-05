package com.laibao.kotlin.chapter02

fun main(args: Array<String>) {

    /**
     * Kotlin when expressions are like Java switch statements, but we’ll see in this lesson, they’re much more powerful.
     * when expression is similar to Scala’s match expression
     */

    /**
     * Replacement for switch
     */

    val intNumber = 1

    when (intNumber) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> {
            // notice you can use a block
            println("invalid day")
        }
    }
    println()
    println()

    /**
     * when is an expression
     */


    val dayAsInt = 5

    val dayAsString = when (dayAsInt) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "invalid day"
    }

    println(dayAsString)


    /**
     * Matches must be exhaustive
     * When when is used as an expression we generally must include an else clause.
     * If we don’t, we risk the chance of getting an error, as in this below example.
     */

    val i = 0

    val result = when (i) {
        1 -> "a little odd"
        2 -> "a little even"
        else -> System.err.println("出错啦")
    }

    println("the result is $result")


    /**
     * Multiple branch conditions
     */

    when (i) {
        0 -> println("got 0")
        1,2,3 -> println("got a 1, 2, or 3")
        4,5,6 -> println("got a 4, 5, or 6")
        else  -> println("something else")
    }


    /**
     * Testing against ranges
     * We can also check a value for being in a range (in) or not in a range (!in):
     */

    val m = 10

    when (m) {
        in 1 .. 100  -> println("10, 20, or 100")
        !in 4 .. 5 -> println("not a 4 or 5")
        else     -> println("something else")
    }


    /**
     * The order of the expressions is important. In this example I reverse the first two possible matches, and get a different result:
     */

    val h = 1

    when (h) {
        !in 4..5 -> println("not a 4 or 5")
        in 1..3  -> println("1, 2, or 3")
        else     -> println("something else")
    }


    /**
     *  in with listOf
     */

    val n = 1
    when (n) {
        in listOf(1,3,5) -> println("a little odd")
        in listOf(2,4,6) -> println("a little even")
        else             -> println("something else")
    }


    /**
     * Expressions as branch conditions
     */

    val x: Any = 11.0

    when (x) {
        is Boolean -> println("$x is a Boolean")
        is Double  -> println("$x is a Double")
        is String  -> println("$x is a String")
        !is String -> println("$x is not a String")
        else       -> println("$x is something else")
    }


   val booleanValue1 = isUpperCase("FOO")
    println(booleanValue1)

    val booleanValue2 = isUpperCase("fafdasFFFFFFF")
    println(booleanValue2)


    /**
     * when without arguments
     */

    val j = 1

    when {
        j < 0  -> println("less than zero")
        j == 0 -> println("zero")
        else   -> println("greater than zero")
    }


    /**
     * This syntax is useful for using when as the body of a function:
     */

    println(intToString(100))

    /**
     * Smart casts with when
     */

    //The Int plus one is 2
    println(getInfo(1))
    //Got a String, length is 3
    println(getInfo("foo"))
    //Got something else
    println(getInfo(1L))
}

fun isUpperCase(s: String): Boolean {
    return when (s) {
        s.toUpperCase() -> true
        else -> false
    }
}


fun intToString(i: Int): String = when {
    i < 0  -> "a negative number!"
    i == 0 -> "0"
    else   -> "a positive number!"
}


fun intToString2(i: Int): String {
    // convert the Int to a String
    val string = when {
        i < 0  -> "a negative number!"
        i == 0 -> "0"
        else   -> "a positive number!"
    }
    // return the String
    return string
}


fun getInfo (x: Any): String {
    return when (x) {
        is Int    -> "The Int plus one is ${x + 1}"
        is String -> "Got a String, length is " + x.length
        else -> "Got something else"
    }
}