package de.hbrs.team89.se1_starter_repo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingGarageTest {

    private CarIF car;
    private ParkingGarageIF parkingGarage;

    @BeforeEach
    void setup() {
        car =  new Car(128, 123456789L, "any", 1, "PKW");
        parkingGarage = new ParkingGarage();
    }
    @AfterEach
    void teardown() {
        car = null;
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
        parkingGarage.enter(car);
        assertEquals(car, parkingGarage.get(0), "the car's are not equal");
    }
}