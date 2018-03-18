package models;

import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;

import java.io.File;
import java.util.UUID;

/**
 * A project denoted the group of all tasks and its related dependencies
 *
 * @author Christopher Stavrou
 */
public class Project {

    /**
     * Name of the project
     */
    SimpleStringProperty title = new SimpleStringProperty(this, "title");

    /**
     * A description of the project and its dependencies;
     */
    SimpleStringProperty description = new SimpleStringProperty(this, "description");

    /**
     * The running process that is the top most (focused) application running on a system. e.g. an exectuable or dll running on windows
     * <p>
     * TODO: 18/03/2018 @Luke - read this... https://stackoverflow.com/questions/5206633/find-out-what-application-window-is-in-focus-in-java
     */
    SimpleObjectProperty<File> projectProcessor = new SimpleObjectProperty<File>(this, "projectProcessor");

    /**
     * Unique ID
     */
    String uniquieId = UUID.randomUUID().toString();

    /**
     * A collection of tasks to be completed to meet the projects overall goal
     */
    SimpleListProperty<Tasks> tasksList = new SimpleListProperty<Tasks>(this, "tasksList");


    public String getTitle() {
        return title.get();
    }

    public SimpleStringProperty titleProperty() {
        return title;
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public String getDescription() {
        return description.get();
    }

    public SimpleStringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public File getProjectProcessor() {
        return projectProcessor.get();
    }

    public SimpleObjectProperty<File> projectProcessorProperty() {
        return projectProcessor;
    }

    public void setProjectProcessor(File projectProcessor) {
        this.projectProcessor.set(projectProcessor);
    }

    public ObservableList<Tasks> getTasksList() {
        return tasksList.get();
    }

    public SimpleListProperty<Tasks> tasksListProperty() {
        return tasksList;
    }

    public void setTasksList(ObservableList<Tasks> tasksList) {
        this.tasksList.set(tasksList);
    }
}
