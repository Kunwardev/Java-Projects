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
public class ch1Question6
{
    private static void SolutionAnti(int[][] arr,int n){
        for(int i=0;i<n/2;i++){
            for(int j=i;j<n-i-1;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-i-1];
                arr[i][n-1-i] = arr[n-1-i][n-1-j];
                arr[n-1-i][n-1-j] = arr[n-j-1][i];
                arr[n-j-1][i] = temp;
            }
        }
    }
    
public static void rotate(int[][] matrix, int n) {
    for (int layer = 0; layer < n / 2; ++layer) {
    int first = layer;
    int last = n - 1 - layer;
    for(int i = first; i < last; ++i) {
    int offset = i - first;
    int top = matrix[first][i]; // save top
    matrix[first][i] = matrix[last-offset][first];
    matrix[last-offset][first] = matrix[last][last - offset];
    matrix[last][last - offset] = matrix[i][last];
    matrix[i][last] = top; // right <- saved top
    }
    }
}
    
    public static void main(String[] args)
    {
        int arr[][] = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        SolutionAnti(arr,4);
        
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println("");
        }
    }
    
}
