package de.hbrs.team89.se1_starter_repo;

import java.util.List;

public interface ParkingGarageIF {

    void enter(CarIF newCar);
    void leave(CarIF oldCar);
    CarIF get(int index);
    List<CarIF> getParkingSpot();
}
