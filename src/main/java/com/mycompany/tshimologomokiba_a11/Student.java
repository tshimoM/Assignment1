/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tshimologomokiba_a11;

/**
 *
 * @author RC_Student_lab
 */
class Student {
     private int id;
    private String name;
    private int age;
    private String email;
    private String course;

    // Constructor
    public Student(int id, String name, int age, String email, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public String getCourse() { return course; }

    // toString method to display student details
    @Override
    public String toString() {
        return "STUDENT ID: " + id + "\nSTUDENT NAME: " + name + "\nSTUDENT AGE: " + age + "\nSTUDENT EMAIL: " + email + "\nSTUDENT COURSE: " + course + "\n";
    }
}
