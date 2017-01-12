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
public class MatrixMultiplication
{
    public static void main(String[] args){
        int ma[][] = new int[][]{{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        int ma2[][] = new int[][]{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int res[][] = new int[][]{{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        for(int i=0;i<4;i++)
        {
            for(int k=0;k<5;k++)
            {
                for(int j=0;j<4;j++)
                {
                    res[i][j] += ma[i][k]*ma2[k][j];
                }
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(res[i][j]);
            }
            System.out.println("");
        }
    }
}
