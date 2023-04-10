package org.launchcode.java.demos.lsn5unittesting.test;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.launchcode.java.demos.lsn5unittesting.main.Car;
import static org.junit.Assert.fail;
public class CarTest {
    //TODO: constructor sets gasTankLevel properly
Car test_car;
@Before
public void createCarObject(){

    test_car = new Car("Toyota", "Prius", 10, 50);
}

@Test
    public void testInitialGasTank(){
    assertEquals(10, test_car.getGasTankLevel(), .001);
}

    //TODO: gasTankLevel is accurate after driving within tank range

@Test
    public void testGasTankAfterDriving(){
    test_car.drive(50);
    assertEquals(9, test_car.getGasTankLevel(), .001);

}

    //TODO: gasTankLevel is accurate after attempting to drive past tank range

@Test
    public void testGasTankAfterExceedingTankRange(){
    test_car.drive(501);
    assertEquals(500, test_car.getOdometer(), .001);
}
    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected=IllegalArgumentException.class)
        public void testGasOverfillException(){
            test_car.addGas(5);
            fail("Shouldn't get here, car cannot have more gas in the tank than tank size");
        }


}
