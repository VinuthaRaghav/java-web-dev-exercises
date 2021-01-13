package org.launchcode.java.demos.lsn1datatypes;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {


        String a= "100\nunnam ";
        Scanner obj = new Scanner(a);
        System.out.println("Is value availble in scanner object: " + obj.hasNextInt());
        System.out.println("The value in object is:" + obj.next()) ;
        System.out.println("Is value availble in scanner object: " + obj.hasNext());
        System.out.println("The value in object is:" + obj.nextDouble()) ;
        System.out.println("Is value availble in scanner object: " + obj.hasNext());
        /* fahrenheit;

        Scanner input;
        double celsius;
        input = new Scanner(System.in);

       // System.out.println(input.hasNext());
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        //System.out.println(input.hasNextInt());
        input.close();

        //fahrenheit = input.next()

        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C"); */








    }
}
