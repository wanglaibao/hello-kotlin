package com.laibao.kotlin.chapter01

import java.io.InputStream
import java.io.OutputStream

fun main(args: Array<String>) {

}

interface Document {
    val version: Long

    val size: Long

    val name: String
        get() = "NoName"

    fun save(input: InputStream)

    fun load(stream: OutputStream)

    fun getDescription(): String {
        return "Document $name has $size byte(-s)"
    }
}

class DocumentImpl : Document {

    override val version: Long
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override val size: Long
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun save(input: InputStream) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun load(stream: OutputStream) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}