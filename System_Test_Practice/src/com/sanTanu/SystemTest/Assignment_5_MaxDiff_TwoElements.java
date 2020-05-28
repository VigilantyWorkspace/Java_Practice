package com.sanTanu.SystemTest;
/*
program to find maximum difference between two elements in given Array?
Input = { 2, 5, 1, 7, 3, 9, 5}
Output = 8  

Explanation : The maximum difference is between 1 and 9

Input = { 9, 2, 12, 5, 4, 7, 3, 19, 5}
Output: 17

Explanation : The maximum difference is between 19 and 2
 */
public class Assignment_5_MaxDiff_TwoElements {

	public static int findMaxDiff(int arr[]) {

		int maxDiff = arr[1] - arr[0];
		int minEle = arr[0];

		for(int i = 1; i < arr.length; i++) { 
			if((arr[i] - minEle) > maxDiff) {
				maxDiff = arr[i] - minEle;
			}

			if(arr[i] < minEle) {
				minEle = arr[i];
			}
		}

		return maxDiff;
	}

	public static void main(String[] args) {

		int arr[] = {9, 2, 12, 5, 4, 7, 3, 19, 5};


		System.out.println(findMaxDiff(arr));
	}
}