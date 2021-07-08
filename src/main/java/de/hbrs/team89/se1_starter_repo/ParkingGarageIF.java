<<<<<<< HEAD:se1-starter-repo-main/src/main/java/de/hbrs/team89/se1_starter_repo/ParkingGarageIF.java
package de.hbrs.team89.se1_starter_repo;

import java.util.List;

/**
 * @author Dilan Ahmad
 * @since 08.07.2021
 * @version 1.0
 */

public interface ParkingGarageIF{

    void enter(CarIF newCar);
    void leave(CarIF oldCar);
    CarIF get(int index);
    List<CarIF> getParkingSpot();
    String toString();
}
=======
package de.hbrs.team89.se1_starter_repo;

import java.util.List;

public interface ParkingGarageIF {

    void enter(CarIF newCar);
    void leave(CarIF oldCar);
    CarIF get(int index);
    List<CarIF> getParkingSpot();
}
>>>>>>> master:src/main/java/de/hbrs/team89/se1_starter_repo/ParkingGarageIF.java
