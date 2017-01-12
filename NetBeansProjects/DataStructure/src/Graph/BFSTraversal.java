/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Kunwar
 */
public class BFSTraversal
{
    private static void BFS(Graph g,int v){
        boolean visited[] = new boolean[g.V];
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;
        while(queue.size() != 0){
            v = queue.poll();
            System.out.print(v);
            Iterator<Integer> it = g.vertex[v].listIterator();
            while(it.hasNext()){
                int n = it.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
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
        BFS(g, 2);
    }
    
}
