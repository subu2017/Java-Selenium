package com.learnJava.abstracts;

/**
 * Created by z001qgd on 9/21/17.
 */
public class Samsung extends TV {

    @Override
    public void powerButton() {

    }

    @Override
    public void volumeButton() {

    }

    @Override
    public int tvSize() {
        return 0;
    }

    public static void main(String[] args) {

        Samsung samsumg = new Samsung();

        System.out.println("Screen Display : " + samsumg.screenDisplay()); //Inheritance


    }


}
