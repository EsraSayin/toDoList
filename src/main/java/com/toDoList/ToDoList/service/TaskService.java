package com.toDoList.ToDoList.service;

import com.toDoList.ToDoList.entity.Task;
import com.toDoList.ToDoList.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
private TaskRepository repository;
    public Task saveTask(Task task){
        return repository.save(task);
    }

    public List<Task> getTask(){
        return repository.findAll();
    }

    public String deleteTask(int id){
        repository.deleteById(id);
        return "Task deleted!";
    }
    public Task updateTask(Task task){
        Task firstTask=repository.findById(task.getId()).orElse(null);
        firstTask.setName(task.getName());
        firstTask.setDescription(task.getDescription());
        firstTask.setSituation(task.getSituation());
        return repository.save(firstTask);
    }
}
