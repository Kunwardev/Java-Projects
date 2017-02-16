/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

import java.util.Scanner;

/**
 *
 * @author Kunwar
 */
public class CheckHackerrank
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] arr = new long[n+1];
        int m = in.nextInt();
        for(int i=0;i<m;i++){
            int l = in.nextInt()-1;
            int r = in.nextInt();
            int k = in.nextInt();
            arr[l] += k;
            arr[r] -= k;
        }
        long curr = 0;
        long max = 0;
        for(int i=0;i<n;i++){
            curr += arr[i];
            max = Math.max(max, curr);
        }
        System.out.println(max);
    }
}
