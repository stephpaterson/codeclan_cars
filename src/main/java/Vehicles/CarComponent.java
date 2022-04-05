package Vehicles;

public class CarComponent {

    private double cost;
    private double repairCost;
    private boolean damage;

    public CarComponent(double cost, double repairCost, boolean damage) {
        this.cost = cost;
        this.repairCost = repairCost;
        this.damage = damage;
    }

}
