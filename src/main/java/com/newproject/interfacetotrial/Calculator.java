package com.newproject.interfacetotrial;

public class Calculator implements StandardCalculator ,ScientificCalculator{


    @Override
    public double addTwoNumbers(double a, double b) {
        double sum=a+b;
        System.out.printf("%.2f + %.2f= %.2f%n",a,b,sum);
        return sum;
    }

    @Override
    public int multiplyTwoNumbers(int i1, int i2) {
        int result=i1*12;
        System.out.printf("%d + %d= %d%n",i1,i2,result);
        return result;
    }

    @Override
    public long subtractTwoNumbers(long l1, long l2) {
        System.out.printf("%d - %d= %d%n",l1,l2,l1-l2);
        return l1-l2;
    }

    @Override
    public double dividedTwoNumbers(double d1, double d2) {
        if (d2!=0){
            float result=(float) (d1/d2);
            System.out.printf("%.2f divided by %.2f is %.2f%n",d1,d2,result);
            return result;
        }else{
            System.out.println("You denominator is zero");
            return 0;
        }
    }

    @Override
    public double calculatorPower(int base, int power) {
        double p=Math.pow(base,power);
        System.out.printf("%d to the power of %d = %.2f%n",base,power,p);
        return p;
    }

    @Override
    public double calculatorSquareRoot(long l1) {
        double sr=Math.sqrt(l1);
        System.out.printf("Square root of %d is %.2f%n",l1,sr);
        return sr;
    }

    @Override
    public double calculatorAbsoluteValue(int i1) {
        System.out.printf("Absolute vale of %d is %d%n",i1,Math.abs(i1));
        return Math.abs(i1);
    }

    @Override
    public void printInformation(String info) {
        System.out.println(info);

    }
}
