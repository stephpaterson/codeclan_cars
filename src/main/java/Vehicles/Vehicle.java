package Vehicles;

import java.util.ArrayList;

public class Vehicle  {

    private VehicleEngine vehicleEngine;
    private ArrayList tyres;
    private Colour colour;
    private double price;

    public Vehicle(VehicleEngine vehicleEngine, ArrayList tyres, Colour colour, double price){
        this.vehicleEngine = vehicleEngine;
        this.tyres = tyres;
        this.colour = colour;
        this.price = price;
    }


}
