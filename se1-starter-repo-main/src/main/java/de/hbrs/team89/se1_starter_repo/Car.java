package de.hbrs.team89.se1_starter_repo;

import java.util.Arrays;

public class Car implements CarIF {

    private int nr;
    private long begin;
    private long end;
    private int duration;
    private int price;
    private String category;
    private int parkingSpotNr;
    private String vehicleType;

    /*
     * @params nr, begin time, category, nr of parking spot and vehicle type of the car e.g. (1, 123456789L, "Family", 5, "PKW")
     */
    public Car(int nr, long begin, String category, int parkingSpotNr, String vehicleType){
        this.nr = nr;
        this.begin = begin;
        this.end = 0;
        this.duration = 0;
        this.price = 0;
        this.category = category;
        this.parkingSpotNr = parkingSpotNr;
        this.vehicleType = vehicleType;
    }

    /*
     * @return nr of the car
     */
    @Override
    public int getNr() {
        return nr;
    }

    /*
     * @return begin time of the car
     */
    @Override
    public long getBegin() {
        return begin;
    }

    /*
     * @return end time of the car
     */
    @Override
    public long getEnd() {
        return end;
    }

    /*
     * @return duration the car has been parking
     */
    @Override
    public int getDuration() {
        return duration;
    }

    /*
     * @return price the car has to pay
     */
    @Override
    public int getPrice() {
        return price;
    }

    /*
     * @return category of the car
     */
    @Override
    public String getCategory() {
        return category;
    }

    /*
     * @return parking spot number the car has been parking in
     */
    @Override
    public int getParkingSpotNr() {
        return parkingSpotNr;
    }

    /*
     * @return vehicle type of the car
     */
    @Override
    public String getVehicleType() {
        return vehicleType;
    }

    /*
     * @param end time of the car
     */
    @Override
    public void setEnd(long end) {
        this.end = end;
    }

    /*
     * @param duration the car has been parking
     */
    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /*
     * @param the price the car has to pay
     */
    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    /*
     * @return toString format of a car
     */
    @Override
    public String toString(){
        return  nr + ", " + begin + ", " + end + ", " + duration + ", " + price + ", " + category + ", " + parkingSpotNr + ", " + vehicleType;
    }
}