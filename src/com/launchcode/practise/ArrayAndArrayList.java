package com.launchcode.practise;

import java.util.ArrayList;

public class ArrayAndArrayList {

    public static void main(String[] args){

        int[] a = new int[5];
        a[0] = 5;
        a[1]= 7;
        a[2]=3;
        a[3]= 7;
        a[4]= 6;



        for(int c:a){

        }

        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(5);
        aList.add(7);
        aList.add(3);

        for(Integer k:aList){
            System.out.println(k.doubleValue());
        }


    }
}
