package com.toDoList.ToDoList.service;

import com.toDoList.ToDoList.entity.TaskGroup;
import com.toDoList.ToDoList.repository.TaskGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskGroupService {

    @Autowired
    private TaskGroupRepository repository;

    public TaskGroup saveTaskGroup(TaskGroup task) {
        return repository.save(task);
    }

    public TaskGroup getTaskGroup(int id) {
        return repository.findById(id).get();
    }

    public List<TaskGroup> getTaskGroups() {
        return repository.findAll();
    }

    public String deleteTask(int id) {
        repository.deleteById(id);
        return "Task deleted!";
    }

    public TaskGroup updateTaskGroup(TaskGroup taskGroup) {
        TaskGroup taskGroupFound = repository.findById(taskGroup.getId()).orElse(null);
        taskGroupFound.setTasks(taskGroup.getTasks());
        return repository.save(taskGroup);
    }
}
