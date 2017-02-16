/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BackTracking;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class KnightTour
{
    private static void printArray(int[][] mat, int N){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
    }
    
    private static boolean isSafe(int [][] mat, int x,int y){
        return ((x>=0)&&(y>=0)&&(x<mat.length)&&(y<mat[0].length)&&(mat[x][y]==-1));
    }
    
    private static boolean solveKT(){
        int[][] sol = new int[8][8];
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++)
                sol[i][j] = -1;
        }
        int xMove[] = new int[]{2,1,-1,-2,-2,-1,1,2};
        int yMove[] = new int[]{1,2,2,1,-1,-2,-2,-1};
        sol[0][0] = 0;
        if(solveKTUtil(0,0,1,sol,xMove,yMove) == false){
            System.out.println("Not Possible");
            return false;
        }else{
            printArray(sol, 8);
        }
        return true;
    }

    private static boolean solveKTUtil(int x, int y, int moves, int[][] sol, int[] xMove, int[] yMove)
    {
        int k,next_x,next_y;
        if(moves == 64)
            return true;
        for(k=0;k<8;k++){
            next_x = x + xMove[k];
            next_y = y + yMove[k];
            if(isSafe(sol, next_x, next_y)){
                sol[next_x][next_y] = moves;
                if(solveKTUtil(next_x, next_y, moves+1, sol, xMove, yMove)){
                    return true;
                }else
                    sol[next_x][next_y] = -1;
            }
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        solveKT();
    }
    
}
