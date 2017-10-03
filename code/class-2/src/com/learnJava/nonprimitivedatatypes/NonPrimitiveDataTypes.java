package com.learnJava.nonprimitivedatatypes;

/**
 * Created by z001qgd on 9/20/17.
 */
public class NonPrimitiveDataTypes {

    public static void main(String[] args) {

        //Different ways of creating a String Object.
        //Approach1
        String str = "Hello World";

        //Approach2
        String str1 = new String("Hello World");

        //Approach 3
        String str2 = new String();

        str2="Hello";

        
        //How to chceck size of the String.
        System.out.println("Length of the String is :" + str.length());

        //How to add concat strings
        System.out.println("New String is : " + str.concat(" How are you ?"));

        //How to compare two strings
        System.out.println("Two Strings are Equal : " + str.equals(str1));
        System.out.println("Two Strings are not Equal : " + str.equals(str2));

        //How to replace a character in a string.
        System.out.println("New Replaced String is : " + str.replace("o","t"));

        //How to check whether the string is empty
        System.out.println(str.isEmpty());

    }
}
