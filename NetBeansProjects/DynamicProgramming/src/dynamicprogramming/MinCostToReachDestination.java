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
public class MinCostToReachDestination
{
    private static int Function(int[][] cost,int N){
        int dist[] = new int[N];
        dist[0] = 0;
        for(int k=1;k<N;k++)
            dist[k] = Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(dist[j] > dist[i] + cost[i][j])
                    dist[j] = dist[i] + cost[i][j];
            }
        }
        return dist[N-1];
    }
    
    public static void main(String[] args)
    {
        int cost[][] = {{0, 15, 80, 90},
                        {-1, 0, 40, 50},
                        {-1, -1, 0, 70},
                        {-1, -1, -1, 0}};
        int p = Function(cost, 4);
        System.out.println(p);
    }
        
}
