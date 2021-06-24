package de.hbrs.team89.se1_starter_repo;

public class Stats implements StatsIF {

    //UNDO/inverse  HINZUFÜGEN
    //in servlet mit OBJEKT machen

    private static double minute_income;
    private static double hourly_income;
    private static double daily_income;

    //ToDo wie viele autos reinkommen

    //private double carprice_sum;

    public static long duration_sum;      //the summed up parking duration of all cars
    public static long average_duration;  //the average duration that a car parks


    //constructor
    public Stats() {
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


