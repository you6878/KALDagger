package com.howl.howldagger

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class Main2Activity : AppCompatActivity() {
    @Inject
    lateinit var numberMaker: NumberMaker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        (applicationContext as MyApplication).magicBox?.inject(this)
        println(numberMaker.text)
    }
}
