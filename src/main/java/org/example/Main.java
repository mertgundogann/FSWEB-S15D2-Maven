package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Task> annsTasks = new HashSet<>();
        Set<Task> bobsTasks = new HashSet<>();
        Set<Task> carolsTasks = new HashSet<>();
        Set<Task> unassignedTasks = new HashSet<>();

        Task task1 = new Task("Project A", "Fix login issue", "Ann", Status.IN_QUEUE, Priority.HIGH);
        Task task2 = new Task("Project B", "Implement new feature", "Bob", Status.ASSIGNED, Priority.MED);
        Task task3 = new Task("Project C", "Refactor code", "Carol", Status.IN_QUEUE, Priority.LOW);
        Task task4 = new Task("Project D", "Write documentation", null,Status.IN_PROGRESS,Priority.HIGH);
        Task task5 = new Task("Project E", "Database optimization", "Ann", Status.IN_PROGRESS, Priority.HIGH);
        Task task6 = new Task("Project B", "Implement new feature", "Carol", Status.ASSIGNED, Priority.MED);
        annsTasks.add(task1);
        annsTasks.add(task5);
        bobsTasks.add(task2);
        carolsTasks.add(task3);
        carolsTasks.add(task6);
        unassignedTasks.add(task4);

        TaskData taskData = new TaskData(annsTasks, bobsTasks, carolsTasks, unassignedTasks);

        System.out.println("📌 Ann's Tasks: " + taskData.getTasks("ann"));
        System.out.println("📌 Bob's Tasks: " + taskData.getTasks("bob"));
        System.out.println("📌 Carol's Tasks: " + taskData.getTasks("carol"));
        System.out.println("📌 All Tasks: " + taskData.getTasks("all"));
        System.out.println("📌 Unassigned Tasks: " + unassignedTasks);
        System.out.println("📌 Multiple Assigned Tasks: " + taskData.getMultipleAssignedTasks());

        String text = "Carroll began writing the manuscript of the story the next day, although that earliest version is lost. " +
                "The girls and Carroll took another boat trip a month later, when he elaborated the plot to the story of Alice, " +
                "and in November he began working on the manuscript in earnest. To add the finishing touches he researched " +
                "natural history in connection with the animals presented in the book and then had the book examined " +
                "by other children—particularly those of George MacDonald. Though Carroll did add his own illustrations " +
                "to the original copy, on publication he was advised to find a professional illustrator so the pictures " +
                "were more appealing to its audiences. He subsequently approached John Tenniel to reinterpret " +
                "Carroll's visions through his own artistic eye, telling him that the story had been well liked by the " +
                "children.\n" +
                "\n" +
                "Carroll began planning a print edition of the Alice story in 1863. " +
                "He wrote on 9 May 1863 that MacDonald's family had suggested he publish Alice. " +
                "A diary entry for 2 July says that he received a specimen page of the print edition around that date. " +
                "On 26 November 1864, Carroll gave Alice the manuscript of Alice's Adventures Under Ground, with illustrations " +
                "by Carroll, dedicating it as a Christmas Gift to a Dear Child in Memory of a Summer's Day. " +
                "The published version of Alice's Adventures in Wonderland is about twice the length of " +
                "Alice's Adventures Under Ground and includes episodes, such as the Mad Tea-Party, " +
                "that did not appear in the manuscript. The only known manuscript copy of Under Ground " +
                "is held in the British Library. Macmillan published a facsimile of the manuscript in 1886.";


        Set<String> uniqueWords = StringSet.findUniqueWords();
        System.out.println("Unique Kelime Sayısı: " + uniqueWords.size());
        System.out.println("Alfabetik Sıraya Göre Unique Kelimeler:");
        System.out.println(uniqueWords);
    }

}
