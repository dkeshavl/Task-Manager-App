package com.keshav.taskmanagerapp;

import java.util.Scanner;

public class TaskManagerApp {

    public static void main(String[] args) {
        Scanner oS = new Scanner(System.in);
        
        TaskManager tM = new TaskManager();
                
        int choice;
        while (true) {
            System.out.println("-------------------------------");
            System.out.println("1. Add Task\n"
                    + "2. Update Task Status\n"
                    + "3. Delete Task\n"
                    + "4. View All Tasks\n"
                    + "5. View Tasks by Status\n"
                    + "6. View Tasks by Due Date\n"
                    + "7. Exit");
            System.out.println("-------------------------------");
            System.out.print("Enter your Choice : ");
            choice = oS.nextInt();
            switch(choice){
                case 1 : tM.addTask(); ;break;
                case 2 : tM.updateTaskStatus();break;
                case 3 : tM.deleteTask();break;
                case 4 : tM.printTask(); ;break;
                case 5 : tM.viewTasksByStatus();break;
                case 6 : tM.viewTasksByDueDate();break;
                case 7 : return;
            }
        }
    }
}
