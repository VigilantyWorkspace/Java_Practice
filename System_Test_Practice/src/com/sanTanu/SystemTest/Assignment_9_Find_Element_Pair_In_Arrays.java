package com.sanTanu.SystemTest;
/*
Write a Java program to find element Pairs in given Array whose sum is equal to given number

	Input Array :  {3, 6, 8, -8, 10, 8 } 
	Sum : 16
	Output :  Pairs with sum 16 are (6, 10) and (8, 8)
*/
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Assignment_9_Find_Element_Pair_In_Arrays {

    public static void main(String args[]) {
       SearchPair( new int[]{ 3, 6, 8, -8, 10, 8}, 16);
       
    }

    public static void findPairsUsingSet(int[] numbers, int n){
        if(numbers.length < 2){
            return;
        }        
        Set set = new HashSet(numbers.length);
        
        for(int value : numbers){
            int target = n - value;
            
            // if target number is not in set then add
            if(!set.contains(target)){
                set.add(value);
            }else {
                System.out.printf("(%d, %d) %n", value, target);
            }
        }
    }
    
    /*
     * find two elements in an array that sum to k i.e the given number.
     */
    public static void SearchPair(int[] arr, int k){
        System.out.println("Entered Integer array : " + Arrays.toString(arr));
        System.out.println("Sum : " + k);
        System.out.println("pair of numbers from an array whose sum equals "
                                     + k);
        findPairsUsingSet(arr, k);
    }
    
    
}



