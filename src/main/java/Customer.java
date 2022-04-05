import Vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {


    private double money;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(double money, ArrayList<Vehicle> ownedVehicles) {
        this.money = money;
        this.ownedVehicles = ownedVehicles;
    }

    public int numberOfVehicles() {
        return ownedVehicles.size();
    }

    public void buyVehicle(Vehicle vehicle) {
        ownedVehicles.add(vehicle);
    }
}
