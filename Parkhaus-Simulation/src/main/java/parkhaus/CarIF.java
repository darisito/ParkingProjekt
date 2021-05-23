package parkhaus;

 interface CarIF {
    int getNr();
    long getBegin();
    long getEnd();
    int getDuration();
    int getPrice();

    void setEnd(long end);
    void setDuration(int duration);
    void setPrice(int price);
}