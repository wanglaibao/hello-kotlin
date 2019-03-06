package com.laibao.kotlin.dataclass

import org.joda.time.DateTime
import java.net.URI

fun main() {
    val blogEntry = BlogEntry("Data Classes are here", "Because Kotlin rulz!", DateTime.now(), true, DateTime.now(),
            URI("http://packt.com/blog/programming_kotlin/data_classes"), 0,
            emptyList(), null)

    val anotherBlogEntry = blogEntry.copy(title = "Properties in Kotlin", description = "Properties are awesome in Kotlin")

    val (title, description, publishTime,approved, lastUpdated, url, comments, tags, email) = blogEntry

    println("Here are the values for each field in the entry: title=$title description=$description publishTime=$publishTime approved=$approved lastUpdated=$lastUpdated, url=$url comments=$comments tags=$tags email=$email")
}

data class BlogEntry(var title: String,
                     var description: String,
                     val publishTime: DateTime,
                     val approved: Boolean?,
                     val lastUpdated: DateTime,
                     val url: URI,
                     val commentCount: Int?,
                     val topTags: List<String>,
                     val email: String?)