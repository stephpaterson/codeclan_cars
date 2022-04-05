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

    public double getCost() {
        return this.cost;
    }

    public double getRepairCost() {
        return this.repairCost;
    }

    public boolean getDamage() {
        return this.damage;
    }

    public void addDamage(double newRepairCost) {
        this.damage = true;
        this.repairCost += newRepairCost;

    }

    public void repairDamage() {
        this.damage = false;
        this.repairCost = 0;
    }



}
