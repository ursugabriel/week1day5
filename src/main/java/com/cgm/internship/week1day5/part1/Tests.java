package com.cgm.internship.week1day5.part1;


import Jama.Matrix;

public class Tests {
    public static void main(String[] args) {
        Assignments.readFile("src/matrix1.txt");
        Assignments.readFile("src/matrix2.txt");
        Matrix matrix1 = new Matrix(Assignments.getMatrixFromFile("src/matrix1.txt"));
        Matrix matrix2 = new Matrix(Assignments.getMatrixFromFile("src/matrix2.txt"));
        Matrix matrix3 = new Matrix(Assignments.getMatrixFromFile("src/matrix3.txt"));
        Assignments.printResult(matrix1.plus(matrix3).getArray(),"src/results.txt");
        Assignments.printResult(matrix1.times(matrix2).getArray(),"src/results.txt");

    }
}
