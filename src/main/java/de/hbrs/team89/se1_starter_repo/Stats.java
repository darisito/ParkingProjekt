package de.hbrs.team89.se1_starter_repo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
import java.util.OptionalDouble;


public class Stats implements StatsIF {

    private static Stats instance = null;

    //UNDO/inverse  HINZUFÜGEN
    //in servlet mit OBJEKT machen

    private double minute_income;
    private double hourly_income;
    private double daily_income;

    //ToDo wie viele autos reinkommen

    //private double carprice_sum;

    public long duration_sum;      //the summed up parking duration of all cars
    public long average_duration;  //the average duration that a car parks


    //constructor
    private Stats() {
    }

    //Singleton
    public static Stats getInstance(){
        if(instance == null){
            instance = new Stats();
        }
        return instance;
    }

    public int calculate_sum ( List<CarIF> cars) {
        int sum = cars.stream()
                .mapToInt( c -> c.getPrice())
                .sum();

        return sum;
    }

    public long total_cars ( List<CarIF> cars) {
        long total_cars = cars.stream()
                .filter (c -> c.getDuration() != 0)
                .count();
        return total_cars;
    }

    public long total_cars_in ( List<CarIF> cars) {
        long total_cars = cars.stream()
                .count();
        return total_cars;
    }

    //income related
    /**
     * @return the income per minute received so far
     */
    public double income_per_minute( int price_sum) {
        price_sum /= 60;
        minute_income = price_sum;

        return price_sum;
    }

    /**
     * @return the income per hour received so far
     */
    public double income_per_hour ( int price_sum) {
        price_sum /= 600;
        hourly_income = price_sum;

        return price_sum;
    }

    /**
     * @return the income per day received so far
     */
    public double income_per_day ( int price_sum) {
        price_sum /= (600+60*24);
        hourly_income = price_sum;

        return price_sum;
    }



    //duration related
    /**
     * @return the duration stats of all cars that have come and left
     */
    public long duration_sum(long duration) {
        duration_sum += duration;
        return duration_sum;
    }

    /**
     * @return the average parking time of the cars that have come and left
     */
    public long average_duration_mins(long duration, int count) {
        average_duration = duration_sum / count;


        average_duration = average_duration / 60;

        return average_duration;
    }

    //amount of cars which price is lower than 100
    public int get_car_count_less_than_100 ( List<CarIF> cars ){

        long count = cars.stream()
                .filter(car -> car.getPrice() <= 100)
                .count();

        return (int) count;
    }

    //zwischen 100 und 1000
    public int get_car_count_inbetween ( List<CarIF> cars ){

        long count = cars.stream()
                .filter(car -> car.getPrice() > 100 && car.getPrice() <= 1000)
                .count();

        return (int) count;
    }

    public int get_car_count_higherthan_1000 ( List<CarIF> cars ){

        long count = cars.stream()
                .filter(car -> car.getPrice() > 1000)
                .count();

        return (int) count;
    }

    public String[] getXDataPriceDistribution(){

        String[] xData = {"1-100", "100-1000", ">1000"};
        return xData;

    }

    public double average_car_amount ( List<CarIF> cars) {

        double average = cars.stream()
                .mapToDouble (car -> car.getPrice() )
                .reduce( 0, (a,b) -> a+b) / cars.size() ;

        return average;

    }


    public int[] getYDataPriceDistribution( List<CarIF> cars){

        int[] yData = { get_car_count_less_than_100(cars),
                        get_car_count_inbetween(cars),
                        get_car_count_higherthan_1000(cars) };

        return yData;
    }



    /**
     * @return returns the string in Json format for chart creation
     */
    public String chartJson( String[] xLabel, int[] yData){
        String chartStr= "{\n" +
                "  \"data\": [\n" +
                "    {\n" +
                "      \"x\": [\n" ;
        for(int i=0; i<xLabel.length; i++){
            if(i==xLabel.length-1){
                chartStr +=
                        "        \"" + xLabel[i] + "\"\n";
            }
            else {
                chartStr +=
                        "        \"" + xLabel[i] + "\",\n";
            }
        }

        chartStr+="      ],\n" +
                "      \"y\": [\n" ;
        for(int i=0; i<yData.length; i++){
            if(i==yData.length-1){
                chartStr += "        " + yData[i] + "\n";
            }else {
                chartStr += "        " + yData[i] + ",\n";
            }
        }
        chartStr+=
                "      ],\n" +
                        "      \"type\": \"bar\"\n" +
                        "    }\n" +
                        "  ]\n" +
                        "}";
        return chartStr;
    }

}


