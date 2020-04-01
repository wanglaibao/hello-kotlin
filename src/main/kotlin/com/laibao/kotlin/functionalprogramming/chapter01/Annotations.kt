package com.laibao.kotlin.functionalprogramming.chapter01

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class Tasty(val tasty:Boolean = true)


@Tasty(false)
object ElectricOven1 : Oven {
    override fun process(product: Bakeable) {
        println(product.bake())
    }
}
@Tasty
class CinnamonRoll1 : Roll("Cinnamon")

@Tasty
interface Fried1 {
    fun fry(): String
}



fun main(args: Array<String>) {
    val annotations: List<Annotation> = ElectricOven1::class.annotations

    for (annotation in annotations) {
        when (annotation) {
            is Tasty -> println("Is it tasty? ${annotation.tasty}")
            else -> println(annotation)
        }
    }
}