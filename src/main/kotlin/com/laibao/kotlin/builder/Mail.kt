package com.laibao.kotlin.builder


fun main(args: Array<String>) {

    // send an email without CC, we can do it below
    val mail1 = Mail("one@recepient.org", "Hi", "How are you")
    println(mail1)

    val mail2 = Mail(title= "Hello", message="There", to="my@dear.cat")
    println(mail2)

    val mail3 = Mail("hello@mail.com").apply {
        message = "Something"
        title = "Apply"
    }
    println(mail3)


    val email4 = MailBuilder(" hello@hello.com ").title("What's up?").build()
    println(email4)
}

data class Mail(val to: String,
                var title: String = "",
                var message: String = "",
                var cc: List<String> = listOf(),
                var bcc: List<String> = listOf(),
                var attachments: List<java.io.File> = listOf())

