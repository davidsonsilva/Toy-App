package com.example.android.todolist;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

import java.util.List;

// Make this class extend AndroidViewModel and implement its default constructor
public class MainViewModel extends AndroidViewModel {

    private LiveData<List<TaskEntry>> mTaskEntryList;

    public MainViewModel(@NonNull Application application) {
        super(application);
        mTaskEntryList = AppDatabase.getInstance(application).taskDao().loadAllTasks();
    }

    public LiveData<List<TaskEntry>> getTaskEntryList() {
        return mTaskEntryList;
    }
    // Add a tasks member variable for a list of TaskEntry objects wrapped in a LiveData
    // In the constructor use the loadAllTasks of the taskDao to initialize the tasks variable
    // Create a getter for the tasks variable
}
