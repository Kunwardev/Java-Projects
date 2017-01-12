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
public class MAtrixZigZag
{
    private static void Print(int[][] mat){
        int i=0,j=0;
        while(j < mat[0].length){
            if(i == 0){
                for(i=0;i<mat.length;i++){
                    System.out.print(mat[i][j]+" ");
                }
            }
            else{
                for(i=mat.length-1;i>=0;i--){
                    System.out.print(mat[i][j]+" ");
            }
        }j++;
        }
    }
    
    private static void PrintAnother(int matrix[][]){
        int N = matrix.length;
        int M = matrix[0].length;

        // upper left triangle (including minor diagonal)
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=Math.min(M, i); j++) {
                int next = matrix[i - j][j-1];
                System.out.print(next + " ");
            }
        }
        
        // lower right triangle (excluding minor diagonal)
        for(int i=1; i<M; i++) {
            for(int j=i; j<M; j++) {
                int next = matrix[N + i - j - 1][j];
                System.out.print(next + " ");
            }
        }
    }
    
    public static void main(String[] args)
    {
        int mat[][] = new int[][]{{1,2,3,4},
                                  {5,6,7,8},
                                  {9,10,11,12},
                                  {13,14,15,16}};
        Print(mat);
        System.out.println("");
        PrintAnother(mat);
    }
  
}
