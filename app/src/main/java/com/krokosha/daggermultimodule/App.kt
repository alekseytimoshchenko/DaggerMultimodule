package com.krokosha.daggermultimodule

import android.app.Application
import com.krokosha.daggermultimodule.di.AppComponent
import com.krokosha.daggermultimodule.di.DaggerAppComponent
import com.krokosha.task.ui.TaskComponentDependencies
import com.krokosha.task.ui.TaskComponentDependenciesProvider

class App: Application(), TaskComponentDependenciesProvider {
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory().create(ctx = this)
    }

    override fun getTaskComponentDependencies(): TaskComponentDependencies = appComponent
}