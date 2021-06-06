package parkhaus;

import java.util.List;

public interface ParkingGarageIF {

    void enter(CarIF newCar);
    void leave(CarIF oldCar);
    CarIF get(int index);
    List<CarIF> getParkingSpot();
}