package saf;

public class Car {
    String brand;
    String registrationNumber;
    int maxSpeed;
    String ownerName;
    String color;


    public Car(String brand, String registrationNumber, int maxSpeed, String ownerName, String color) {
        this.brand = brand;
        this.registrationNumber = registrationNumber;
        this.maxSpeed = maxSpeed;
        this.ownerName = ownerName;
        this.color = color;
    }


    public void displayCarDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Color: " + color);
    }

    public static void main(String[] args) {

        Car myCar = new Car("Volvo XC 40", "FFM76J", 180, "Safeena", "Denim BLUE");


        myCar.displayCarDetails();
    }
}


