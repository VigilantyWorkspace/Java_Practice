package com.sanTanu.SystemTest;
/*
 * Program to find duplicate elements in given Array
 * Input:  1, 2, 5, 5, 6, 6, 7, 2
 * Output:  2, 5, 6
 * */
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment_1_DuplicateElements {
	
	public static void main(String[] args) {


		int arr[] = {1, 2, 5, 5, 6, 6, 7, 2};

		/**
		 * Using Java HashMap
		 */

		Map<Integer, Integer> arrMap = new HashMap<>();

		//Traverse an array 
		for(int i = 0; i < arr.length; i++) {
			/*
	              if element exists in a	map, then increment it's count by 1,
	              otherwise assigned a value 1
			 */ 
			if(arrMap.containsKey(arr[i])) {
				arrMap.put(arr[i], arrMap.get(arr[i]) + 1);
			} else {
				arrMap.put(arr[i], 1);
			}
		}

		Set<Entry<Integer, Integer>> entry = arrMap.entrySet();

		/*
		 *Traverse the map, If any key has value greater than 1
		 *It means, it is duplicate element in an array
		 */ 
		System.out.println("Assignment_1_DuplicateElements are:");
		for(Entry<Integer, Integer> ent: entry) {

			if(ent.getValue() > 1) {
				System.out.println(ent.getKey());
			}
		}
	}
}
