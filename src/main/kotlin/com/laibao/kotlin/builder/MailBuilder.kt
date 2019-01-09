package com.laibao.kotlin.builder

import java.io.File

class MailBuilder (val to: String) {
    private var mail: Mail = Mail(to)

    fun title(title: String): MailBuilder {
        mail.title = title
        return this
    }

    fun message(message: String): MailBuilder {
        mail.message = message;
        return this
    }

    fun cc(cc: List<String>): MailBuilder {
        mail.cc = cc
        return this
    }

    fun bcc(bcc: List<String>): MailBuilder {
        mail.bcc = bcc
        return this
    }

    fun attachments(attachments: List<File>): MailBuilder {
        mail.attachments = attachments
        return this
    }

    fun build(): Mail {
        return mail
    }
}