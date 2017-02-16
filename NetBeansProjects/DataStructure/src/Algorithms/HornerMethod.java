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
public class HornerMethod
{
    private static int Function(int[] arr, int x){
        int result = arr[0];
        for(int i=1;i<arr.length;i++){
            result = result * x + arr[i];
        }
        return result;
    }
    
    public static void main(String[] args){
        int[] arr = new int[]{2,-6,2,-1};
        int x = 3;
        System.out.println(Function(arr, x));
    }
    
}
