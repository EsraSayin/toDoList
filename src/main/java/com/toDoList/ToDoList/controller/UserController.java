package com.toDoList.ToDoList.controller;

import com.toDoList.ToDoList.entity.User;
import com.toDoList.ToDoList.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping
    public User addTask(@RequestBody User user) {
        return service.saveUser(user);
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable int id) {
        return service.getUser(id);
    }


    @PutMapping()
    public User updateTaskGroup(@RequestBody User user) {
        return service.updateUsers(user);
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable int id) {
        return service.deleteUser(id);
    }

}
