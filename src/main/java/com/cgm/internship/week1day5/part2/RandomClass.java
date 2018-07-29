package com.cgm.internship.week1day5.part2;

public class RandomClass {
    public static void method(){
        try {
            ClassOne.method1();
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by 0!");
        }
    }
}

class ClassOne{
    public static void method1(){
        try {
            ClassTwo.method2();
        }
        catch (NumberFormatException e){
            System.out.println("Exception in method 1!");
        }
    }
}

class ClassTwo{
    public static void method2(){
        try{
            ClassThree.method3();
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Exception in method 2!");
        }
    }
}

class ClassThree{
    public static void method3(){
        try {
            ClassFour.divide(10,0);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception in method 3!");
        }
    }
}

class ClassFour{
    public static void divide(int a, int b){
        int c;
        try {
            c=a/b;
        }
        catch (NullPointerException e){
            System.out.println("Exception in method 4!");
        }
    }
}

class ClassFive {
    public static void verify(int age) throws CustomException{
        if(age<18){
            throw new CustomException("You are not allowed to drive!");
        }
        else {System.out.println("Drive safe!");}
    }
}


class CustomException extends Exception{

    public CustomException(String s) {
        super(s);
    }
}
