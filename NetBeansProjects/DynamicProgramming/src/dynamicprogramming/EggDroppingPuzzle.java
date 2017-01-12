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
public class EggDroppingPuzzle
{
    static int max(int x,int y){
        if(x > y)
            return x;
        else
            return y;
    }
    
    static int eggDrop(int n,int k){
        int eggtrial[][] = new int[n+1][k+1];
        int res,i,j,x;
        for(i=1;i<=n;i++){
            eggtrial[i][1] = 1;
            eggtrial[i][0] = 0;
        }
        
        for(j=1;j<=k;j++){
            eggtrial[1][j] = j;
        }
        for(i=2;i<=n;i++){
            for(j=2;j<=k;j++){
                eggtrial[i][j] = Integer.MAX_VALUE;
                for(x=1;x<=j;x++){
                    res = 1 + max(eggtrial[i-1][x-1],eggtrial[i][j-x]);
                    if(res < eggtrial[i][j]){
                        eggtrial[i][j] = res;
                    }
                }
            }
        }
        return eggtrial[n][k];
    }
    
    public static void main(String[] args)
    {
        int n = 2, k = 10;
        System.out.println(eggDrop(n, k));
    }
    
}
