package com.toDoList.ToDoList.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TASK_TABLE")
public class Task {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String description;
    private String state;
}
