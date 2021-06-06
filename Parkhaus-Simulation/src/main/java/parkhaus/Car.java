package parkhaus;

import java.util.Arrays;

// ToDo replace 0 by correct values read from this.params
public class Car implements CarIF {

    private int nr;
    private long begin;
    private long end;
    private int duration;
    private int price;
    private String category;

    public Car(int nr, long begin, String category){
        this.nr = nr;
        this.begin = begin;
        this.end = 0;
        this.duration = 0;
        this.price = 0;
        this.category = category;
    }

    @Override
    public int getNr() {
        return nr;
    }

    @Override
    public long getBegin() {
        return begin;
    }

    @Override
    public long getEnd() {
        return end;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public void setEnd(long end) {
        this.end = end;
    }

    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return  nr + ", " + begin + ", " + end + ", " + duration + ", " + price + ", " + category;
    }
}