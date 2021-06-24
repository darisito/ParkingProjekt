package de.hbrs.team89.se1_starter_repo;

interface CarIF {
   int getNr();
   long getBegin();
   long getEnd();
   int getDuration();
   int getPrice();
   String getCategory();
   int getParkingSpotNr();
   String getVehicleType();
   //test
   void setEnd(long end);
   void setDuration(int duration);
   void setPrice(int price);
}
