/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class SearchRowColumnWise
{
    public static int[] Search(int mat[][],int x)
    {
        int arr[] = new int[2];
        Arrays.fill(arr,-1);
        int n = mat.length;
        int i=0,j=n-1;
        while(i<n && j>=0)
        {
            if(mat[i][j] == x)
            {
                arr[0] = i;
                arr[1] = j;
                break;
            }
            else if(mat[i][j] > x)
            {
                j--;
            }
            else
                i++;
            //System.out.println(i+" "+j);
        }
        return arr;
    }
    
    public static void main(String[] args)
    {
        int mat[][] = new int[][]{ {10, 20, 30, 40},
                                   {15, 25, 35, 45},
                                   {27, 29, 37, 48},
                                   {32, 33, 39, 50},
                  };
        int arr[] = Search(mat, 35);
        for(int k: arr)
            System.out.print(k+" ");
    }
    
}
