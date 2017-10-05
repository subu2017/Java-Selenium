package com.learnJava.interfaces;

/**
 * Created by z001qgd on 9/21/17.
 */
public class HeroHonda implements  Bike {

    boolean isStarted;
    int gearNum;
    int speed;

    public boolean isStarted() {
        return isStarted;
    }

    public void setStarted(boolean started) {
        isStarted = started;
    }

    public int getGearNum() {
        return gearNum;
    }

    public void setGearNum(int gearNum) {
        this.gearNum = gearNum;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }



    @Override
    public boolean ignition() {

        if(isStarted)
            return true;
        else
            return false;
    }

    @Override
    public int currentGearNum() {
        return gearNum;
    }

    @Override
    public int speed() {
        return speed;
    }


    public static void main(String[] args) {

        HeroHonda heroHonda = new HeroHonda();
        heroHonda.setGearNum(2);
        heroHonda.setSpeed(30);
        heroHonda.setStarted(true);

        System.out.println("Is Bike Started : " + heroHonda.isStarted());
        System.out.println("Current GearNumber: " + heroHonda.currentGearNum());
        System.out.println("Speed of the Bike : " + heroHonda.speed());


    }

}
