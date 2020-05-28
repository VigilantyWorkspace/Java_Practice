package com.sanTanu.SystemTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Write a Java Program to remove duplicate elements in given Array?

Input:  1, 2, 5, 5, 6, 6, 7, 2
Output:  1, 2, 5, 6, 7

Remove duplicates using set
 */
public class Assignment_2_RemoveDuplicate {

	public static void removeDuplicateUsingHashing(int arr[]) {

		//Declare a hashmap
		Map<Integer, Integer> map = new HashMap<>();
		int len = arr.length;

		//Traverse an array
		for (int i = 0; i < len - 1; i++) { 
			//If key is already present in a map 
			if (map.containsKey(arr[i])) { 
				//Increment it's count 
				map.put(arr[i], map.get(arr[i]) + 1); 
			} else { 
				/* 
                If it's not present in a map 
                then put a key and it's initial count 1 
				 */ 
				map.put(arr[i], 1); 
			} 
		} 

		//Print Each Key 
		map.forEach((k, v) -> System.out.print(k + " "));
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 5, 5, 6, 6, 7, 2 };

		removeDuplicateUsingHashing(arr);
	}
}