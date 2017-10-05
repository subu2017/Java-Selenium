package com.learnJava.conditional;

/**
 * Created by z001qgd on 9/20/17.
 */
public class ConditionalIf {


    public static void main(String[] args) {

        ConditionalIf conditionalIf = new ConditionalIf();
        System.out.println("value is : " + conditionalIf.checkYesorNo(1));
        System.out.println("value is : " + conditionalIf.checkYesorNo(2));
    }

    private boolean checkYesorNo(int number) {

        if(number == 1){
            return true;
        }else {
            return false;
        }

    }
}
