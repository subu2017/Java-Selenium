package com.learnJava.oops;

/**
 * Created by z001qgd on 10/7/17.
 */
public class Sample {

    public static void main(String[] args) {

        Pen mishraPen = new Pen();
        mishraPen.bodyType = "PushPen";
        mishraPen.lenght=5;
        mishraPen.color="black";
        mishraPen.owner="SubbuMishra";

        System.out.println(mishraPen.owner + " Pen Properties are : " + mishraPen.bodyType +" ," + mishraPen.lenght +" , "+ mishraPen.color);

        Pen dilipPen=new Pen();
        dilipPen.color="blue";
        dilipPen.lenght=2;
        dilipPen.bodyType="normal";
        dilipPen.owner="Dilip";

        System.out.println(dilipPen.owner  +" Pen Properties are : " + dilipPen.bodyType +" ," + dilipPen.lenght +" , "+ dilipPen.color);

    }
}
