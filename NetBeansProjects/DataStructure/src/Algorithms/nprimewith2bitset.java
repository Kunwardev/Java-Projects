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
public class nprimewith2bitset
{
    public static int pow(int j)
    {
        int ans = 1;
        if(j > 0)
            ans = ans << j;
        return ans;
    }
    
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1;n>0;i++)
        {
            int firstbit = pow(i);
            for(int j=0;j<i&&n>0;j++,n--)
            {
                int secondbit = pow(j);
                System.out.print(firstbit+secondbit+"  ");
            }
        }
    }
    
}
