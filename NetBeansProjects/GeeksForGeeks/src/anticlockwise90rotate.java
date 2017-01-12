
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunwar
 */
public class anticlockwise90rotate
{

    public static void Rotate(int mat[][],int N)
    {
        for(int x=0;x<N/2;x++)
        {
            for(int y=x;y<N-1-x;y++)
            {
                int temp = mat[x][y];
 
            // move values from right to top
            mat[x][y] = mat[y][N-1-x];
 
            // move values from bottom to right
            mat[y][N-1-x] = mat[N-1-x][N-1-y];
 
            // move values from left to bottom
            mat[N-1-x][N-1-y] = mat[N-1-y][x];
 
            // assign temp to left
            mat[N-1-y][x] = temp;
        }
    }}
    public static void displayMat(int mat[][],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int mat[][] = new int[N][N];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        displayMat(mat, N);
        Rotate(mat, N);
        displayMat(mat, N);
    }
}
