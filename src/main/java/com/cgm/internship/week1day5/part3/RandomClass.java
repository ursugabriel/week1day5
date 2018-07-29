package com.cgm.internship.week1day5.part3;

import java.io.Serializable;

public class RandomClass {



    public void printName(String name){
        System.out.println("The name is :"+name);
    }

    public static void divide(int a, int b){
        int c;
        try {
            c=a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by 0!");
        }
    }

    public static void fromStringToInt(String a){
        try {
            int b=Integer.parseInt(a);
            System.out.println("New number is :"+b);
        }
        catch (NumberFormatException e){
            System.out.println("The number you try to parse is not in the integer format range!");

        }
    }
}
