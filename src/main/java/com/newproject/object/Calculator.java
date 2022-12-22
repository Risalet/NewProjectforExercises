package com.newproject.object;

import org.apache.commons.lang3.StringUtils;

public class Calculator {
    public long addTwoNumbers(long i1, long i2) {
        long sum = i1 + i2;
        System.out.printf(String.format("%d + %d =%d \n", i1, i2, sum));
        return sum;
    }

    public int addTwoNumbers(int i1, int i2) {
        int sum = i1 + i2;
        System.out.printf("%d + %d =%d \n%n", i1, i2, sum);
        return sum;
    }

    //overLoading
    public long addTwoNumbers(String s1, String s2) {
        if (StringUtils.isNumeric(s1) && StringUtils.isNumeric(s2)){
            long sum=Long.parseLong(s1)+Long.parseLong(s2);
            System.out.printf("%d + %d = %d \n%n",s1,s2,sum);
            return sum;
        }else{
            System.out.println("Please provide numeric String ");
            return 0;
        }
    }

    public long addMultipleNumbers (long... numbers){
        long total =0;
        for (long eachNumber: numbers){
            total=total+eachNumber;
        }
        System.out.println("Total Sum : "+ total);
        return total;
    }

    public long subtractTwoNumber(long l1,long l2){
        long surplus=l1-l2;
        System.out.printf("%d -  %d = %d%n",l1,l2,surplus);
        return surplus;
    }

    public double divideTwoNumbers(double l1,double l2){
        if (l2==0){
            System.out.println("You can not divide a number by zero");
            return 0;
        }else{
            double result=l1/l2;
            System.out.printf("%.2f / %.2f =%.2f \n%n", l1, l2, result);
            return result;
        }
    }

    public long multiplyTwoNumber(long l1,long l2){
        long z=l1*l2;
        System.out.printf("%d * %d = %d%n",l1,l2,z);
        return z;


    }
}

