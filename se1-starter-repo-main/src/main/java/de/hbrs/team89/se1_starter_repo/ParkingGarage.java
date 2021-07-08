package de.hbrs.team89.se1_starter_repo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dilan Ahmad
 * @since 08.07.2021
 * @version 1.0
 */

public class ParkingGarage implements ParkingGarageIF {

    private List<CarIF> parkingSpot;

    /**
     * create empty parking garage
     */
    public ParkingGarage() {
        parkingSpot = new ArrayList<CarIF>();
    }

    /**
     * @param newCar to enter the parking garage
     */
    @Override
    public void enter(CarIF newCar) {
        parkingSpot.add(newCar);
    }

    /**
     * @param oldCar to leave the parking garage
     */
    @Override
    public void leave(CarIF oldCar) {
        parkingSpot.remove(oldCar);
    }

    /**
     * @param space number the car is parking
     * @return the car equal to the space number
     */
    @Override
    public CarIF get(int space) throws IndexOutOfBoundsException{
        for (CarIF c: parkingSpot) {
            if (c.getSpace() == space) {
                return c;
            }
        }
        return null;
    }

    /**
     * @return the parking garage
     */
    @Override
    public List<CarIF> getParkingSpot() {
        return parkingSpot;
    }

    /**
     * @return the toString representation of a parking garage
     */
    @Override
    public String toString() {
        String output = "";
        for (CarIF c: parkingSpot) {
            output += c + ", ";
        }
        return output;
    }
}