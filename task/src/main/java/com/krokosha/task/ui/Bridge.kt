package com.krokosha.task.ui

import com.krokosha.network.di.NetworkModule
import com.krokosha.task.ui.di.TaskModule
import dagger.Subcomponent

@Subcomponent(
    modules = [
        NetworkModule::class,
        TaskModule::class
    ]
)
interface TaskComponent {
    fun inject(tasksFragment: TasksFragment)
}

interface TaskComponentProvider {
    fun getTaskComponent(): TaskComponent
}