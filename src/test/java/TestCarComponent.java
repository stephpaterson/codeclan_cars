import Vehicles.CarComponent;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCarComponent {

    CarComponent carComponent;
    CarComponent carComponent2;


    @Before
    public void beforeEach() {
        carComponent = new CarComponent(200, 0, false);
        carComponent2 = new CarComponent(200, 100, true);

    }

    @Test
    public void hasCost() {
        assertEquals(200, carComponent.getCost(), 0.01);
    }

    @Test
    public void hasRepairCost() {
        assertEquals(100, carComponent2.getRepairCost(), 0.01);
    }

    @Test
    public void hasDamage() {
        assertEquals(true, carComponent2.getDamage());
    }

    @Test
    public void canAddDamage() {
        carComponent2.addDamage(50);
        assertEquals(true, carComponent2.getDamage());
        assertEquals(150, carComponent2.getRepairCost(), 0.01);
    }

    @Test
    public void canRepairDamage() {
        carComponent2.repairDamage();
        assertEquals(false, carComponent2.getDamage());
        assertEquals(0, carComponent2.getRepairCost(), 0.01);
    }

}
