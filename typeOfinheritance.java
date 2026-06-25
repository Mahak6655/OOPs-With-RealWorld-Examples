
// Single Inheritance
// Parent Class
class Vehicle {

    // Properties of a vehicle
    double price;
    double mileage;
    String color;

    // Method to display vehicle details
    void display() {
        System.out.println(price);
        System.out.println(mileage);
        System.out.println(color);
    }
}

// Child Class inheriting Vehicle
class Car extends Vehicle {

    // Additional properties specific to a car
    String ftype;      // Fuel type
    boolean sunroof;   // Availability of sunroof
}

// Multilevel Inheritance
// SportsCar inherits Car, which already inherits Vehicle
class SportsCar extends Car {

    // Additional property specific to SportsCar
    int topSpeed;
}

public class typeOfinheritance {

    public static void main(String[] args) {

        // -------- Single Inheritance Example --------
        Car c = new Car();

        System.out.println("Car Details:");
        System.out.println(c.price = 890000);
        System.out.println(c.mileage = 20000);
        System.out.println(c.color = "White");
        System.out.println(c.ftype = "Electric");
        System.out.println(c.sunroof = true);

        // -------- Multilevel Inheritance Example --------
        SportsCar sc = new SportsCar();

        System.out.println("\nSports Car Details:");
        System.out.println(sc.price = 2500000);
        System.out.println(sc.mileage = 15000);
        System.out.println(sc.color = "Red");
        System.out.println(sc.ftype = "Petrol");
        System.out.println(sc.sunroof = true);
        System.out.println(sc.topSpeed = 320);
    }
}
