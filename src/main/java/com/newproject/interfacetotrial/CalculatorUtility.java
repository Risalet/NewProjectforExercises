package com.newproject.interfacetotrial;

public class CalculatorUtility {
    public static void main(String[] args) {
        StandardCalculator standardCalculator=new Calculator();
        standardCalculator.addTwoNumbers(25.50,25.22);
        standardCalculator.dividedTwoNumbers(50,10);
        standardCalculator.multiplyTwoNumbers(50,50);
        standardCalculator.subtractTwoNumbers(100,100);

        System.out.println(ScientificCalculator.version);
        ScientificCalculator scientificCalculator=new Calculator();
        scientificCalculator.calculatorPower(3,4);
        scientificCalculator.calculatorAbsoluteValue(45);
        scientificCalculator.calculatorSquareRoot(4);
        scientificCalculator.calculatorAbsoluteValue(-90);
        scientificCalculator.printInformation("This is Scientific calculator");



    }

}
