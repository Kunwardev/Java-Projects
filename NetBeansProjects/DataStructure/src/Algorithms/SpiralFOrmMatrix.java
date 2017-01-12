/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;
import java.util.ArrayList;
/**
 *
 * @author Kunwar
 */
public class SpiralFOrmMatrix
{
    public static ArrayList<Integer> function(int arr[][],int n,int m)
    {
        ArrayList<Integer> al = new ArrayList<>();
        int i, k = 0,l = 0;

        while(k < n && l < m)
        {
            for(i=l;i<m;i++)
            {
                al.add(arr[k][i]);
            }k++;
            for(i=k;i<n;i++)
            {
                al.add(arr[i][n-1]);
            }n--;
            if(k < m)
            {for(i=n-1;i>=l;i--)
            {
                al.add(arr[m-1][i]);
            }m--;
            }
            if(l < n)
            {
                for(i=m-1;i>=k;i--)
            {
                al.add(arr[i][l]);    
            }l++;
            }
        }
        return al;
    }
    public static void main(String[] args)
    {
        int arr[][] = new int[][]{{1,2,3,4,17},{5,6,7,8,18},{9,10,11,12,19},{13,14,15,16,20}};
        ArrayList<Integer> al = function(arr, 4, 4);
            System.out.print(al);
    }
}
