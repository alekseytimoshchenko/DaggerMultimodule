package com.krokosha.daggermultimodule.di

import android.content.Context
import com.krokosha.core.di.CoreModule
import com.krokosha.daggermultimodule.TaskActivity
import com.krokosha.data.di.DataModule
import com.krokosha.network.di.NetworkModule
import com.krokosha.task.ui.TaskComponent
import com.krokosha.task.ui.di.TaskModule
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
        DataModule::class,
        CoreModule::class
    ]
)
interface AppComponent {
    fun createTaskComponent(): TaskComponent

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance ctx: Context): AppComponent
    }
}