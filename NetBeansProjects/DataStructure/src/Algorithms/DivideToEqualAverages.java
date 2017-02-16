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
public class DivideToEqualAverages
{
    private static void Function(int[] arr){
        int leftsum = 0,rightsum = 0;
        for(int i: arr){
            leftsum += i;
        }
        for(int j=arr.length-1;j>=0;j--){
            rightsum += arr[j];
            leftsum -= arr[j];
            //System.out.println(rightsum +" "+(arr.length-j-1)+" "+leftsum+" "+(j+1));
            if(rightsum*(j+1) == leftsum*(arr.length - j - 1))
                System.out.println("From 0 to "+(arr.length - j)+" and "+(arr.length - j+1)+" to "+(arr.length - 1));
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 5, 7, 2, 0};
        Function(arr);
    }
    
}
