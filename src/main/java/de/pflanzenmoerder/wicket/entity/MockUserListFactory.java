package de.pflanzenmoerder.wicket.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Jochen Mader
 */
public class MockUserListFactory {
    public static List<User> createUserList() {
        List<User> userList = new CopyOnWriteArrayList<User>();
        userList.add(
                new User(1l, "user1", "pass1")
                        .addTaskList(new TaskList(100l, "Primary")
                                .addTask(new Task(101l, "Solve the problem!", null, Boolean.FALSE))
                                .addTask(new Task(102l, "Do this", null, Boolean.FALSE))
                                .addTask(new Task(103l, "Do this", null, Boolean.FALSE))
                                .addTask(new Task(104l, "Do this", null, Boolean.FALSE))
                                .addTask(new Task(105l, "Do this", null, Boolean.FALSE))
                                .addTask(new Task(106l, "Do this", null, Boolean.FALSE))
                        )
                        .addTaskList(new TaskList(200l, "Work")
                                .addTask(new Task(201l, "Do this", null, Boolean.FALSE))
                                .addTask(new Task(202l, "Do this", null, Boolean.FALSE))
                                .addTask(new Task(203l, "Do this", null, Boolean.FALSE))
                                .addTask(new Task(204l, "Do this", null, Boolean.FALSE))
                                .addTask(new Task(205l, "Do this", null, Boolean.FALSE))
                                .addTask(new Task(206l, "Do this", null, Boolean.FALSE))
                        )
        );

        userList.add(
                new User(2l, "user2", "pass2")
                        .addTaskList(new TaskList(300l, "Primary")
                                .addTask(new Task(301l, "Do this", null, Boolean.FALSE))
                                .addTask(new Task(302l, "Do this", null, Boolean.FALSE))
                                .addTask(new Task(303l, "Do this", null, Boolean.FALSE))
                                .addTask(new Task(304l, "Do this", null, Boolean.FALSE))
                                .addTask(new Task(305l, "Do this", null, Boolean.FALSE))
                                .addTask(new Task(306l, "Do this", null, Boolean.FALSE))
                        )
                        .addTaskList(new TaskList(400l, "Home")
                                .addTask(new Task(401l, "Do this", null, Boolean.FALSE))
                                .addTask(new Task(402l, "Do this", null, Boolean.FALSE))
                                .addTask(new Task(403l, "Do this", null, Boolean.FALSE))
                                .addTask(new Task(404l, "Do this", null, Boolean.FALSE))
                                .addTask(new Task(405l, "Do this", null, Boolean.FALSE))
                                .addTask(new Task(406l, "Do this", null, Boolean.FALSE))
                        )
        );
        return userList;
    }
}
