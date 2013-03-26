package de.pflanzenmoerder.wicket.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Jochen Mader
 */
public class User implements Serializable{
    private Long id;
    private String name;
    private String password;
    private List<TaskList> taskLists;

    public User() {
    }

    public User(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.taskLists = new CopyOnWriteArrayList<TaskList>();
    }

    public List<TaskList> getTaskLists() {
        return taskLists;
    }

    public User setTaskLists(List<TaskList> taskLists) {
        this.taskLists = taskLists;
        return this;
    }

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public User addTaskList(TaskList taskList) {
        taskLists.add(taskList);
        taskList.setOwner(this);
        return this;
    }

    public User removeTaskList(TaskList taskList) {
        taskLists.remove(taskList);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
