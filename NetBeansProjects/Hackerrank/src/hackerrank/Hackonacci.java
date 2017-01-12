/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Kunwar
 */

// H(n) = 1.H(n-1) + 2.H(n-2) + 3.H(n-3)

public class Hackonacci
{
     static long Hacks[];
    private static void Function(int n){
        Hacks = new long[n*n*n*n+1];
        Hacks[0] = 0;Hacks[1] = 1;Hacks[2] = 2;Hacks[3] = 3;
        for(int i=4;i<=(n*n*n*n);i++){
            Hacks[i] = ((1*Hacks[i-1])+(2*Hacks[i-2])+(3*Hacks[i-3]))%1000000007;
        }
    }
    
    private static void MatRotate(int arr[][],int n){
        int ret[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ret[i][j] = arr[n-j-1][i];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(ret[i][j]+" ");
            }System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int angle = in.nextInt();
            // your code goes here
            long mat[][] = new long[n][n];
            Function(n);
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    mat[i][j] = Hacks[((i+1)*(j+1))*((i+1)*(j+1))]%2;
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(mat[i][j]+" ");
                }System.out.println();
            }
        }
    }
}