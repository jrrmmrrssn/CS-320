package test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import module4.Task;
import module4.TaskService;

class TaskTest {
	
	@Test
	void testTask() {
		Task task = new Task("123456789", "RequiredTaskName", "RequiredTaskDescription");
		assertTrue(task.getUniqueTaskId().equals("123456789"));
		assertTrue(task.getRequiredName().equals("RequiredTaskName"));
		assertTrue(task.getRequiredDescription().equals("RequiredTaskDescription"));
	}
	
	 /*@Test	
		void testTaskIdNotUpdatable() { 
		 	Assertions.assertThrows(IllegalArgumentException.class,	() -> {
		 		//new Task("12341234", "RequiredTaskName", "RequiredTaskDescription");
		 	});		}
		*/
	@Test
	void testTaskIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task(null, "RequiredTaskName", "RequiredTaskDescription");
		});		}
	
	@Test
	void testTaskIdToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("1234567891011", "RequiredTaskName", "RequiredTaskDescription");
		});		}
	
	@Test
	void testTaskRequiredNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("123456789", null, "RequiredTaskDescription");
		});		}
	
	@Test
	void testTaskRequiredNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("123456789", "RequiredTaskNameIsTooLong", "RequiredTaskDescription");
		});		}
	
	@Test
	void testTaskRequiredDescriptionNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("123456789", "RequiredTaskName", null);
		});		}
	
	@Test
	void testTaskRequiredDescriptionToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("123456789", "RequiredTaskName", "RequiredTaskDescriptionTooLong1234567891234567891234567");
		});		}

}
