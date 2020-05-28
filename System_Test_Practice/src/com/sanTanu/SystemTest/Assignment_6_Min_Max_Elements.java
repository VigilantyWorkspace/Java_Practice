package com.sanTanu.SystemTest;

import java.util.Scanner;

/*
Program to find Min and Max elements in given Array?

Input:  1, 2, 5, 5, 6, 6, 7, 2

Output:   Min : 1  Max : 7
*/
public class Assignment_6_Min_Max_Elements {
 
    public static void main(String[] args) {

        

        int array[] = new int[]{1, 2, 5, 5, 6, 6, 7, 2};

        System.out.println("max Value : " + getMaxValue(array));

        System.out.println("min Value : " + getMinValue(array));

        //end of main
    }


    // getting the maximum value
    public static int getMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    // getting the miniumum value
    public static int getMinValue(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}