/*

* Topic: Constructors in Java
* Description: Demonstrates Default Constructor and
* Parameterized Constructor using Student and Pen classes.
  */

// Student Class
class Student {
int studentId;
int studentAge;

// Parameterized Constructor
Student(int studentId, int studentAge) {
    this.studentId = studentId;
    this.studentAge = studentAge;
    System.out.println("Student Object Created");
}


}

// Pen Class
class Pen {
String penColor;
String penType;

// Default Constructor
Pen() {
    System.out.println("Default Constructor Called");
}

// Parameterized Constructor
Pen(String penColor, String penType) {
    this.penColor = penColor;
    this.penType = penType;
    System.out.println("Parameterized Constructor Called");
}

}

public class ConstructorDemo{
public static void main(String[] args) {

    // Creating Student Object
    Student student = new Student(101, 20);

    // Creating Pen Object using Parameterized Constructor
    Pen pen = new Pen("Red", "Ball Pen");
}

}

