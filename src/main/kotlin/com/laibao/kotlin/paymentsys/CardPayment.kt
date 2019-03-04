package com.laibao.kotlin.paymentsys

import java.math.BigDecimal
import java.util.*

class CardPayment(amount: BigDecimal,
                  val number: String,
                  val expiryDate: Date,
                  val cardType: CardType) : Payment(amount)