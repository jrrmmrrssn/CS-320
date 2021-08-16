package module4;

import java.util.ArrayList;

public class TaskService {
		private ArrayList<Task> tasks;
		
		public TaskService() {
			this.tasks = new ArrayList<Task>();
		}
		
		public boolean addTask(Task task) {
	        for (int i = 0; i < tasks.size(); i++) {
	             if (tasks.get(i).getUniqueTaskId().equals(task.getUniqueTaskId())) {
	                 return false;
	             }
	        }
	        tasks.add(task);
	        return true;
	    }

		public boolean deleteTask(String id) {
	      for(int i = 0; i < tasks.size(); i++) {
	        if (tasks.get(i).getUniqueTaskId().equals(id)) {
	          tasks.remove(i);
	          return true;
	        }
	      }
	      return false;
	    }

		public boolean updateTask(Task task) {
	      for(int i = 0; i < tasks.size(); i++) {
	        if (tasks.get(i).getUniqueTaskId().equals(task.getUniqueTaskId())) {
	          tasks.set(i, task);
	          return true;
	        }
	      }
	      return false;
	    }
		public int numberOfTasks() {
			return tasks.size();
		}
	}
