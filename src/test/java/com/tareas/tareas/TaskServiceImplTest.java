package com.tareas.tareas;

import com.tareas.tareas.Models.Task;
import com.tareas.tareas.repositories.TasksRepository;
import com.tareas.tareas.services.TasksServiceImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class TaskServiceImplTest {

    @Mock
    private TasksRepository tasksRepository;

    @InjectMocks
    private TasksServiceImpl tasksService;


    @BeforeEach
    void  septup(){

        MockitoAnnotations.openMocks(this);
 }

    @Test
    public void getTasksTest(){
        Task task1 = new Task();
        task1.setId(1L);
        task1.setName("Task 1");
        task1.setDescription("description one");

        Task task2 = new Task();
        task2.setId(2L);
        task2.setName("Task 2");
        task2.setDescription("description two");

        List<Task> tasks = Arrays.asList(task1,task2);

        when(tasksRepository.findAll()).thenReturn(tasks);
        List<Task> result = tasksService.getTasks();


        assertEquals(tasks.size(), result.size());
        assertEquals(tasks.get(0), result.get(0));
        assertEquals("Task 1", result.get(0).getName());


    }
}
