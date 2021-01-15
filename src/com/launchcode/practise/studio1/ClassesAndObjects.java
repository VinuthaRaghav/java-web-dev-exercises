package com.launchcode.practise.studio1;

public class ClassesAndObjects {

     int firstNumber=20;
    public int secondNumber = 30;
    public int result;

     void sumOfNumbers(int firstNumber, int secondNumber){
       this.firstNumber = firstNumber;
       this.secondNumber = secondNumber;
       System.out.println("The sum of two numbers is :" + (this.firstNumber + this.secondNumber));

    }

    private void sample(){
        this.sumOfNumbers(10,20);
    }


}
