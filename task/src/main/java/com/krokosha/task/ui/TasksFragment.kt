package com.krokosha.task.ui

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.krokosha.data.Database
import com.krokosha.task.R
import javax.inject.Inject

class TasksFragment : Fragment() {
    @Inject lateinit var repo: TaskRepository

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tasks, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        (context.applicationContext as TaskComponentProvider)
            .getTaskComponent()
            .inject(tasksFragment = this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("HERE", "db: $repo")
    }
}