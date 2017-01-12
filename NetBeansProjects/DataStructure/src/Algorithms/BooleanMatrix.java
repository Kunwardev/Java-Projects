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
public class BooleanMatrix
{
    public static void FIll(int mat[][],int n,int m)
    {
        int row[] = new int[n];
        int col[] = new int[m];
        Arrays.fill(row,0);
        Arrays.fill(col,0);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j] == 1)
                {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(row[i] == 1 || col[j] == 1)
                    mat[i][j] = 1;}
        }
    }
    
    public static void main(String[] args)
    {
        int mat[][] = new int[][]{{0,0,0,1,0}
                                 ,{1,0,0,0,0}
                                 ,{0,0,0,0,0},
                                  {0,1,0,0,0}};
        FIll(mat, 4, 5);
        for(int j=0;j<4;j++)
        {
            for(int k=0;k<5;k++)
                System.out.print(mat[j][k]+" ");
            System.out.println("");
        }
    }
    
}
