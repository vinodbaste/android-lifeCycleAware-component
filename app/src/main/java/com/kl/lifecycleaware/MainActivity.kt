package com.kl.lifecycleaware

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //add LifeCycleObserver class to activity/fragment here
        lifecycle.addObserver(LifeCycleObserver())
    }
}