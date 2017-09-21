package com.learnJava.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by z001qgd on 9/21/17.
 */
public class Exceptions {

    public static void main(String[] args) {

        String str = null;

        //System.out.println("Length of the String : "+ str.length());

        try{
            System.out.println("Length of the String : "+ str.length());
        }catch (NullPointerException e){
            System.out.println("Gracefully Handling the exception :  " + e);
        }

        str = "Hello World";

        System.out.println("Length of the String : "+ str.length());

        checkedException();

    }

    private static void checkedException() {
        try{


        FileReader file = new FileReader("a.txt");
        BufferedReader fileInput = new BufferedReader(file);

        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());

        fileInput.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("Exception in FileNotFoundException");
        } catch (IOException e) {
            System.out.println("Exception in IOException");
            e.printStackTrace();
        }


    }
}
