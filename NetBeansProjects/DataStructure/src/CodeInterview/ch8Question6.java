/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;

/**
 *
 * @author Kunwar
 */
public class ch8Question6
{
    private static void color(int[][] mat,int i,int j,int n,int color){
        if( i < 0 || j < 0 || i >= n || j >= n )
            return;
        else{
            if(mat[i][j] == 0){
            mat[i][j] = color;
            color(mat,i+1,j,n,color);
            color(mat,i-1,j,n,color);
            color(mat,i,j+1,n,color);
            color(mat,i,j-1,n,color);
        }}
        return;
    }
    
    public static void main(String[] args)
    {
        int mat[][] = new int[][]
                        {{0,0,1,0},
                         {0,1,0,1},
                         {0,1,0,1},
                         {0,1,1,1}};
        color(mat, 0,0, 4, 5);
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++)
                System.out.print(mat[i][j]);
            System.out.println("");
        }
    }
    
}
