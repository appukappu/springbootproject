package com.neotric.student.controller;

public class StaticArray {
    public  static void main(String[]arr) {
        int[] StaticArray = {1, 2, 3, 4, 5};
        int temp = 0;
        int[] StaticArrays = new int[5];
        StaticArrays[0] = 1;
        StaticArrays[1] = 2;
        StaticArrays[2] = 3;
        StaticArrays[3] = 4;
        StaticArrays[4] = 5;
        for (int i = 0; i < StaticArray.length; i++) {
            System.out.println(StaticArray[i] + " ");
        }
        for (int i = 0; i < StaticArrays.length; i++) {
            System.out.println(StaticArrays[i] + " ");
        }
    }
    }


