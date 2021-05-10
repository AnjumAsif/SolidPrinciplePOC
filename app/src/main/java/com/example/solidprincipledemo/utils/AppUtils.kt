package com.example.solidprincipledemo.utils

import java.lang.StringBuilder

object AppUtils {
    @JvmStatic
    fun convertIntoCommaSeparated(arr:String):String {
        val strBuilder = StringBuilder()
        for (gens in arr) {
            strBuilder.append(gens).append(",")
        }
        return strBuilder.toString()
    }
}