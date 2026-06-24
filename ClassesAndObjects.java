/*

* Topic: Classes and Objects in Java
* Description: Basic example demonstrating how to create classes,
* objects, attributes, methods, and constructors.
  */

class Pen {
String color;
String type;

void write() {
    System.out.println("Writing something...");
}

void displayDetails() {
    System.out.println("Pen Color : " + color);
    System.out.println("Pen Type  : " + type);
}


}

class Student {
private String name;
private int age;


// Parameterized Constructor
Student(String name, int age) {
    this.name = name;
    this.age = age;
}

void displayDetails() {
    System.out.println("Student Name : " + name);
    System.out.println("Student Age  : " + age);
}


}

public class ClassesAndObjects {
public static void main(String[] args) {

    // Creating Pen Object
    Pen pen1 = new Pen();
    pen1.color = "Blue";
    pen1.type = "Gel";

    pen1.write();
    pen1.displayDetails();

    System.out.println("------------------");

    // Creating Student Objects
    Student s1 = new Student("Sana", 23);
    Student s2 = new Student("Mahak", 22);

    s1.displayDetails();
    System.out.println("------------------");
    s2.displayDetails();
}


}

     