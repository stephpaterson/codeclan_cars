package Vehicles;

import java.util.ArrayList;

public class Car extends Vehicle {

    private int numberOfTyres;
    private int numberOfDoors;

    public Car(int numberOfDoors, VehicleEngine vehicleEngine, ArrayList tyres, Colour colour, double price) {
        super(vehicleEngine, tyres, colour, price);
        this.numberOfDoors = numberOfDoors;
        this.numberOfTyres = 4;
    }
}
