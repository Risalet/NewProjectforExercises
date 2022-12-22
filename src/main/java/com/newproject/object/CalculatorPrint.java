package com.newproject.object;

public class CalculatorPrint {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.addTwoNumbers(3,4);
        calculator.addTwoNumbers(1000000000000000L,2);
        calculator.addMultipleNumbers(10,20,30,40,50);
        calculator.addTwoNumbers(23,23);
        calculator.subtractTwoNumber(50,10);
        calculator.divideTwoNumbers(99,33);
        calculator.divideTwoNumbers(33,3);
        calculator.multiplyTwoNumber(2,3);

    }
}
