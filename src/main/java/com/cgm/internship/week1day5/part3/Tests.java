package com.cgm.internship.week1day5.part3;

import java.io.*;

public class Tests {
    public static void main(String[] args) {

        try {
            RandomClass randomClass = null;
            String name="George";
            randomClass.printName(name);

        }
        catch (NullPointerException e){
            System.out.println("The object must be initialized first!");
        }


        RandomClass.divide(10,0);
        RandomClass.fromStringToInt("2222222222222222222222222222222222222");


        // Serialization
        try {
            RandomClass randomClass = new RandomClass();
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream("src/serialize.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);
            // Method for serialization of object
            out.writeObject(randomClass);
            out.close();
            file.close();
            System.out.println("Object has been serialized");
        }
        catch(NotSerializableException ex) {
            System.out.println("NotSerializableException is caught");
        }

        catch (IOException e){
            System.out.println("IOException!");
            e.printStackTrace();
        }
    }
}
