package de.pflanzenmoerder.wicket.entity;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * @author Jochen Mader
 */
public class BusinessServiceTest {

    private BusinessService businessService = new BusinessService();

    @Test
    public void testFindUserById() {
        User user = businessService.findUserById(2l);
        assertNotNull(user);
        assertEquals("user2", user.getName());
    }

    @Test
    public void testFindUserByName() {
        User user = businessService.findUserByName("user1");
        assertNotNull(user);
        assertEquals("user1", user.getName());
    }

    @Test
    public void testFindTaskListByUserIdAndTaskListId() {
        TaskList taskList = businessService.findTaskListByUserIdAndTaskListId(1l,200l);
        assertNotNull(taskList);
        assertEquals("Work", taskList.getName());
    }

    @Test
    public void testFindTaskByUserIdAndTaskId() {
        Task task = businessService.findTaskByUserIdAndTaskId(1l, 101l);
        assertNotNull(task);
        assertEquals("Solve the problem!", task.getDescription());
    }
}
