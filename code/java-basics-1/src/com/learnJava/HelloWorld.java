package com.learnJava;

/**
 * Created by z001qgd on 9/24/17.
 */
public class HelloWorld {

    String str = "Hello World From String Variable;";


    public void main1(){
        String str = "Hello World From String Variable;";

        System.out.println("HelloWorld Inside main 1");

        System.out.println(str);
    }

    private void main2(){


        System.out.println("Inside main 2");

        System.out.println(str);
    }

    public static void main(String[] args) {

        System.out.println("Hello World");

        HelloWorld xyz = new HelloWorld(); // Creating an instance
        //xyz is called instance variable.
        xyz.main1();
        xyz.main2();


        HelloWorld xyz1 = new HelloWorld();
        xyz1.main1();
        xyz1.main2();

        System.out.println("Dilip Property is : " + System.getProperty("Dilip","data"));
    }
}
