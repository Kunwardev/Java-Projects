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
public class Graph
{
    int V;
    LinkedList vertex[];
    
    Graph(int v){
        this.V = v;
        vertex = new LinkedList[v];
        for(int i=0;i<V;i++){
            vertex[i] = new LinkedList();
        }
    }
    
    public void addEdge(int v,int w){
        vertex[v].add(w);
    }
    
    private void BFS(int s){
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);
        while(queue.size() != 0){
            s = queue.poll();
            System.out.print(s+" ");
            Iterator<Integer> it = vertex[s].listIterator();
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
        Graph gp = new Graph(4);
        gp.addEdge(0, 1);
        gp.addEdge(0, 2);
        gp.addEdge(1, 2);
        gp.addEdge(2, 0);
        gp.addEdge(2, 1);
        gp.addEdge(1, 3);
        gp.addEdge(3, 3);
        /*for(int i=0;i<5;i++){
            Iterator it = gp.vertex[i].listIterator();
            System.out.print(i+"->");
            while(it.hasNext()){
                System.out.print(it.next()+" ");
            }
            System.out.println("");
        }*/
        
        gp.BFS(2);
        
    }
    
}

