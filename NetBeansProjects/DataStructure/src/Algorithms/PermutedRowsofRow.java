/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

import java.util.HashSet;

/**
 *
 * @author Kunwar
 */
public class PermutedRowsofRow
{
    private static void Function(int[][] mat, int row){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<mat[0].length;i++){
            hs.add(mat[row][i]);
        }
        int count = 0;
        for(int i=0;i<mat.length;i++){
            if(i == row)
                continue;
            for(int j=0;j<mat[0].length;j++){
                if(hs.contains(mat[i][j])){
                    count++;
                }
            }
            if(count == mat[0].length)
                System.out.print(i+" ");
            count = 0;
        }
    }
    
    public static void main(String[] args)
    {
        int[][]mat = {{3, 1, 4, 2},  
                   {1, 6, 9, 3},
                   {1, 2, 3, 4},
                   {4, 3, 2, 1}};
        int row = 3;
        Function(mat, row);
    }
    
}
