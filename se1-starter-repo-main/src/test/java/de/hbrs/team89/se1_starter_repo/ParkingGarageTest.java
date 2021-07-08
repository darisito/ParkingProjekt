package de.hbrs.team89.se1_starter_repo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Dilan Ahmad
 * @since 08.07.2021
 * @version 1.0
 */

class ParkingGarageTest {

    private CarIF car;
    private CarIF car2;
    private ParkingGarageIF parkingGarage;

    @BeforeEach
    void setup() {
        car = new Car(5, 123456789l, "Ticket1", "#0d1e0a", 1, "any", "PKW", 751);
        car2 = new Car(7, 99999999l, "Ticket2", "#0d1e0a", 10, "Family", "SUV", 111);
        parkingGarage = new ParkingGarage();
    }
    @AfterEach
    void teardown() {
        car = null;
        car2 = null;
        parkingGarage = null;
    }

    @DisplayName("Checks if a car enters the parking garage")
    @Test
    void testEnter() {
        parkingGarage.enter(car);
        assertEquals(1, parkingGarage.getParkingSpot().size(), "the Car did not enter");
    }

    @DisplayName("Checks if a car leaves the parking garage")
    @Test
    void testLeave() {
        parkingGarage.enter(car);
        assertEquals(1, parkingGarage.getParkingSpot().size(), "the Car did not enter");
        parkingGarage.leave(car);
        assertEquals(0, parkingGarage.getParkingSpot().size(), "the Car did not leave");
    }

    @DisplayName("Checks if the get method returns the correct car")
    @Test
    void testGet() {
        assertEquals(null, parkingGarage.get(1), "the car's are not equal");
        parkingGarage.enter(car);
        assertEquals(car, parkingGarage.get(1), "the car's are not equal");
        parkingGarage.enter(car2);
        assertEquals(car2, parkingGarage.get(10), "the car's are not equal");
    }

    @DisplayName("Checks if the toString representation of a parking garage is being initialized correctly")
    @Test
    void testToString() {
        assertEquals("", parkingGarage.toString(), "the Strings are not equal");
        parkingGarage.enter(car);
        assertEquals(car.toString() + ", ", parkingGarage.toString(), "the Strings are not equal");
        parkingGarage.enter(car2);
        assertEquals(car.toString() + ", " + car2.toString() + ", ", parkingGarage.toString(), "the Strings are not equal");
    }
}