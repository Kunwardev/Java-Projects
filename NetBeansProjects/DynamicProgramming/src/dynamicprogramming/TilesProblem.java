/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynamicprogramming;

/**
 *
 * @author Kunwar
 */
public class TilesProblem
{
    private static int Function(int n){
        int arr[] = new int[n+1];
        arr[0] = arr[1] = 1;
        for(int i=2;i<=n;i++)
            arr[i] = arr[i-1] + arr[i-2];
        return arr[n];
    }
    
    public static void main(String[] args)
    {
        int n = 3;
        System.out.println(Function(n));
        n = 4;
        System.out.println(Function(n));
    }
    
}
