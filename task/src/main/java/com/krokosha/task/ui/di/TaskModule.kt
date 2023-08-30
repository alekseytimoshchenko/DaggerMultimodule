package com.krokosha.task.ui.di

import com.krokosha.data.Database
import com.krokosha.network.TaskApi
import com.krokosha.task.ui.TaskRepository
import dagger.Module
import dagger.Provides

@Module
class TaskModule {
    @Provides
    fun provideTaskRepository(
        database: Database,
        taskApi: TaskApi
    ) = TaskRepository(database, taskApi)
}