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
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CubeSummation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i=0;i<T;i++)
            {
            int N, Q;
            N = in.nextInt();
            Q = in.nextInt();
            int arr[][][] = new int[N][N][N];
            for(int j=0;j<N;j++)
                {
                for(int k=0;k<N;k++)
                    {
                    for(int l=0;l<N;l++)
                        arr[j][k][l] = 0;
                }
            }
            for(int q=0;q<Q;q++)
                {
                String cmd = in.next();
                if(cmd.equals("UPDATE"))
                {
                    int x = Integer.parseInt(in.next());
                    int y = Integer.parseInt(in.next());
                    int z = Integer.parseInt(in.next());
                    arr[x-1][y-1][z-1] = Integer.parseInt(in.next());
                } 
                else
                    {
                    int x1 = Integer.parseInt(in.next());
                    int y1 = Integer.parseInt(in.next());
                    int z1 = Integer.parseInt(in.next());
                    int x2 = Integer.parseInt(in.next());
                    int y2 = Integer.parseInt(in.next());
                    int z2 = Integer.parseInt(in.next());
                    int sumxyz = 0;
                    for(int p=x1-1;p<x2;p++)
                        {
                        for(int s=y1-1;s<y2;s++)
                            {
                            for(int r=z1-1;r<z2;r++)
                                sumxyz += arr[p][s][r];
                        }
                    }
                    System.out.println(sumxyz);
                }
            }
        }
    }
}