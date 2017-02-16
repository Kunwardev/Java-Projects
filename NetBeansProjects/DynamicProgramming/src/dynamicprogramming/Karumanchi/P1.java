/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynamicprogramming.Karumanchi;

/**
 *
 * @author Kunwar
 */
public class P1
{
    private static int Function(int[] arr,int n){
        
        arr[0] = arr[1] = 2;
        for(int i=2;i<=n;i++){
            arr[i] = 0;
            for(int j=1;j<i;j++)
                arr[i] += 2*arr[j]*arr[j-1];
        }
        return arr[n];
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[11];
        int p = Function(arr, 2);
        System.out.println(p);
    }
    
}
