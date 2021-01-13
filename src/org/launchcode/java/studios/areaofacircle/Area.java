package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args){
        final double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius = input.nextDouble();
        //System.out.println("The are of circle of radius " + radius + " is:" + (pi*radius*radius)  );
        System.out.println("The are of circle of radius " + radius + " is:" + Circle.getArea(radius)  );

    }
}
