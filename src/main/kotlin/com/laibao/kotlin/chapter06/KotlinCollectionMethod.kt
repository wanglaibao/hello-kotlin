package com.laibao.kotlin.chapter06

/**
 *
 *
 *  Filtering methods
 *       binarySearch, distinct, distinctBy, drop, dropWhile, dropLast, dropLastWhile, elementAt, elementAtOrElse, elementAtOrNull, filter, filterIndexed, filterIsInstance, find, findLast, first, firstOrNull, get, getOrElse, indexOf, indexOfFirst, indexOfLast, intersect, last, lastIndexOf, lastOrNull, orEmpty, single, singleOrNull, take, takeWhile, takeLast, takeLastWhile, union
 *
 *   Transformers
 *       associate, flatten, flatMap, intersect, map, mapNotNull, mapIndexed, mapIndexedNotNull, reversed, slice, sorted, sortedByDescending, sortedWith, union, unzip, zip
 *
 *   Aggregators
 *       fold, foldIndexed, foldRight, foldRightIndexed, reduce, reduceIndexed, reduceRight, reduceRightIndexed
 *
 *   Grouping
 *       groupBy, groupByTo, groupingBy, partition
 *
 *   Statistics
 *       average, count, max, maxBy, maxWith, min, minBy, minWith, sum, sumBy
 *
 *   Information about the collection
 *       all, any, contains, containsAll, none, forEach, forEachIndexed, isEmpty, isNotEmpty, onEach
 *
 */


fun main(args: Array<String>) {

    /**
     * Convert a list to a String
     */

    val nums = listOf(1,2,3,4,5)

    val stringValueOne = nums.joinToString()

    val stringValueTwo = nums.joinToString(
            separator = ", ",
            prefix = "[",
            postfix = "]",
            limit = 3,
            truncated = "there’s more ..."
    )

    println(stringValueOne)
    println(stringValueTwo)


    val a = listOf(10, 20, 30, 40, 10)

    val names = listOf("joel", "ed", "chris", "maurice")

    a.any{it > 20}             //true
    a.contains(10)             //true
    a.count()                  //5
    a.count{it > 10}           //3

    a.distinct()                 //[10, 20, 30, 40]
    a.distinctBy { it }


    a.drop(1)                  //[20, 30, 40, 10]
    a.drop(2)                  //[30, 40, 10]
    a.dropLast(1)              //[10, 20, 30, 40]
    a.dropLast(2)              //[10, 20, 30]
    a.dropWhile{it < 30}       //[30, 40, 10]
    a.dropLastWhile{it != 30}  //[10, 20, 30]
    a.filter{it != 10}         //[20, 30, 40]

    a.find{it != 10}           //20
    a.first()                  //10
    a.first { it > 30 }
    a.firstOrNull()            //TODO
    a.fold(0){acc, x -> acc+x} //110 (sum function)
    a.forEach{println(it)}     //prints out the list values
    a.getOrElse(0){0}          //10
    a.getOrElse(1){0}          //20
    a.getOrElse(11){0}         //0


    a.groupBy({it}, {it+1})    //{10=[11, 11], 20=[21], 30=[31], 40=[41]}
    a.indexOf(10)              //0
    a.indexOf(30)              //2
    a.indexOfFirst { it > 20 }
    a.indexOfLast { it < 50 }
    a.intersect(listOf(123,1233))
    a.isEmpty()                //false
    a.isNotEmpty()             //true
    a.last()                   //10
    a.last { it > 20 }


    a.lastIndexOf(8)
    a.lastOrNull()
    a.map{it + 1}              //[11, 21, 31, 41, 11]
    a.map{it * 2}              //[20, 40, 60, 80, 20]
    a.max()                    //40
    a.maxBy{it + 3}            //40

    a.min()                    //10
    a.minBy{it + 3}            //10



    a.onEach{println(it)}      //prints each element and returns
    //a copy of the list
    a.partition{it >10}        //([20, 30, 40], [10, 10])
    a.reduce{acc, x -> acc+x}  //110 (sum function)
    a.slice(0..2)              //[10, 20, 30]
    a.slice(1..2)              //[20, 30]
    a.sorted()                 //[10, 10, 20, 30, 40]
    a.sortedBy{it}             //[10, 10, 20, 30, 40]
    names.sortedBy{it.length}  //[ed, joel, chris, maurice]


    a.sum()                    //110
    a.sumBy{it + 1}            //115
    a.take(1)                  //[10]
    a.take(2)                  //[10, 20]
    a.takeLast(1)              //[10]
    a.takeLast(2)              //[40, 10]
    a.takeLastWhile{it < 40}   //[10]
    a.takeWhile{it < 40}       //[10, 20, 30]
    a.union(names)             //[10, 20, 30, 40, joel, ed, chris, maurice]
    a.zip(names)               //[(10, joel), (20, ed), (30, chris), (40, maurice)]
    names.zip(a)               //[(joel, 10), (ed, 20), (chris, 30), (maurice, 40)]
}