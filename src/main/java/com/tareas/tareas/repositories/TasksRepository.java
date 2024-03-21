package com.tareas.tareas.repositories;

import com.tareas.tareas.Models.Task;
import org.springframework.data.repository.CrudRepository;

public interface TasksRepository extends CrudRepository<Task, Long> {
}
