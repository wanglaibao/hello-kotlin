package com.laibao.kotlin.singleton

class SingleTon {
    companion object {
        fun get():SingleTon {
            return Holder.instance
        }
    }
    private object Holder {
        val instance = SingleTon();
    }
}

class StringUtils {
    companion object {
        fun isEmpty(str:String):Boolean {
            return  "" == str
        }
    }
}