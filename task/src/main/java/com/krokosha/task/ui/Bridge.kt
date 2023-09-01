package com.krokosha.task.ui

import com.krokosha.data.Database

interface TaskComponentDependencies {
    fun getDatabase(): Database
}

interface TaskComponentDependenciesProvider {
    fun getTaskComponentDependencies(): TaskComponentDependencies
}