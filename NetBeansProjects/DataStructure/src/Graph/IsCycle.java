/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Kunwar
 */
    class Edge implements Comparable<Edge>{
        int src,dest,weight;
        
        public int compareTo(Edge comp){
            return this.weight - comp.weight;
        }
    }

    class graph{
        public int V,E;
        Edge[] edges;
        graph(int V,int E){
            this.V = V;
            this.E = E;
            this.edges = new Edge[E];
            for(int i=0;i<E;i++)
                this.edges[i] = new Edge();
        }
        
    }
public class IsCycle
{
    private static boolean isCycle(graph f){
        int[] parent = new int[f.V];
        for(int i=0;i<f.V;i++)
            parent[i] = -1;
        for(int i=0;i<f.E;i++){
            int x = find(parent, f.edges[i].src);
            int y = find(parent, f.edges[i].dest);
            if(x == y)
                return true;
            union(parent, x, y);
        }
        return false;
    }    
    
    private static int find(int[] parent, int i){
        if(parent[i] == -1)
            return i;
        return find(parent, parent[i]);
    }
    
    private static void union(int[] parent, int x,int y){
        int xx = find(parent, x);
        int yy = find(parent, y);
        parent[xx] = yy;
    }
    
    public static void main(String[] args)
    {
        graph g = new graph(4,3);
        g.edges[0].src = 0;
        g.edges[0].dest = 1;
        g.edges[0].weight = 10;
        g.edges[1].src = 1;
        g.edges[1].dest = 2;
        g.edges[1].weight = 5;
        g.edges[2].src = 2;
        g.edges[2].dest = 3;
        g.edges[2].weight = 3;
        System.out.println(isCycle(g));
    }
    
}
