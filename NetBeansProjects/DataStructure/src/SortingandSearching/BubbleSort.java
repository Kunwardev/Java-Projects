/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SortingandSearching;

/**
 *
 * @author Kunwar
 */
public class BubbleSort
{
    public static void Bubble(int arr[])
    {
           for(int i=0;i<arr.length;i++)
           {
               for(int j=0;j<arr.length-i-1;j++)
               {
                   if(arr[j] > arr[j+1])
                   {
                       int tem = arr[j];
                       arr[j] = arr[j+1];
                       arr[j+1] = tem;
                   }
               }
           }
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{3,7,1,2,8,9,12};
        Bubble(arr);
        for(int j : arr)
            System.out.print(j+" ");
    }
    
}
