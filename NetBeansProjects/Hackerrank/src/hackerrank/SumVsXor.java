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
public class SumVsXor
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long c = 0;
        while(n!=0){
            c += (n%2==0)?1:0;
            n = n/2;
        }
        System.out.println((long)Math.pow(2,c));
    }
}
