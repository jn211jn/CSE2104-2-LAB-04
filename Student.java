/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student;

/**
 *
 * @author Shimi
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

    public class Student {
    private String ID;
    private String Name;
    private String Department;
    private float CGPA;
     private static String University = "University of Liberal Arts Bangladesh";
    private static int count = 0;

    public Student(String ID, String Name, String Department, float CGPA) {
        this.ID = ID;
        this.Name = Name;
        this.Department = Department;
        this.CGPA = CGPA;
        count++;
    }

    public void display_details() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + Name);
        System.out.println("Department: " + Department);
        System.out.println("CGPA: " + CGPA);
         System.out.println("University: " + University);
    }

    public static void display_Totalstudents() {
        System.out.println("Total students = " + count);
    }

    public static void resetCount() {
        count = 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Array ----- ");
        Student[] arraystudents = new Student[3];

        for (int x = 0; x<3; x++) {
            System.out.print("Enter the student ID " + (x+1) + " = ");
            String id = scanner.nextLine();
            System.out.print("Enter the name of the student " + (x+1) + " = ");
            String name = scanner.nextLine();
            System.out.print("Enter the department of the student" + (x+1) + " = ");
            String Department = scanner.nextLine();
            System.out.print("Enter the CGPA of the student " + (x+1) + " = ");
            float cgpa = scanner.nextFloat();
            scanner.nextLine(); 

            arraystudents[x] = new Student (id, name, Department, cgpa);
        }

        for (Student student: arraystudents) {
            student.display_details();
            System.out.println();
        }

        Student.display_Totalstudents();

        Student.resetCount();

        System.out.println("\nArrayList ------- ");
        ArrayList<Student> array_liststudents = new ArrayList<>();

        for (int x = 0; x<3; x++) {
            System.out.print("Enter the student ID " + (x+1) + " = ");
            String id = scanner.nextLine();
            System.out.print("Enter the name of the student " + (x+1) + " = ");
            String name = scanner.nextLine();
            System.out.print("Enter the department of the student" + (x+1) + " = ");
            String Department = scanner.nextLine();
            System.out.print("Enter the CGPA of the student " + (x+1) + " = ");
            float CGPA = scanner.nextFloat();
            scanner.nextLine(); 

            array_liststudents.add(new Student(id, name, Department,CGPA));
        }

        for (Student student : array_liststudents) {
            student.display_details();
            System.out.println();
        }

        Student.display_Totalstudents();

        Student.resetCount();

        System.out.println("\nLinkedList -------- ");
        LinkedList<Student> linked_listStudent = new LinkedList<>();

        for (int x=0; x<3; x++) {
            System.out.print("Enter the student ID " + (x+1) + " = ");
            String id = scanner.nextLine();
            System.out.print("Enter the name of the student " + (x+1) + " = ");
            String name = scanner.nextLine();
            System.out.print("Enter the department of the student" + (x+1) + " = ");
            String department = scanner.nextLine();
            System.out.print("Enter the CGPA of the student " + (x+1) + " = ");
            float cgpa = scanner.nextFloat();
            scanner.nextLine(); 

            linked_listStudent.add(new Student(id, name, department, cgpa));
        }

        for (Student student : linked_listStudent) {
            student.display_details();
            System.out.println();
        }

        Student.display_Totalstudents();
    }
}
