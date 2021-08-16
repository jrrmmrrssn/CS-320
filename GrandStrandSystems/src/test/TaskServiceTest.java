package test;
import java.util.*;
import junit.framework.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import module4.TaskService;
import module4.Task;

class TaskServiceTest {

	@Test	
	void testUniqueIdAddTask() {
		TaskService taskService = new TaskService();
		Task task = new Task("123456789", "RequiredTaskName", "RequiredTaskDescription");
		
		assertTrue(taskService.addTask(task));
		assertTrue(taskService.numberOfTasks() == 1);
		
	}
	
	 @Test	
		void testIdenticalIdAddTask() {
		TaskService taskService = new TaskService();
		Task task1 = new Task("123456789", "RequiredTaskName", "RequiredTaskDescription");
		Task task2 = new Task("123456789", "RequiredTaskName2", "RequiredTaskDescription2");
				
		assertTrue(taskService.addTask(task1));
		
		if(taskService.addTask(task2))
       {
         fail("Added Id already in database.");
       }
  }
	 
	 @Test	
		void testDeleteTaskPerId() {
			TaskService taskService = new TaskService();
			Task task = new Task("123456789", "RequiredTaskName", "RequiredTaskDescription");
			
			assertTrue(taskService.addTask(task));
			
			assertTrue(taskService.numberOfTasks() == 1);
			
			assertTrue(taskService.deleteTask("123456789"));
			
			assertTrue(taskService.numberOfTasks() == 0);
				
		}
	 
	 @Test	
		void testUpdateTaskAllFieldsPerId() {
		 	TaskService taskService = new TaskService();
		 	Task task1 = new Task("123456789", "RequiredTaskName1", "RequiredTaskDescription1");
		 	Task task2 = new Task("123456789", "RequiredTaskName2", "RequiredTaskDescription2");
		 	assertTrue(taskService.addTask(task1)); 
		 	assertTrue(taskService.updateTask(task2));
     
      
     }

	 
	 

}

