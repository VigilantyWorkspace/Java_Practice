package com.sanTanu.SystemTest;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
Program to find sum of unique elements in given Array?
Input = {1, 6, 4, 3, 2, 2, 3, 8, 1};
Output : 24 
(Unique elements are: 1, 6, 4, 3, 2, 8)

Input= {1, 1, 3, 2, 2, 3};
Output : 6 
(Unique elements are: 1, 2, 3)
*/
public class Assignment_3_UniqueElements_Sum {

    public static void main(String args[]){

        Integer[] numbers = {1, 6, 4, 3, 2, 2, 3, 8, 1};

        int sum = Arrays.stream(numbers).distinct().collect(Collectors.summingInt(Integer::intValue));   
        System.out.println("sum of unique elements in given Array:"+sum);
    }
}
/*
Using Hash Set Method
*/
/*public static void sumOfDistinct_HashSet(int [] arrA) {

        //Create a HashSet of array elements, it will remove all the duplicates
        HashSet<Integer> hashSet = new HashSet<>();
        int sum = 0;
        for (int i = 0; i <arrA.length ; i++) {
            if(!hashSet.contains(arrA[i])){
                sum += arrA[i];
                hashSet.add(arrA[i]);
            }
        }
        System.out.println("Sum of all Unique elements (HashSet Method: " +  sum);
    }

public static void main(String[] args) {
        int [] arrA = {1, 6, 4, 3, 2, 2, 3, 8, 1};
        sumOfDistinct_HashSet(arrA);
    }*/