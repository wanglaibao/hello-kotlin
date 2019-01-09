package com.laibao.kotlin.chapter03

class NumberMaster private constructor(){
    companion object {
        fun valueOf(hopefullyNumber: String) : Long {
            return hopefullyNumber.toLong()
        }
    }
}