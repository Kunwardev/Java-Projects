/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynamicprogramming;

/**
 *
 * @author Kunwar
 */
public class RobotMovement
{
    private static boolean isSafe(int[][] arr,int i,int j){
        if(i < arr.length && j < arr[0].length)
            return true;
        return false;
    }
    
    private static int[][] movement(int [][]arr,int n,int m){
        int i=0,j=0;
        boolean first = true;
        while(i<n-1 && j<m-1){
            if(isSafe(arr, i, j+1) && first){
                if(arr[i][j+1] != -1){
                    arr[i][j+1] = 1;
                    j++;
                    
                }else{
                    first = false;
                }
            }else if(isSafe(arr, i+1, j)){
                if(arr[i+1][j] != -1){
                    arr[i+1][j] = 1;
                    i++;
                    first = true;
                }
            }
        }
        for(int p=0;p<3;p++){
            for(int q=0;q<3;q++){
                System.out.print(arr[p][q]+" ");
            }System.out.println("");
        }
        return arr;
    }
    
    public static void main(String[] args)
    {
        int[][] arr = new int[][]{{0,0,0},{0,0,0},{0,0,0}};
        arr[0][0] = 2;
        arr[2][2] = 2;
        arr = movement(arr, 3, 3);
        
    }
}
