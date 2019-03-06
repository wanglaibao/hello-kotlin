package com.laibao.kotlin.inherit

import java.io.ByteArrayOutputStream
import java.io.OutputStream
import java.util.stream.Collectors

open class Image {
    open fun save(output: OutputStream) {
        println("Some logic to save an image")
    }
}

interface VendorImage {
    fun save(output: OutputStream) {
        println("Vendor saving an image")
    }
}

class PNGImage : Image(), VendorImage {
    override fun save(output: OutputStream) {
        println("must be override this method in this class")
        super<VendorImage>.save(output)
        super<Image>.save(output)
    }
}

fun main(args: Array<String>) {
    val pngImage = PNGImage()
    val os = ByteArrayOutputStream()
    pngImage.save(os)



    val carManufacturers: MutableList<String> = mutableListOf("Masserati", "Aston Martin","McLaren","Ferrari","Koenigsegg")

    val carsView: List<String> = carManufacturers

    carManufacturers.add("Lamborghini")

    println("Cars View:$carsView") //Cars View: Masserati, Aston Martin, McLaren, Ferrari, Koenigsegg, Lamborghini


    val output = (1..100).toList().parallelStream()
                                 .map { it * 2 }
                                .collect(Collectors.toList())

    println(output)

}
