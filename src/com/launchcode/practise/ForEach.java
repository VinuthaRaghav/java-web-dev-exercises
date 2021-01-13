package com.launchcode.practise;

public class ForEach {

    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8};

        for(int arrayItem: a ){
            System.out.println(arrayItem);
        }

        String b = "Raghavendra Rao Unnam";
        char[] cArray = b.toCharArray();

        for(char c: cArray){
            System.out.println(c);
        }


    }
}
