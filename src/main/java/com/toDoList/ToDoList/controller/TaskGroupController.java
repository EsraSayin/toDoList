package com.toDoList.ToDoList.controller;

import com.toDoList.ToDoList.entity.TaskGroup;
import com.toDoList.ToDoList.service.TaskGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/taskgroup")
public class TaskGroupController {
    @Autowired
    private TaskGroupService service;

    @PostMapping
    public TaskGroup addTask(@RequestBody TaskGroup task) {
        return service.saveTaskGroup(task);
    }

    public List<TaskGroup> findAllTasks(@PathVariable int id) {
        return service.getTaskGroups();
    }

    @GetMapping("/{id}")
    public TaskGroup findById(@PathVariable int id) {
        return service.getTaskGroup(id);
    }


    @PutMapping()
    public TaskGroup updateTaskGroup(@RequestBody TaskGroup task) {
        return service.updateTaskGroup(task);
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable int id) {
        return service.deleteTask(id);
    }

}
