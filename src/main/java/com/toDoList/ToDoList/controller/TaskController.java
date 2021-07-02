package com.toDoList.ToDoList.controller;

import com.toDoList.ToDoList.entity.Task;
import com.toDoList.ToDoList.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService service;

    @PostMapping
    public Task addTask(@RequestBody Task task) {
        return service.saveTask(task);
    }

    @GetMapping("/{id}")
    public List<Task> findAllTasks(@PathVariable int id) {
        return service.getTasks();
    }


    @GetMapping()
    public List<Task> findById() {
        return service.getTasks();
    }


    @PutMapping()
    public Task updateTask(@RequestBody Task task) {
        return service.updateTask(task);
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable int id) {
        return service.deleteTask(id);
    }

}
