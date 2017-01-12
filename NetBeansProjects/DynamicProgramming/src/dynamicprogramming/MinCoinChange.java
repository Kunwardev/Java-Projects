/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynamicprogramming;
import java.util.Arrays;
/**
 *
 * @author Kunwar
 */
public class MinCoinChange
{
    
    // Total Number of Ways required 
    private static int countWays(int S[],int m, int n){
        int[] table = new int[n+1];
        Arrays.fill(table,0);
        table[0] = 1;
        for(int i=0;i<m;i++){
            for(int j=S[i];j<=n;j++){
                table[j] += table[j-S[i]];
            }
        }
        return table[n];
    }
    
    
    // Minimum Number of Coins required to make a change
    private static int CountandTellCoins(int coins[],int m,int n){
        int table[] = new int[n+1];
        int coin[] = new int[n+1];
        table[0] = 0;
        coin[0] = -1;
        for(int i=1;i<=n;i++){
            table[i] = Integer.MAX_VALUE-1;
            coin[i] = -1;
        }
        
        for(int j=0;j<m;j++){
            for(int i=1;i<=n;i++){
                if(i >= coins[j]){
                    if(table[i-coins[j]] + 1 < table[i]){
                        table[i] = 1 + table[i-coins[j]];
                        coin[i] = j;
                    }
                }
            }
        }
        PrintCombination(coin, coins);
        return table[n];
    }
    
    private static void PrintCombination(int coin[],int coins[]){
        int start = coin.length-1;
        System.out.print("Value of Coins: ");
        while(start != 0){
            int j = coin[start];
            System.out.print(coins[j]+"  ");
            start = start - coins[j];
        }
        System.out.println("");
    }
    
    public static void main(String[] args)
    {
        int coins[] = new int[]{1,2,3};
        int n = 4;
        int m = 3;
        System.out.println("Total Number of Ways:    "+ countWays(coins, m, n));
        System.out.println("Minimum Number of Coins:    "+CountandTellCoins(coins, m, n));
    }
    
}
