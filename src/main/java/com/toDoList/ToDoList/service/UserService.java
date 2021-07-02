package com.toDoList.ToDoList.service;

import com.toDoList.ToDoList.entity.User;
import com.toDoList.ToDoList.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User saveUser(User task) {
        return repository.save(task);
    }

    public User getUser(int id) {
        return repository.findById(id).get();
    }

    public List<User> getUsers() {
        return repository.findAll();
    }

    public String deleteUser(int id) {
        repository.deleteById(id);
        return "User deleted!";
    }

    public User updateUsers(User user) {
        User userFound = repository.findById(user.getId()).orElse(null);
        return repository.save(userFound);
    }
}
