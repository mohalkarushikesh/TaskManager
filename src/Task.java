import java.util.Date;

public class Task {
    private String name;
    private String description;
    private Date dueDate;
    private boolean isCompleted;

    // constructor
    public Task(String name, String description, Date dueDate, boolean isCompleted) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.isCompleted = isCompleted;
    }
    // getters

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

}
