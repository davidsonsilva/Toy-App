package com.example.android.todolist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

// Make this class extend ViewModel
public class AddTaskViewModel extends ViewModel {

    // Add a task member variable for the TaskEntry object wrapped in a LiveData
    // Create a constructor where you call loadTaskById of the taskDao to initialize the tasks variable
    // Note: The constructor should receive the database and the taskId
    // Create a getter for the task variable

    private LiveData<TaskEntry> task;

    public AddTaskViewModel(AppDatabase mDb, int mTaskId) {
        task = mDb.taskDao().loadTaskById(mTaskId);
    }

    public LiveData<TaskEntry> getTask() {
        return task;
    }


}
