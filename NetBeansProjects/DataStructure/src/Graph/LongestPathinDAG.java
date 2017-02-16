/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

import java.util.LinkedList;

/**
 *
 * @author Kunwar
 */

class WGraph{
        static int v;
        static int w;
        static LinkedList[] edge;

    public WGraph(int v)
    {
        this.v = v;
        edge = new LinkedList[v];
        for(int i=0;i<v;i++)
            edge[i] = new LinkedList();
    }        
    
    public void addEdge(WGraph g,int u,int v,int w){
        g.edge[u].add(v);
    }
    
}

public class LongestPathinDAG
{
    
}
