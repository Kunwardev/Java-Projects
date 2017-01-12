/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

/**
 *
 * @author Kunwar
 */
public class PrintAllCombinations
{
    static int arr[] = new int[100];
    public static void printCompositions(int n,int i)
    {
        if(n == 0)
            printArray(arr,i);
        else if(n > 0)
        {
            int k;
            for(k = 1;k<= 3;k++) // 3 is the combination of points that u want
            {
                arr[i] = k;
                printCompositions(n-k, i+1);
            }
        }
    }
    
    public static void printArray(int arr[],int i)
    {
        for(int j=0;j<i;j++)
            System.out.print(arr[j]+" ");
        System.out.println("");
    }
    
    public static void main(String[] args)
    {
        printCompositions(6, 0);
    }
    
}
