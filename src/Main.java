import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();

        Task task1 = new Task("homework", "english assignment", new Date(), false);
        Task task2 = new Task("homework", "math assignment", new Date(), false);
        Task task3 = new Task("homework", "physics assignment", new Date(), false);
        Task task4 = new Task("homework", "chemistry assignment", new Date(), false);

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);
        taskManager.addTask(task4);

        // listing task
        List<Task> tasks = taskManager.listTasks();
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println("Task " + (i + 1) + ":");
            System.out.println("Name: " + task.getName());
            System.out.println("Description: " + task.getDescription());
            System.out.println("Due Date: " + task.getDueDate());
            System.out.println("Completed: " + task.isCompleted());
        }

        // marking task as a complete
        taskManager.markTaskAsComplete(0);

        // delete a task
        taskManager.deleteTask(1);

        // List tasks again to see the changes
        tasks = taskManager.listTasks();
        System.out.println("\nAfter marking as complete and deleting tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println("Task " + (i + 1) + ":");
            System.out.println("Name: " + task.getName());
            System.out.println("Description: " + task.getDescription());
            System.out.println("Due Date: " + task.getDueDate());
            System.out.println("Completed: " + task.isCompleted());
        }
    }
}

