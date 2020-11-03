package com.will.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.will.habit.bus.event.SingleLiveEvent

class MainActivity : AppCompatActivity() {
    val data = SingleLiveEvent<Void>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}