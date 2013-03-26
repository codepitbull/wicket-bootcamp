package de.pflanzenmoerder.wicket.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Jochen Mader
 */
public class TaskList implements Serializable{
    private Long id;
    private String name;
    private User owner;
    private List<Task> tasks;

    public TaskList() {
    }

    public TaskList(Long id, String name) {
        this.id = id;
        this.name = name;
        this.tasks = new CopyOnWriteArrayList<Task>();
    }

    public Long getId() {
        return id;
    }

    public TaskList setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public TaskList setName(String name) {
        this.name = name;
        return this;
    }

    public User getOwner() {
        return owner;
    }

    public TaskList setOwner(User owner) {
        this.owner = owner;
        return this;
    }

    public List<Task> getTasks() {
        return new ArrayList<Task>(tasks);
    }

    public TaskList setTasks(List<Task> tasks) {
        this.tasks = new ArrayList<Task>(tasks);
        return this;
    }

    public TaskList addTask(Task task) {
        tasks.add(task);
        task.setTaskList(this);
        return this;
    }

    public TaskList remove(Task task) {
        tasks.remove(task);
        return this;
    }

}
