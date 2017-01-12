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
public class JollyJumperSequence
{
    public static boolean Solution(int arr[])
    {
        int n = arr.length;
        boolean x[] = new boolean[n-1];
        for(int i=1;i<arr.length;i++)
        {
            //System.out.println(Math.abs(arr[i-1]-arr[i]));
            x[Math.abs(arr[i-1]-arr[i])-1] = true;
        }
        for(int j=0;j<n-1;j++)
            if(x[j] == false)
                return false;
        return true;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{11,7,4,2,1,6 };
        if(Solution(arr))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
