package de.hbrs.team89.se1_starter_repo;

import java.util.ArrayList;
import java.util.List;

public class ParkingGarage implements ParkingGarageIF {

    private List<CarIF> parkingspot;

    public ParkingGarage() {
        parkingspot = new ArrayList<CarIF>();
    }

    @Override
    public void enter(CarIF newCar) {
        parkingspot.add(newCar);
    }

    @Override
    public void leave(CarIF oldCar) {
        parkingspot.remove(oldCar);
    }

    @Override
    public CarIF get(int index) throws IndexOutOfBoundsException{
        return parkingspot.get(index);
    }

    @Override
    public List<CarIF> getParkingSpot() {
        return parkingspot;
    }
}
