package com.sanTanu.SystemTest;
/*
Write a Java Program to find smallest pair sum in given Array?

Input: arr[] = {1, 7, 2, 9, 6}
Output: 3

The pair (1, 2) will have the minimum sum pair i.e. 1 + 2 = 3
*/
import java.util.*;

class Assignment_10_Find_Smallest_Pair_Sum_In_Array {
    
    public static void main(String args[] ) throws Exception {
        
        Scanner s=new Scanner(System.in);
        
        String a=s.next();
        //int tt=Integer.parseInt(a);
        String[]b=a.split("");
        //System.out.print(b[2]);
        
        int k=Integer.parseInt(b[2]);
        int[]t=new int[k];
        
        for(int i=0;i<k;i++){
            t[i]=s.nextInt();
        }

        Arrays.sort(t);
        
        System.out.print(t[0]+t[1]);
    
    }
}