package com.example.shimmerfacebookeffect

import android.content.Context
import android.os.CountDownTimer

fun Context.counter(seconds: Long, func: () -> Unit) {
    val diff: Long = 1000

    object : CountDownTimer(seconds * 1000, diff) {

        override fun onTick(millisUntilFinished: Long) {
        }

        override fun onFinish() {
            func()
        }

    }.start()
}