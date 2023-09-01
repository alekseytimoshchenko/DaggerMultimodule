package com.krokosha.daggermultimodule.di

import android.content.Context
import com.krokosha.core.di.CoreModule
import com.krokosha.data.di.DataModule
import com.krokosha.task.ui.TaskComponentDependencies
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
        DataModule::class,
        CoreModule::class
    ]
)
interface AppComponent: TaskComponentDependencies {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance ctx: Context): AppComponent
    }
}