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
public class InPlaceRotate
{
    private static void Rotate(int[][] mat){
        int N = mat.length;
        for(int i=0;i<mat.length/2;i++){
            for(int j=i;j<mat.length-i-1;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][N-i-1];
                mat[j][N-i-1] = mat[N-i-1][N-j-1];
                mat[N-i-1][N-j-1] = mat[N-j-1][i];
                mat[N-j-1][i] = temp;
            }
        }
    }
    
    public static void main(String[] args)
    {
        int[][] arr = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Rotate(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
    
}
