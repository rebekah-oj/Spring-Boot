package com.company.Entity;

public class  Student {

    //student id
    private int id;
    //student name
    private String name;
    //student course
    private String course;

    //constructor
    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    //empty constructor
    public Student() {
    }

    //getters and setters methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
