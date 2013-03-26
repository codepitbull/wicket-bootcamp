package de.pflanzenmoerder.wicket.entity;

import java.util.List;

/**
 * @author Jochen Mader
 */
public class BusinessService {
    private List<User> userList = MockUserListFactory.createUserList();

    public User findUserById(Long id) {
        for (User user : userList) {
            if(id.equals(user.getId())) {
                return user;
            }
        }
        return null;
    }

    public User findUserByName(String name) {
        for (User user : userList) {
            if(name.equals(user.getName()))
                return user;
        }
        return null;
    }

    public TaskList findTaskListByUserIdAndTaskListId(Long userId, Long taskListId) {
        User user = findUserById(userId);
        if(user == null)
            return null;

        for(TaskList taskList : user.getTaskLists()) {
            if(taskListId.equals(taskList.getId()))
                return taskList;
        }
        return null;
    }

    public Task findTaskByUserIdAndTaskId(Long userId, Long taskId) {
        User user = findUserById(userId);
        if(user == null)
            return null;

        for(TaskList taskList : user.getTaskLists()) {
            for(Task task : taskList.getTasks()) {
                if(taskId.equals(task.getId()))
                    return task;
            }
        }
        return null;
    }
    
}
