package com.newproject.datastructure;

public class TwoDimensionArray {
    public static void main(String[] args) {

        int[][] a1=new int [][]{ {1,2,3},{7,5,6},{8,5,6,7,}};
        System.out.println(a1.length);
        System.out.println(a1[0].length);
        System.out.println(a1[2].length);
        System.out.println(a1[2][0]);
        for (int i=0; i<a1.length; i++){
            for (int j=0; j<a1[i].length; j++){
                System.out.print(a1[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
