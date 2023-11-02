import java.util.ArrayList;
import java.util.List;


public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> listTasks() {
        return tasks;
    }

    public void markTaskAsComplete(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            tasks.get(taskIndex).setCompleted(true);
        }
    }

    public void deleteTask(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            tasks.remove(taskIndex);
        }
    }
}


