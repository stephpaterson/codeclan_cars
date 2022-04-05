import Vehicles.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestCustomer {

    Customer customer;
    ArrayList<Vehicle> ownedVehicles;
    Car car1;
    Car car2;
    ArrayList<Tyres> listOfTyres;
    Tyres tyre;
    VehicleEngine engine;

    @Before
    public void beforeEach() {
        ownedVehicles = new ArrayList<>();
        listOfTyres = new ArrayList<>();
        customer = new Customer(10000, ownedVehicles);
        tyre = new Tyres(85, 0, false);
        listOfTyres.add(tyre);
        listOfTyres.add(tyre);
        listOfTyres.add(tyre);
        listOfTyres.add(tyre);
        engine = new VehicleEngine(EngineType.ELECTRIC, 500, 0, false);
        car1 = new Car(5,engine, listOfTyres, Colour.RED, 5000);
        car2 = new Car(5,engine, listOfTyres, Colour.RED, 5000);

    }

    @Test
    public void canAddCarTooCollection() {
        int numberBefore = customer.numberOfVehicles();
        customer.buyVehicle(car1);
        int numberAfter = customer.numberOfVehicles();
        assertEquals(numberBefore +1, numberAfter);
    }
}
