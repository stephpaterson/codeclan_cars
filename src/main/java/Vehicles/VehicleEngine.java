package Vehicles;

public class VehicleEngine extends CarComponent {

    private EngineType engineType;

    public VehicleEngine(EngineType engineType, double cost, double repairCost, boolean damage){
        super(cost, repairCost, damage);
        this.engineType = engineType;
    }

}
