package com.newproject.execrises;

public class Loop {
    public static void main(String[] args) {
        for (int i=0; i<=10; i++){
            System.out.print(i + " ");

        }

        int sum =0;
        for (int i=0; i<=10; i++){
            sum+=i;
        }
        System.out.println(sum);

        for (int i=1; i<=10; i++){
            if (i%2==0){
                System.out.print(i + " ");
            }
        }

        System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");


        System.out.print("Even Numbers are:  ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("99999999999999999999999999999999999999999999999");

        int[][][] arr = { { { 1,  4}, { 3, 2} }, { { 7, 6 }, { 5, 8 } } };

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int z = 0; z < 2; z++)
                    System.out.println("arr[" + i
                            + "]["
                            + j + "]["
                            + z + "] = "
                            + arr[i][j][z]);

    }
}

