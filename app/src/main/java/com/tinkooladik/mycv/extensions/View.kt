package com.tinkooladik.mycv.extensions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes

fun ViewGroup.inflate(@LayoutRes layout: Int, attach: Boolean = false): View =
    LayoutInflater.from(this.context).inflate(layout, this, attach)
