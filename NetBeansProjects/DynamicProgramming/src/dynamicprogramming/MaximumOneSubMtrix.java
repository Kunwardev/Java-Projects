/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynamicprogramming;

/**
 *
 * @author Kunwar
 */
public class MaximumOneSubMtrix
{
    
    public static int min(int a,int b,int c){
        if(a < b && a < c)
            return a;
        else if( b < c && b < a)
            return b;
        else 
            return c;
    }
    
    public static void Function(int M[][],int n,int m){
        int S[][] = new int[n][m];
        for(int i=0;i<n;i++){
            S[i][0] = 0;
        }
        for(int j=0;j<m;j++){
            S[0][j] = 0;
        }
        
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(M[i][j] == 1){
                    S[i][j] = min(S[i-1][j], S[i][j-1], S[i-1][j-1])+1;
                }else
                    S[i][j] = 0;
            }
        }
        
        int max_of_s = 0,max_i=0,max_j=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(max_of_s < S[i][j]){
                    max_of_s = S[i][j];
                    max_i = i;
                    max_j = j;
                }
            }
        }
        
        for(int i = max_i;i > max_i-max_of_s;i--){
            for(int j = max_j;j > max_j-max_of_s;j--){
                System.out.print(M[i][j]+" ");
            }System.out.println();
        }
  
    }
    
    public static void main(String[] args)
    {
        int M[][] =  new int[][]
                   {{0, 1, 1, 0, 1}, 
                   {1, 1, 0, 1, 0}, 
                   {0, 1, 1, 1, 0},
                   {1, 1, 1, 1, 0},
                   {1, 1, 1, 1, 1},
                   {0, 0, 0, 0, 0}};
        Function(M, 6, 5);
    }
    
}
