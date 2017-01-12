/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackerrank;

import java.io.*;
import java.util.*;

public class CoinchangeDynamic {

    public static long MinCoin(long coins[],long amount,long n)
        {
        
        if(amount<0)
            return 0;
        else if(amount == 0)
            return 1;
        long min_coins = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
            {
            if(coins[i]<=amount)
            min_coins = Math.min(min_coins,MinCoin(coins,amount-coins[i],n)+1);
        }
        return min_coins;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        long sum;
        long resul;
        int N;
        Scanner sc = new Scanner(System.in);
        sum = sc.nextLong();
        N = sc.nextInt();
        long coins[] = new long[N];
        for(int i=0;i<N;i++)
            coins[i] = sc.nextLong();
        resul = MinCoin(coins,sum,N);
        System.out.print(resul);
    }
}