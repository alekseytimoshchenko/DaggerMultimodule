package com.krokosha.daggermultimodule

import android.app.Application
import com.krokosha.daggermultimodule.di.AppComponent
import com.krokosha.daggermultimodule.di.DaggerAppComponent
import com.krokosha.task.ui.TaskComponent
import com.krokosha.task.ui.TaskComponentProvider

class App: Application(), TaskComponentProvider {
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory().create(ctx = this)
    }

    override fun getTaskComponent(): TaskComponent = appComponent.createTaskComponent()
}