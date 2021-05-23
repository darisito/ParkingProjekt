package parkhaus;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Car newCar;
    private int nr;
    private long begin;

    @BeforeEach
    void setup() {
        nr = 788;
        begin = 123456789l;
        newCar = new Car(nr, begin);
    }
    @AfterEach
    void teardown() {
        nr = 0;
        begin = 0;
        newCar = null;
    }
    @DisplayName("Checks if the Car number is being initialized correctly")
    @Test
    void testNr() {
        assertEquals(788, newCar.getNr(), "The number's are not equal");
    }

    @DisplayName("Checks if the time the Car begins to enter is being initialized correctly")
    @Test
    void testBegin() {
        assertEquals(123456789l, newCar.getBegin(), "The number's are not equal");
    }

    @DisplayName("Checks if the time the Car leaves is being initialized correctly")
    @Test
    void testEnd() {
        assertEquals(0, newCar.getEnd(), "The number's are not equal");
    }

    @DisplayName("Checks if the duration the Car is in the garage is being initialized correctly")
    @Test
    void testDuration() {
        assertEquals(0, newCar.getDuration(), "The number's are not equal");
    }

    @DisplayName("Checks if the price the Car has to pay is being initialized correctly")
    @Test
    void testPrice() {
        assertEquals(0, newCar.getPrice(), "The number's are not equal");
    }

    @DisplayName("Checks if the setEnd Method changes the Value of end")
    @Test
    void testSetEnd() {
        newCar.setEnd(0);
        assertEquals(0, newCar.getEnd(), "The values are not equal");
    }

    @DisplayName("Checks if the setDuration Method changes the Value of end")
    @Test
    void testSetDuration() {
        newCar.setDuration(0);
        assertEquals(0, newCar.getDuration(), "The values are not equal");
    }

    @DisplayName("Checks if the setPrice Method changes the Value of end")
    @Test
    void testSetPrice() {
        newCar.setPrice(0);
        assertEquals(0, newCar.getPrice(), "The values are not equal");
    }

    @DisplayName("Checks if the toString representation of a car is being initialized correctly")
    @Test
    void testToString() {
        assertEquals(newCar.getNr() + ", " + newCar.getBegin() + ", " + newCar.getEnd() + ", " + newCar.getDuration() + ", " + newCar.getPrice(), newCar.toString(), "The string's are not equal");
    }
}