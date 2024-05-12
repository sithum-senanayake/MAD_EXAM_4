package com.example.mad_exam_4

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class TaskItemRepository (private val taskItemDao: TaskItemDao){
    val allTaskItems: Flow<List<TaskItem>> = taskItemDao.allTaskItems()

    // Function to insert a TaskItem into the database
    @WorkerThread
    suspend fun insertTaskItem(taskItem: TaskItem){
        taskItemDao.insertTaskItem(taskItem)
    }

    // Function to update a TaskItem in the database
    @WorkerThread
    suspend fun updateTaskItem(taskItem: TaskItem){
        taskItemDao.updateTaskItem(taskItem)
    }

    // Function to delete a TaskItem from the database
    @WorkerThread
    suspend fun deleteTaskItem(taskItem: TaskItem) {
        taskItemDao.deleteTaskItem(taskItem)
    }
}