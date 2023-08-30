package com.krokosha.daggermultimodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.krokosha.data.Database
import javax.inject.Inject

class TaskActivity : AppCompatActivity() {
    @Inject lateinit var db: Database

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        (applicationContext as App).appComponent.inject(taskActivity = this)
    }
}