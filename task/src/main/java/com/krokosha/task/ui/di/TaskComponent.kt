package com.krokosha.task.ui.di

import com.krokosha.network.di.NetworkModule
import com.krokosha.task.ui.TaskComponentDependencies
import com.krokosha.task.ui.TasksFragment
import dagger.Component

@Component(
    modules = [
        NetworkModule::class,
        TaskModule::class
    ],
    dependencies = [TaskComponentDependencies::class]
)
interface TaskComponent {
    fun inject(tasksFragment: TasksFragment)
}