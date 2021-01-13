package com.launchcode.practise;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int i = input.nextInt();

        int temp = 0;

        while(temp < i){
            System.out.println(temp);
            temp = temp + 1;
        }
        temp = 0;
        System.out.println("Do ...... While");
        do{
            System.out.println(temp);
            temp = temp + 1;
        }while(temp < i);


    }
}
