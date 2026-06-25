
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

public class inheritance {

    public static void main(String[] args) {

        // Creating an object of Car class
        Car c = new Car();

        // Assigning values to inherited properties
        System.out.println(c.price = 890000);
        System.out.println(c.mileage = 20000);
        System.out.println(c.color = "White");

        // Assigning values to Car-specific properties
        System.out.println(c.ftype = "Electric");
        System.out.println(c.sunroof = true);
    }
}


