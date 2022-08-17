package com.newproject.loops;

public class ForLoop2 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i < 10; i++) {
            sum += i;
            System.out.printf("i=%d sum=%d\n", i, sum);
        }
        System.out.println(sum);

        int sum1 = 0;
        for (int i = 10; i >1; i--) {
            sum1-=i;
            System.out.printf("i=%d,sum1=%d\n",i,sum1);
        }
        System.out.println(sum1);

        int i1=0;
        for(i1=1;i1<10;i1++){
            if(i1>6) {
                break;
            }
                System.out.println(i1);
            }
        System.out.println(i1);

        int evenNumberCounts=0;
        for (int i=10; i>0; i--){
            if (i % 2 == 0) {
                evenNumberCounts++;
            }
        }
        System.out.println("Total even number is :" +evenNumberCounts);
    }
}
