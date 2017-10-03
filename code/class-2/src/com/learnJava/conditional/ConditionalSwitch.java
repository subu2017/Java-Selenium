package com.learnJava.conditional;

/**
 * Created by z001qgd on 9/20/17.
 */
public class ConditionalSwitch {

    public static void main(String[] args) {

        ConditionalSwitch conditionalSwitch = new ConditionalSwitch();
        conditionalSwitch.check(1);
        conditionalSwitch.check(2);
        conditionalSwitch.check(3);
        conditionalSwitch.check(1);
    }

    private void check(int i) {

        switch(i){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            default:
                System.out.println("NOT A VALID NUMBER");
                break;
        }

    }
}
