package org.example.entity;

import java.util.Objects;

public class Task {
    private String project;
    private String description;
    private String assignee;
    private Status status;
    private Priority priority;


    public Task(String project, String description, String assignee,Status status,Priority priority) {
        this.project = project;
        this.description = description;
        this.assignee = assignee;
        this.priority = priority;
        this.status = status;
    }

    public String getProject() {
        return project;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getDescription() {
        return description;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(project, task.project) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(project, description);
    }

    @Override
    public String toString() {
        return "Task{" +
                "project='" + project + '\'' +
                ", description='" + description + '\'' +
                ", assignee='" + assignee + '\'' +
                ", priority=" + priority +
                ", status=" + status +
                '}';
    }
}
