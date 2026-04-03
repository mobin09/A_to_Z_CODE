public class Car {
    // Attributes
    protected String brand;
    protected String model;
   
    public void startEngine(){
        System.out.println("Engine started");
    }

    public void stopEngine(){
        System.out.println("Engine stopped");
    }
   
}

class ElectricCar extends Car {
   public void chargeBattery(){
    System.out.println("Battery Charging");
   }
}

class GasCar extends Car {
    public void fillTank(){
        System.out.println("Filling Gas Tank");
    }
}

