package com.cgm.internship.week1day5;

import Jama.Matrix;

public class Tests {
    public static void main(String[] args) {
        Assignments assg = new Assignments();
//        Assignments.readFile("src/matrix1.txt");
//        Assignments.readFile("src/matrix2.txt");
        //System.out.println(Assignments.getMatrixFromFile());
       //System.out.println(assg.getMatrixFromFile("src/matrix1.txt"));
        Matrix matrix1 = new Matrix(assg.getMatrixFromFile("src/matrix1.txt"));
        Matrix matrix2 = new Matrix(assg.getMatrixFromFile("src/matrix1.txt"));
        Matrix matrix3 = new Matrix(assg.getMatrixFromFile("src/matrix3.txt"));
        matrix1.plus(matrix3).getArray();
        double [][]blabla = (matrix1.plus(matrix3).getArray());


    }
}
