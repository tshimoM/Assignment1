/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tshimologomokiba_a11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
class StudentManagement {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Method to capture a new student
    public void saveStudent() {
        System.out.print("Enter the student id: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter the student name: ");
        String name = scanner.nextLine();

        int age;
        while (true) {
            System.out.print("Enter the student age: ");
            age = scanner.nextInt();
            if (age >= 16) {
                break;
            } else {
                System.out.println("Invalid student age! Please re-enter a valid age (>= 16).");
            }
        }

        scanner.nextLine();  // Consume newline
        System.out.print("Enter the student email: ");
        String email = scanner.nextLine();

        System.out.print("Enter the student course: ");
        String course = scanner.nextLine();

        Student student = new Student(id, name, age, email, course);
        students.add(student);
        System.out.println("Student details have been successfully saved.");
    }

    // Method to search for a student by ID
    public void searchStudent() {
        System.out.print("Enter the student id to search: ");
        int id = scanner.nextInt();
        boolean found = false;

        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println(student);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with Student Id: " + id + " was not found!");
        }
    }

    // Method to delete a student by ID
    public void deleteStudent() {
        System.out.print("Enter the student id to delete: ");
        int id = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                System.out.print("Are you sure you want to delete student " + id + " from the system? (Y/N): ");
                char confirmation = scanner.next().charAt(0);
                if (confirmation == 'Y' || confirmation == 'y') {
                    students.remove(i);
                    System.out.println("Student with Student Id: " + id + " has been deleted!");
                } else {
                    System.out.println("Student deletion canceled.");
                }
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with Student Id: " + id + " was not found!");
        }
    }

    // Method to print the student report
    public void studentReport() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    // Method to exit the application
    public void exitStudentApplication() {
        System.out.println("Exiting application...");
        System.exit(0);
    }
}
