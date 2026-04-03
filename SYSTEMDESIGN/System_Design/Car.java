package System_Design;

public class Car {
    // Attributes
    private String brand;
    private String model;
    private int speed;

    // Constructor
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    // Method to accelerate
    public void accelerate(int increment) {
        speed += increment;
    }

    // Method to display info
    public void displayStatus() {
        System.out.println(brand + " is running at " + speed + " km/h.");
    }
}