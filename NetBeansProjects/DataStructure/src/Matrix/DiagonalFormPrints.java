/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Matrix;

/**
 *
 * @author Kunwar
 */
public class DiagonalFormPrints
{
    private static void Print(int[][] mat){
        int i=0,j=0;
        boolean isUp = true;
        for(int k=0;k<mat.length*mat.length;){
            if(isUp){
                for(;i>=0&&j<mat.length;j++,i--){
                    System.out.print(mat[i][j]+" ");
                    k++;
                }
                if(i<0 && j<=mat.length-1)
                    i=0;
                if(j==mat.length){
                    i+=2; j--;}
            }else{
                for(;j>=0 && i<mat.length;i++,j--){
                    System.out.print(mat[i][j]+" ");
                    k++;
                }
                if(j<0 && i<=mat.length-1)
                    j=0;
                if(i==mat.length){
                    j=j+2;i--;}
            }
            isUp = !isUp;
        }
    }
    
    public static void main(String[] args)
    {
        int[][] arr = new int[][]{{1,  2,  3,  10},
	              {4,  5,  6,  11},
	              {7,  8,  9,  12},
	              {13, 14, 15, 16}};
        Print(arr);
    }
    
}
