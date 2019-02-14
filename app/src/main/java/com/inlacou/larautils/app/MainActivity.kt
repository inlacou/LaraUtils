package com.inlacou.larautils.app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.inlacou.larautils.DummyAct

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DummyAct.navigate(this, R.layout.activity_test)
    }
}
