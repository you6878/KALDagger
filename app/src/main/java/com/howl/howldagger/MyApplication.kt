package com.howl.howldagger

import android.app.Application

class MyApplication:Application(){

    var magicBox:MagicBox? = null

    override fun onCreate() {
        super.onCreate()
        magicBox = DaggerMagicBox.builder().build()
    }
}