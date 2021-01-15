package com.launchcode.practise.studio1;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double pi =3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of a circle");
        double radius = input.nextDouble();
        /*System.out.println("circle area of" + radius +"is" +3.14*radius*radius);*/
         System.out.println("circle area of" + radius + "is" + Circle.getArea(radius));





    }
}
