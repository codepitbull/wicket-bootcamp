package de.pflanzenmoerder.wicket.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Jochen Mader
 */
public class Task implements Serializable{
    private Long id;
    private String description;
    private Date dueDate;
    private Boolean done;
    private TaskList taskList;

    public Task() {
    }

    public Task(Long id, String description, Date dueDate, Boolean done) {
        this.id = id;
        this.description = description;
        this.dueDate = dueDate;
        this.done = done;
    }

    public TaskList getTaskList() {
        return taskList;
    }

    public Task setTaskList(TaskList taskList) {
        this.taskList = taskList;
        return this;
    }

    public Long getId() {
        return id;
    }

    public Task setId(Long id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Task setDescription(String description) {
        this.description = description;
        return this;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Task setDueDate(Date dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public Boolean getDone() {
        return done;
    }

    public Task setDone(Boolean done) {
        this.done = done;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (id != null ? !id.equals(task.id) : task.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
