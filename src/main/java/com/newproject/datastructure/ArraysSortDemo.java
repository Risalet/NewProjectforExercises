package com.newproject.datastructure;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSortDemo {
    public static void main(String[] args) {
        int[] array = {20, 40, 29, 89, 2,};
        int[]array1 ={30,50,40,78,5,20,};
        int[]array2 ={36,98,78,38,12};
        //sort small to big
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println();
        // sort big to small
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        //Compare to two arrays
        boolean b= Arrays.equals(array1,array2);
        System.out.println(b);

        //Change all arrays value;
        Arrays.fill(array1,108);
        System.out.println(Arrays.toString(array1));










    }


}


