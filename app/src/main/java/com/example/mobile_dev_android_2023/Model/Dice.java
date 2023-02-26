package com.example.mobile_dev_android_2023.Model;

import java.util.Random;

public class Dice {


    private int numSides;

    public Dice(int numSides)
    {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }


    public int roll()
    {
        return (new Random()).nextInt(this.numSides) + 1;
    }
}
