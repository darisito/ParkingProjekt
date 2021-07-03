package de.hbrs.team89.se1_starter_repo;

import java.util.List;

public interface StatsIF {


    //income stats
    double income_per_minute( int price_sum );
    double income_per_hour ( int price_sum );
    double income_per_day ( int price_sum );

    //duration stats

    int calculate_sum ( List<CarIF> cars);
    //long total_cars ( List<CarIF> cars);
    long total_cars_in ( List<CarIF> cars);
    long duration_sum( long duration );
    long average_duration_mins(long duration, int count);
    double average_car_price(List<CarIF> cars);
    String chartJson(String[] xLabel,int[] yData);


}
