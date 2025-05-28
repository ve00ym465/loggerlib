package com.poc.loggerlib

import android.util.Log

object Logger {
    var isEnabled = true
    var globalTag: String = "LoggerLib"

    fun debug(tag: String, message: String) {
        if (isEnabled) {
            Log.d(globalTag, "[$tag] $message")
        }
    }

    fun info(tag: String, message: String) {
        if (isEnabled) {
            Log.i(globalTag, "[$tag] $message")
        }
    }

    fun error(tag: String, message: String) {
        if (isEnabled) {
            Log.e(globalTag, "[$tag] $message")
        }
    }
}
