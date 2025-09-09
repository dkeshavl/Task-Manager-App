package com.keshav.taskmanagerapp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Task {
    private int id;
    private String title;
    private String description;
    private String status;
    private LocalDate dueDate;
    
    Scanner oS = new Scanner(System.in);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Task => "+"\n\tid=" + id + "\n\ttitle = " + title + "\n\tdescription = " + description + "\n\tstatus = " + status + "\n\tdueDate = " + dueDate+"\n";
    }
    
}