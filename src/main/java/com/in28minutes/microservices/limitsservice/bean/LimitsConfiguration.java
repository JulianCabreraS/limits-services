package com.in28minutes.microservices.limitsservice.bean;

public class LimitsConfiguration {
    private int maximum;
    private int minimum;


    protected LimitsConfiguration(){

    }
    public LimitsConfiguration(int maximum, int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public int getMinimum() {
        return minimum;
    }
    public int getMaximum() {
        return maximum;
    }



}
