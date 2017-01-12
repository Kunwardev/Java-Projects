/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

import java.util.Iterator;

/**
 *
 * @author Kunwar
 */
public class DFSTraversal
{
    private static void DFS(Graph g, int v, boolean visited[]){
        visited[v] = true;
        System.out.print(v);
        
        Iterator<Integer> it = g.vertex[v].listIterator();
        while(it.hasNext()){
            int n = it.next();
            if(!visited[n]){
                DFS(g, n, visited);
            }
        }
    }
    
    private static void DFSUtil(Graph g, int v){
        boolean visited[] = new boolean[g.V];
        DFS(g, v,visited);
    }
    
    public static void main(String[] args)
    {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        DFSUtil(g, 1);
    }
    
}
