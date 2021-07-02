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
@Table(name="TaskGroup_TABLE")
public class TaskGroup {
    @Id
    @GeneratedValue
    private int taskGroupId;
    private String taskGroupName;
}
