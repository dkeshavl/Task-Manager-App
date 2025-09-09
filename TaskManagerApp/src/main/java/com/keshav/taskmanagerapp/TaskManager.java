package com.keshav.taskmanagerapp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TaskManager {

    Scanner oS = new Scanner(System.in);
    List<Task> tasks = new ArrayList<>();

    void addTask() {

        Task task = new Task();
        System.out.print("Enter Task Id : ");
        task.setId(oS.nextInt());

        System.out.print("Enter  title : ");
        oS.nextLine();
        task.setTitle(oS.nextLine());

        System.out.print("Enter description : ");
        task.setDescription(oS.nextLine());

        System.out.print("Enter date (yyyy-MM-dd) : ");
        task.setDueDate(LocalDate.parse(oS.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        task.setStatus("Pending");
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    public void updateTaskStatus() {
        System.out.print("Enter Task ID to update: ");
        int id = oS.nextInt();
        oS.nextLine();
        Task task = findTaskById(id);
        if (task == null) {
            System.out.println("Task not found!");
            return;
        }
        System.out.print("Enter\n\t1.Pending\n\t2.On Progress\n\t3.Complete\nEnter Your Choice : ");
        int choice = oS.nextInt();
        oS.nextLine();
        switch (choice) {
            case 1:
                task.setStatus("Pending");
                break;
            case 2:
                task.setStatus("On Progress");
                break;
            case 3:
                task.setStatus("Complete");
                break;
            default:
                System.out.println("Invalid Choice!");
                return;
        }
        System.out.println("Task status updated successfully!");
    }

    public void deleteTask() {
        System.out.print("Enter Task ID to delete: ");
        int id = oS.nextInt();
        oS.nextLine();
        Task task = findTaskById(id);
        if (task != null) {
            tasks.remove(task);
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Task not found!");
        }
    }

    public void printTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available !");
            return;
        }
        for (Task t : tasks) {
            System.out.println(t);
        }
    }

    public void viewTasksByStatus() {
        for (Task t : tasks) {
            if (t.getStatus() == "Complete") {
                System.out.println("\n#Completed tasks :-");
                System.out.println("\nTask Id -------=> " + t.getId());
                System.out.println("Current Status => " + t.getStatus());
                System.out.println("Due Date       => " + t.getDueDate());
            }
            if(t.getStatus() == "On Progress"){
                System.out.println("\n#On Progress tasks :-");
                System.out.println("\nTask Id -------=> " + t.getId());
                System.out.println("Current Status => " + t.getStatus());
                System.out.println("Due Date       => " + t.getDueDate());
            }
            if(t.getStatus() == "Pending"){
                System.out.println("\n#Pending tasks :-");
                System.out.println("\nTask Id -------=> " + t.getId());
                System.out.println("Current Status => " + t.getStatus());
                System.out.println("Due Date       => " + t.getDueDate());
                
            }

        }
    }
    
    public void viewTasksByDueDate() {
        System.out.println("\n#Pending tasks || Progress tasks :-");

        for (Task t : tasks) {
            if(t.getStatus() == "On Progress"){
                System.out.println("\nTask Id ---=> " + t.getId());
                System.out.println("Task Title   => " + t.getTitle());
                System.out.println("Due Date     => " + t.getDueDate());
            }
            if(t.getStatus() == "Pending"){
                System.out.println("\nTask Id ---=> " + t.getId());
                System.out.println("Task Title   => " + t.getTitle());
                System.out.println("Due Date     => " + t.getDueDate());
                
            }

        }
    }

    private Task findTaskById(int id) {
        for (Task t : tasks) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }
}
