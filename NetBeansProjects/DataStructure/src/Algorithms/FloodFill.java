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
public class FloodFill
{
    static int r = 0;
    public static boolean floodfill(int arr[][],int row,int col,int m,int n)
    {
        if(row < 0)
        {
            return false;
        }
        if(col < 0)
        {
            return false;
        }
        if(row > m-1)
        {
            return false;
        }
        if(col > n-1)
        {
            return false;
        }
        if(arr[row][col] == 1)
        {
            return false;
        }
        if(arr[row][col] == 0)
        {
            arr[row][col] = 1;
            floodfill(arr, row+1, col, m, n);
            floodfill(arr, row, col+1, m, n);
            floodfill(arr, row-1, col, m, n);
            floodfill(arr, row, col-1, m, n);
            
        }
        
        return true;
    }
    public static void main(String[] args)
    {
        int arr[][] = new int[5][5];
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                arr[i][j] = 0;
            }
        }
        arr[1][1] = 6;
        arr[0][1] = 6;
        arr[1][0] = 6;
        for (int i = 0; i < 5; i++)
        {
            int r = 0;
            for(int j=0;j<5;j++)
            floodfill(arr,i,j,5,5);
        }
        
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
        System.out.println(r);
    }
}
