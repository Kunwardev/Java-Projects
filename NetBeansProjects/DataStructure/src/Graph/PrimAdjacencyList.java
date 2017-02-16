/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Kunwar
 */
class GRAPH{
    int V;
   HashMap<Integer, Integer>[] edges;
    
    GRAPH(int v){
        this.V = v;
        edges = new HashMap[v];
        for(int i=0;i<v;i++)
            edges[i] = new HashMap<>();
    }
    
    public void addEdge(int u,int v, int weight){
        HashMap<Integer, Integer> hm;
        hm = new HashMap<>();
        edges[u].put(v,weight);
        hm = new HashMap<>();
        edges[v].put(u, weight);
    }
    
    public void iterate(){
        for(int i=0;i<this.V;i++){
            Iterator<HashMap<Integer, Integer>> it = this.edges[i].iterator();
            System.out.print("Edge "+i);
            while(it.hasNext()){
                System.out.print(it.next()+" ");
            }System.out.println();
        }
    }
}

public class PrimAdjacencyList
{
    public static int minKey(int[] key, boolean[] mstSet){
        int minIndex = -1,min = Integer.MAX_VALUE;
        for(int i=0;i<key.length;i++){
            if(mstSet[i] == false && key[i] < min){
                min = key[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    public static void main(String[] args)
    {
        GRAPH g = new GRAPH(5);
        boolean[] mstSet = new boolean[5];
        g.addEdge(0, 1, 2);
        g.addEdge(0, 3, 6);
        g.addEdge(1, 2, 3);
        g.addEdge(1, 3, 8);
        g.addEdge(1, 4, 5);
        g.addEdge(2, 4, 7);
        g.addEdge(3, 2, 8);
        g.addEdge(3, 4, 9);
        //Queue<LinkedHashSet<HashMap<Integer, Integer>>> pq = new LinkedList<>();
        int[] parent = new int[5];
        int[] key = new int[5];
        Arrays.fill(key, Integer.MAX_VALUE);
        Arrays.fill(mstSet, false);
        key[0] = 0;
        parent[0] = -1;
        for(int count = 0; count < 4; count++){
            int u = minKey(key, mstSet);
            mstSet[u] = true;
            HashMap<Integer, Integer> hm = new HashMap<>();
            for(int i=0;i<5;i++){
                if(mstSet[i] == false){
                    if(g.edges[u].containsKey(i)){
                        if(g.edges[u].get(i) < key[i]){
                            parent[i] = u;
                            key[i] = g.edges[u].get(i);
                        }
                        }
                    }
                }
            }
        printMST(parent, 5, g);
        }

    private static void printMST(int[] parent, int i, GRAPH g)
    {
        for(int j=0;j<i;j++){
            System.out.println(parent[j]+" -> "+j+"   "+g.edges[j].get(parent[j]));
        }
    }
}
