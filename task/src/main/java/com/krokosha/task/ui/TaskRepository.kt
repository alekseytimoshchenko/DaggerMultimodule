package com.krokosha.task.ui

import com.krokosha.data.Database
import com.krokosha.network.TaskApi

class TaskRepository constructor(
    private val database: Database,
    private val taskApi: TaskApi
)