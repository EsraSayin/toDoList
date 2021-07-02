package com.toDoList.ToDoList.repository;

import com.toDoList.ToDoList.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
