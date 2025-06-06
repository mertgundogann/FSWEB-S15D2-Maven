package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private  Set<Task> annsTasks;
    private  Set<Task> bobsTasks;
    private  Set<Task> carolsTasks;
    private  Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String name) {
        return switch (name.toLowerCase()) {
            case "ann" -> annsTasks;
            case "bob" -> bobsTasks;
            case "carol" -> carolsTasks;
            case "all" -> getUnion(annsTasks, bobsTasks, carolsTasks, unassignedTasks);
            default -> new HashSet<>();
        };
    }

    public Set<Task> getUnion(Set<Task>... sets) {
        Set<Task> result = new HashSet<>();
        for (Set<Task> set : sets) {
            result.addAll(set);
        }
        return result;
    }

    public Set<Task> getIntersection(Set<Task> set1, Set<Task> set2) {
        Set<Task> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public Set<Task> getDifferences(Set<Task> set1, Set<Task> set2) {
        Set<Task> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }

    public Set<Task> getMultipleAssignedTasks() {
        Set<Task> allTasks = getUnion(annsTasks, bobsTasks, carolsTasks);
        Set<Task> duplicates = new HashSet<>();

        for (Task task : allTasks) {
            int count = 0;
            if (annsTasks.contains(task)) count++;
            if (bobsTasks.contains(task)) count++;
            if (carolsTasks.contains(task)) count++;
            if (count > 1) {
                duplicates.add(task);
            }
        }
        return duplicates;
    }
}
