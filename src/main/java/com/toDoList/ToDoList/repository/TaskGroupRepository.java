package com.toDoList.ToDoList.repository;

import com.toDoList.ToDoList.entity.TaskGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskGroupRepository extends JpaRepository<TaskGroup, Integer> {
}
