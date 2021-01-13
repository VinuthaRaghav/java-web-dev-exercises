package com.launchcode.practise;

public class ContinueStatement {

    public static void main(String[] args) {
        int[] a = {5, 8, 9, 32, 45, 76, 87, 34, 12};
        int evenNumber = 0;
        int oddNumber =0;
        for(int b: a){

            if(((b % 2) == 0)){
                evenNumber = evenNumber +1;
                continue;
            }

            oddNumber = oddNumber +1 ;

        }

        System.out.println("Total Even Numbers:" + evenNumber);
        System.out.println("Total Odd Numbers:" + oddNumber);

    }
}
