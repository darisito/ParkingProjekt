package de.hbrs.team89.se1_starter_repo;

/**
 * @author Dilan Ahmad
 * @since 08.07.2021
 * @version 1.0
 */

public class Car implements CarIF {

    private int nr;
    private long begin;
    private long end;
    private int duration;
    private int price;
    private String ticket;
    private String color;
    private int space;
    private String category;
    private String vehicleType;
    private int license;

    /**
     * @params nr, begin time, ticket, color, parking number, category, vehicle type and license plate of the car
     */
    public Car(int nr, long begin, String ticket, String color, int space, String category, String vehicleType, int license){
        this.nr = nr;
        this.begin = begin;
        this.end = 0;
        this.duration = 0;
        this.price = 0;
        this.ticket = ticket;
        this.color = color;
        this.space = space;
        this.category = category;
        this.vehicleType = vehicleType;
        this.license = license;
    }

    /**
     * @return nr of the car
     */
    @Override
    public int getNr() {
        return nr;
    }

    /**
     * @return begin time of the car
     */
    @Override
    public long getBegin() {
        return begin;
    }

    /**
     * @return end time of the car
     */
    @Override
    public long getEnd() {
        return end;
    }

    /**
     * @return duration the car has been parking
     */
    @Override
    public int getDuration() {
        return duration;
    }

    /**
     * @return price the car has to pay
     */
    @Override
    public int getPrice() {
        return price;
    }

    /**
     * @return ticket for the space of the car
     */
    @Override
    public String getTicket() {
        return ticket;
    }

    /**
     * @return color of the car
     */
    @Override
    public String getColor() {
        return color;
    }

    /**
     * @return category of the car
     */
    @Override
    public String getCategory() {
        return category;
    }

    /**
     * @return parking space number the car has been parking in
     */
    @Override
    public int getSpace() {
        return space;
    }

    /**
     * @return vehicle type of the car
     */
    @Override
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * @return license plate of the car
     */
    @Override
    public int getLicense() {
        return license;
    }

    /**
     * @param end time of the car
     */
    @Override
    public void setEnd(long end) {
        this.end = end;
    }

    /**
     * @param duration the car has been parking
     */
    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * @param price the car has to pay
     */
    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return toString representation of a car
     */
    @Override
    public String toString(){
        return  nr + "/" + begin + "/" +  + duration + "/" + price + "/" + ticket + "/" + color + "/" + space + "/" + category + "/" + vehicleType + "/" + license;
    }
}
