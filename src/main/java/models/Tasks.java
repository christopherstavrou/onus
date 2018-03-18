package models;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;

import java.util.Date;
import java.util.UUID;

/**
 * A Task/Goal is an objective to be completed. A task can have many sub tasks
 *
 * @author Christopher Stavrou
 */
public class Tasks {


    /**
     * Name of the project
     */
    SimpleStringProperty title = new SimpleStringProperty(this, "title");

    /**
     * A description of the project and its dependencies;
     */
    SimpleStringProperty descriptions = new SimpleStringProperty(this, "descriptions");

    /**
     * The person who is to complete the task. e.g. "Luke Williamson"
     */
    SimpleStringProperty asignedTo = new SimpleStringProperty(this, "asignedTo");


    /**
     * Unique ID
     */
    String uniquieId = UUID.randomUUID().toString();

    /**
     * A collection of tasks to be completed to meet the current tasks overall goal
     */
    SimpleListProperty<Tasks> subTaskList = new SimpleListProperty<Tasks>(this, "subTaskList");

    /**
     * The deadline for the current task, must be later than that of the sub tasks
     */
    SimpleObjectProperty<Date> deadline = new SimpleObjectProperty<Date>(this, "deadline");

    /**
     * interval reminders must be before the deadline
     */
    SimpleListProperty<Date> reminders = new SimpleListProperty<Date>(this, "reminders");

    /**
     * The complete state of the current tasks. The tasks is complete if the state is true otherwise it is false
     */
    SimpleBooleanProperty isComplete = new SimpleBooleanProperty(this, "isComplete");


    public String getTitle() {
        return title.get();
    }

    public SimpleStringProperty titleProperty() {
        return title;
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public String getDescriptions() {
        return descriptions.get();
    }

    public SimpleStringProperty descriptionsProperty() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions.set(descriptions);
    }

    public String getAsignedTo() {
        return asignedTo.get();
    }

    public SimpleStringProperty asignedToProperty() {
        return asignedTo;
    }

    public void setAsignedTo(String asignedTo) {
        this.asignedTo.set(asignedTo);
    }

    public ObservableList<Tasks> getSubTaskList() {
        return subTaskList.get();
    }

    public SimpleListProperty<Tasks> subTaskListProperty() {
        return subTaskList;
    }

    public void setSubTaskList(ObservableList<Tasks> subTaskList) {
        this.subTaskList.set(subTaskList);
    }

    public Date getDeadline() {
        return deadline.get();
    }

    public SimpleObjectProperty<Date> deadlineProperty() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline.set(deadline);
    }

    public ObservableList<Date> getReminders() {
        return reminders.get();
    }

    public SimpleListProperty<Date> remindersProperty() {
        return reminders;
    }

    public void setReminders(ObservableList<Date> reminders) {
        this.reminders.set(reminders);
    }

    public boolean isIsComplete() {
        return isComplete.get();
    }

    public SimpleBooleanProperty isCompleteProperty() {
        return isComplete;
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete.set(isComplete);
    }
}
