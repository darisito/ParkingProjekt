package de.hbrs.team89.se1_starter_repo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Car newCar;

    @BeforeEach
    void setup() {
        newCar = new Car(788, 123456789l, "any", 1, "PKW");
    }
    @AfterEach
    void teardown() {
        newCar = null;
    }
    @DisplayName("Checks if the Car number is being initialized correctly")
    @Test
    void testNr() {
        assertEquals(788, newCar.getNr(), "The values are not equal");
    }

    @DisplayName("Checks if the time the Car begins to enter is being initialized correctly")
    @Test
    void testBegin() {
        assertEquals(123456789l, newCar.getBegin(), "The values are not equal");
    }

    @DisplayName("Checks if the time the Car leaves is being initialized correctly")
    @Test
    void testEnd() {
        assertEquals(0, newCar.getEnd(), "The values are not equal");
    }

    @DisplayName("Checks if the duration the Car is in the garage is being initialized correctly")
    @Test
    void testDuration() {
        assertEquals(0, newCar.getDuration(), "The values are not equal");
    }

    @DisplayName("Checks if the price the Car has to pay is being initialized correctly")
    @Test
    void testPrice() {
        assertEquals(0, newCar.getPrice(), "The values are not equal");
    }

    @DisplayName("Checks if the category the Car is being initialized correctly")
    @Test
    void testCategory() {
        assertEquals("any", newCar.getCategory(), "the Strings are not equal");
    }

    @DisplayName("Checks if the parking spot nr. of the Car is being initialized correctly")
    @Test
    void testParkingSpotNr() {
        assertEquals(1, newCar.getParkingSpotNr(), "the values are not equal");
    }

    @DisplayName("Checks if the vehicle type of the Car is being initialized correctly")
    @Test
    void testVehicleType() {
        assertEquals("PKW", newCar.getVehicleType(), "the Strings are not equal");
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
        assertEquals(newCar.getNr() + ", " + newCar.getBegin() + ", " + newCar.getEnd() + ", " + newCar.getDuration() + ", " + newCar.getPrice() + ", " + newCar.getCategory() + ", " + newCar.getParkingSpotNr() + ", " + newCar.getVehicleType(), newCar.toString(), "The string's are not equal");
    }
}