package de.hbrs.team89.se1_starter_repo;

public interface StatsIF {

    //income stats
    double income_per_minute( int price_sum );
    double income_per_hour ( int price_sum );
    double income_per_day ( int price_sum );

    //duration stats
    long duration_sum( long duration );
    long average_duration_mins(long duration, int count);
    String chartJson(String[] xLabel,int[] yData);


}
