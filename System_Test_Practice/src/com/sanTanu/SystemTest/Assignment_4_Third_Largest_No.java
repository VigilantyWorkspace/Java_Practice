package com.sanTanu.SystemTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
program to find third largest number in given Array ?

Input = { 6, 8, 1, 9, 2, 1, 10}
Output: Third largest element : 8

Int [] a = { 6, 8, 1, 9, 2, 1, 10, 12}
Output: Third largest element : 9

Int [] a = {6}
Output: Invalid Input, array size is less than 3
*/
public class Assignment_4_Third_Largest_No {

    public static void main(String[] args) {
        List list = Arrays.asList(new Integer[] {6, 8, 1, 9, 2, 1, 10});
            Collections.sort(list);
            System.out.print("Third largest element:"+list.get(list.size()-3));
   }
        
}