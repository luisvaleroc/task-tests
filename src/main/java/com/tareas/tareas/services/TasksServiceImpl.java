package com.tareas.tareas.services;

import com.tareas.tareas.Models.Task;
import com.tareas.tareas.repositories.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TasksServiceImpl implements TaskService {

    private TasksRepository tasksRepository;

    @Autowired
    public TasksServiceImpl(TasksRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }

    public List<Task> getTasks(){
        return (List<Task>) this.tasksRepository.findAll();
    }
}
