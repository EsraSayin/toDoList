package com.toDoList.ToDoList.controller;

import com.toDoList.ToDoList.entity.Task;
import com.toDoList.ToDoList.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskService service;
    @PostMapping("/addTask")
    public Task addTask(@RequestBody Task task){
        return service.saveTask(task);
    }
    @PostMapping("/Tasks")
    public List <Task> findAllTasks(){
        return service.getTask();
    }
    @PutMapping ("/updateTask")
    public Task updateTask(@RequestBody Task task){
        return service.updateTask(task);
    }
    @DeleteMapping ("/delete/{id}")
    public String deleteTask(@PathVariable int id){
        return service.deleteTask(id);
    }

}
