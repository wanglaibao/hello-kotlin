package com.laibao.kotlin.paymentsys

import java.math.BigDecimal

class ChequePayment:Payment {

    init {
        println("在这里进行数据的初始化操作")
    }

    var name: String

    var bankId: String

    constructor(amount: BigDecimal, name: String, bankId: String) : super(amount) {
        this.name = name
        this.bankId = bankId
    }
}