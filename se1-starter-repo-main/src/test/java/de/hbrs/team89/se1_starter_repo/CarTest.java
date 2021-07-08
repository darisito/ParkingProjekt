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

class CarTest {

    private Car newCar;

    @BeforeEach
    void setup() {
        newCar = new Car(5, 123456789l, "Ticket1", "#0d1e0a", 1, "any", "PKW", 751);
    }
    @AfterEach
    void teardown() {
        newCar = null;
    }
    @DisplayName("Checks if the Car number is being initialized correctly")
    @Test
    void testGetNr() {
        assertEquals(5, newCar.getNr(), "The values are not equal");
    }

    @DisplayName("Checks if the time the Car begins to enter is being initialized correctly")
    @Test
    void testGetBegin() {
        assertEquals(123456789l, newCar.getBegin(), "The values are not equal");
    }

    @DisplayName("Checks if the time the Car leaves is being initialized correctly")
    @Test
    void testGetEnd() {
        assertEquals(0, newCar.getEnd(), "The values are not equal");
    }

    @DisplayName("Checks if the duration the Car is in the garage is being initialized correctly")
    @Test
    void testGetDuration() {
        assertEquals(0, newCar.getDuration(), "The values are not equal");
    }

    @DisplayName("Checks if the price the Car has to pay is being initialized correctly")
    @Test
    void testGetPrice() {
        assertEquals(0, newCar.getPrice(), "The values are not equal");
    }

    @DisplayName("Checks if the ticket of the Car is being initialized correctly")
    @Test
    void testGetTicket() {
        assertEquals("Ticket1", newCar.getTicket(), "The Strings are not equal");
    }

    @DisplayName("Checks if the color of the Car is being initialized correctly")
    @Test
    void testGetColor() {
        assertEquals("#0d1e0a", newCar.getColor(), "The Strings are not equal");
    }

    @DisplayName("Checks if the parking spot nr. of the Car is being initialized correctly")
    @Test
    void testGetSpace() {
        assertEquals(1, newCar.getSpace(), "the values are not equal");
    }

    @DisplayName("Checks if the category the Car is being initialized correctly")
    @Test
    void testGetCategory() {
        assertEquals("any", newCar.getCategory(), "the Strings are not equal");
    }

    @DisplayName("Checks if the vehicle type of the Car is being initialized correctly")
    @Test
    void testGetVehicleType() {
        assertEquals("PKW", newCar.getVehicleType(), "the Strings are not equal");
    }

    @DisplayName("Checks if the license plate of the Car is being initialized correctly")
    @Test
    void testGetLicense() {
        assertEquals(751, newCar.getLicense(), "The values are not equal");
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
        assertEquals(newCar.getNr() + "/" + newCar.getBegin() + "/" + newCar.getDuration() + "/" + newCar.getPrice() + "/" + newCar.getTicket() + "/" + newCar.getColor() + "/" + newCar.getSpace() + "/" + newCar.getCategory() + "/" + newCar.getVehicleType() + "/" + newCar.getLicense(), newCar.toString(), "The string's are not equal");
    }
}