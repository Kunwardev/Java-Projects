/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSortfirststep {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
        int i=1;
        int V = ar[ar.length-1];
        int j = ar.length-1;
        ar[ar.length-1] = ar[ar.length-2];
        while(true)
            {
            if(V<ar[j])
                {
                printArray(ar);
                j--;
                 if(j==0)
                    {
                    ar[j] = V;
                printArray(ar);
                break;
                }
                ar[j] = ar[j-1];
            }
            else if(i<ar.length && V>ar[j])
                {
                ar[j] = V;
                printArray(ar);
                break;
            }
        }
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
