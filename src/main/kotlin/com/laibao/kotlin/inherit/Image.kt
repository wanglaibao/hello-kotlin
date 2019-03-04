package com.laibao.kotlin.inherit

import java.io.ByteArrayOutputStream
import java.io.OutputStream

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
}
