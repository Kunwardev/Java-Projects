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
public class UglyNumbers
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int hamming[] = new int[n+1];
        hamming[0] = 1;
        int i2=0,i3=0,i5=0;
        int next_multiple_of_2 = hamming[i2]*2;
        int next_multiple_of_3 = hamming[i3]*3;
        int next_multiple_of_5 = hamming[i5]*5;
        for(int i=1;i<n;i++)
        {
            int next_hamming = Math.min(next_multiple_of_2, next_multiple_of_3);
            next_hamming = Math.min(next_hamming, next_multiple_of_5);
            hamming[i] = next_hamming;
            if(next_hamming == next_multiple_of_2)
            {
                i2 = i2+1;
                next_multiple_of_2 = hamming[i2]*2;
            }
            if(next_hamming == next_multiple_of_3)
            {
                i3 = i3+1;
                next_multiple_of_3 = hamming[i3]*3;
            }
            if(next_hamming == next_multiple_of_5)
            {
                i5 = i5+1;
                next_multiple_of_5 = hamming[i5]*5;
            }
        }
        System.out.println(hamming[n-1]);
    }
}
