package com.launchcode.practise;

import java.util.Scanner;

public class FallThrough {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter day of the number");
        int dayOfNumber = input.nextInt();
        String day;
        switch (dayOfNumber){
            case 0:
                day = "Sunday";
                //break;
            case 1:
                day = "Monday";
               // break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            default:
                day = "Enter day of number 0 to 6";
        }

        System.out.println(day);

    }

}
