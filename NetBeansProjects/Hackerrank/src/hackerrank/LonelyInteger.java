/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackerrank;

import java.io.*;
import java.util.*;

public class LonelyInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int arr[] = new int[N+1];
        for(int k = 0;k<N;k++)
            arr[k] = sc.nextInt();
        arr[N] = 102;
        if(N==1)
            System.out.println(arr[0]);
        else
            {
            int i=0,j,flag=0;
            Arrays.sort(arr);
            for(i=0;i<N+1;i+=2)
            {
                if(arr[i]!=arr[i+1])
                {
                    System.out.println(arr[i]);
                    break;
                }
               
            }
            if(flag == 1)
                    System.out.println(arr[N-1]);
            }
        } 
   
}