package de.hbrs.team89.se1_starter_repo;

/**
 * @author Dilan Ahmad
 * @since 08.07.2021
 * @version 1.0
 */

interface CarIF {
   int getNr();
   long getBegin();
   long getEnd();
   int getDuration();
   int getPrice();
   String getTicket();
   String getColor();
   int getSpace();
   String getCategory();
   String getVehicleType();
   int getLicense();

   void setEnd(long end);
   void setDuration(int duration);
   void setPrice(int price);
   String toString();
}