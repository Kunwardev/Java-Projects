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
public class CompetitionLeaderboard
{
    
    public static void Linear(int arr[],int ranking[],int y,int m){
    int i = arr.length-1;int j = 0;
    while(j != m){
        if(arr[i] == y)
            System.out.println(ranking[i]);
        else if(arr[i] > y)
                System.out.println(ranking[i]+1);
        else{
            i--;
        if(i != 0)
        {
            continue;
        }else{
            System.out.println(1);
            i = 1;
        }
        }
        j++;
    }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        
        // your code goes here
        int ranks = 1;
        int rank[] = new int[n];
        for(int i=0;i<n-1;i++){
            if(scores[i] > scores[i+1]){
                rank[i] = ranks;
                ranks++;
            }
            if(scores[i] == scores[i+1])
                rank[i] = ranks;
        }
        if(scores[n-2] > scores[n-1]){
            if(rank[n-2] == ranks){
                ranks++;
                rank[n-1] = ranks;
            }else{
                rank[n-1] = ranks;
            }
        }else{
            if(rank[n-2] == ranks){
                rank[n-1] = ranks;
            }else{
                ranks--;
                rank[n-1] = ranks;
            }
        }
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
            Linear(scores, rank, alice[alice_i],1);
        }
        
    }
}
