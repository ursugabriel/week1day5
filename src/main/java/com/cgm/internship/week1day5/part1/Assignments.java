package com.cgm.internship.week1day5.part1;

import java.io.*;

import java.util.Scanner;

public class Assignments {

    public static void readFile(String fl){
        try(BufferedReader br = new BufferedReader(new FileReader((new File(fl))))){
            String line;
            System.out.println("The matrix is: ");
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            System.out.println();
        }
        catch (FileNotFoundException e){
            System.out.println("File "+fl+" not found!");
        }
        catch (IOException e){
            System.out.println("Reading error!");

        }
    }

    public static double [][] getMatrixFromFile(String fl){
        int rows=0;
        int col=0;
        try(Scanner scanner =new Scanner(new File(fl))){
            while(scanner.hasNextLine()){
                rows++;
                Scanner scanLine = new Scanner(scanner.nextLine());
                while(scanLine.hasNextDouble()){
                    col++;
                    scanLine.nextDouble();
                     }}
            col=col/rows;
        }
        catch (FileNotFoundException e){
            System.out.println("File "+fl+" not found!");
        }

        double [][] newMatrix=new double[rows][col];

        try(Scanner scanner =new Scanner(new File(fl))){
            for(int i=0;i<rows;i++){
                for(int j=0;j<col;j++){
                    newMatrix[i][j]=scanner.nextDouble();
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File "+fl+" not found!");
        }
        return newMatrix;
    }

    public static void printResult(double [][] matrix, String fl){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fl,true))){
            bufferedWriter.write("Results:");
            bufferedWriter.newLine();
            for(int i =0; i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    bufferedWriter.write((int)(matrix[i][j])+" ");
                }
                bufferedWriter.newLine();
            }
            bufferedWriter.newLine();
            bufferedWriter.write("");
            bufferedWriter.flush();
            System.out.println("Writing done!");
        }
        catch (FileNotFoundException e){
            System.out.println("File "+fl+" not found!");
        }
        catch (IOException e){
            System.out.println("Reading error!");

        }
    }
}
