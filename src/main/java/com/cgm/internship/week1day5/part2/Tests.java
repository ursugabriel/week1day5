package com.cgm.internship.week1day5.part2;

public class Tests {
    public static void main(String[] args) {

        RandomClass.method();
        try {
            ClassFive.verify(2);
        }
        catch (Exception e) {
            System.out.println(e);
        }


    }
}
