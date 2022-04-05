package Vehicles;

public enum EngineType {

    PETROL(800, "petrol"),
    ELECTRIC(740, "electric"),
    HYBRID(800, "hybrid");

    private final int horsePower;
    private final String fuelType;

    EngineType(int horsePower, String fuelType) {
        this.horsePower = horsePower;
        this.fuelType = fuelType;
    }
}
