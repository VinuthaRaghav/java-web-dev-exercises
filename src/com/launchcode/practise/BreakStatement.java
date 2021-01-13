package com.launchcode.practise;

public class BreakStatement {

    public static void main(String[] args){
        int[] a = {5,8,9,32,45,76,87,34,12};
        int temp = 0;
        for(int b: a){
            temp = temp + 1;
            if(b == 32){
                System.out.println("Number Found");
                break;
            }
        }

        System.out.println(temp);

    }
}
