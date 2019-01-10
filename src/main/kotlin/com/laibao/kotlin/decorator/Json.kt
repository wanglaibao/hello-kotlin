package com.laibao.kotlin.decorator

data class Json(val j: String)

fun main(args: Array<String>) {
    val j1 = Json("""{"a": "b"}""")
    val j2 = Json("""{"c": "d"}""")

    // Compilation error!
    // println(j1 + j2)


    // 有了操作符重载扩展函数以后就可以了
    println(j1 + j2)
}


operator fun Json.plus(j2: Json): Json {
    val jsonFields = this.j.split(":") + j2.j.split(":")
    val s = jsonFields.joinToString(":")
    return Json ("""{$s}""")
}