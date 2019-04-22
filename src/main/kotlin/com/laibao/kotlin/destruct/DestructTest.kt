package com.laibao.kotlin.destruct

fun main() {
    val pair = Pair("foo", "bar")

    val triple = Triple(1, "wom", "bat")

    println(pair.first)
    println(pair.second)
    println(triple.first)
    println(triple.second)
    println(triple.third)




    // foo will be the first, one will be the second value of a Pair
    val (foo, one) = someFunction()
    println(foo)
    println(one)


    val pair1 = 1 to 3

    val map:Map<Int,Int> = mapOf(1 to 3, 4 to 2)



    listOf(1 to 2, 2 to 3, 5 to 1).toMap()

    val dirtyData = mapOf("1" to "foo", "2" to "bar", "baz" to "qux")

    val cleanData = dirtyData
            .filterKeys { it.toIntOrNull() != null }
            .mapKeys { it.key.toInt() }


    listOf<Byte>(1, 2, 3).toByteArray()

    val mySet = setOf(1, 2, 3, 4, 5, 6)

    val union = mySet.union(setOf(7, 8, 9))

    // [1, 2, 3, 4, 5, 6, 7, 8, 9]

    val intersection = mySet.intersect(setOf(3, 4, 5, 11, 12))

    // [3, 4, 5]

    val difference = mySet.subtract(setOf(1, 2, 3))

    // [4, 5, 6]

    val myList = listOf(1, 2, 3, 4, 5, 6)

    myList.drop(4)

    // [5, 6]

    myList.dropLast(4)

    // [1, 2]

    myList.dropWhile { it < 5 }

    // [5, 6]

    myList.dropLastWhile { it > 3 }

    // [1, 2, 3]

    myList.take(3)

    // [1, 2, 3]

    myList.takeLast(3)

    // [4, 5, 6]

    myList.takeWhile { it < 5 }

    // [1, 2, 3, 4]

    myList.takeLastWhile { it > 5 }

    // [6]


    val listWithDuplicates = listOf(1, 1, 2, 2, 3, 4)

    listWithDuplicates.distinct()

    // [1, 2, 3, 4]

    val chars = listOf("a", "A", "b", "B", "c")

    chars.distinctBy { it.toLowerCase() }

    // [a, b, c]


    val items = listOf(1, 2, 3, 4)

    items.groupBy { if (it % 2 == 0) "even" else "odd" }

    // {odd=[1, 3], even=[2, 4]}

    items.associate { (if (it % 2 == 0) "greatest_even" else "greatest_odd") to it }

    // {greatest_odd=3, greatest_even=4}

    items.associateBy { if(it % 2 == 0) "greatest_even" else "greatest_odd" }

    // {greatest_odd=3, greatest_even=4}

    val x = items.partition { it % 2 == 0 }

    // ([2, 4], [1, 3])

    val names = listOf("Jon", "John", "Jane")
    val ages = listOf(23, 32, 28)

    names.zip(ages)

    // [(Jon, 23), (John, 32), (Jane, 28)]


    names.zip(ages, { name, age -> User(name, age)})

    // [User(name=Jon, age=23), User(name=John, age=32), User(name=Jane, age=28)]


    val nodes = listOf("A", "B", "C", "D")

    val x1 = nodes.zipWithNext()

    // [(A, B), (B, C), (C, D)]

}


fun someFunction(): Pair<String, Int> = Pair("foo", 1)


data class User(val name: String, val age: Int)

val names = listOf("Jon", "John", "Jane")
val ages = listOf(23, 32, 28)









