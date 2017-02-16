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
public class Graphs
{
    static int vertex;
    static LinkedList[] edges;
    
    Graphs(int v){
        this.vertex = v;
        edges = new LinkedList[v];
        for(int i=0;i<v;i++)
            edges[i] = new LinkedList();
    }
    
    public static void addEdge(int v,int w){
        edges[v].add(w);
    }
    
    private static void BFS(Graphs g,int v){
        boolean visited[] = new boolean[g.vertex];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[v] = true;
        queue.add(v);
        while(queue.size()!=0){
            int n = queue.poll();
            System.out.print(n+" ");
            Iterator<Integer> it = g.edges[n].listIterator();
            while(it.hasNext()){
                int p = it.next();
                if(!visited[p]){
                    queue.add(p);
                    visited[p] = true;
                }
            }
        }
    }
    
    private static void DFSUtil(Graphs g, int v,boolean[] visited){
        visited[v] = true;
        System.out.print(v+" ");
        Iterator<Integer> it = g.edges[v].listIterator();
        while(it.hasNext()){
            int p = it.next();
            if(!visited[p]){
                DFSUtil(g, p, visited);
            }
        }
    }
    
    private static void DFS(Graphs g,int v){
        boolean[] visited = new boolean[g.vertex];
        DFSUtil(g,v,visited);
    }
    
    public static void main(String[] args)
    {
        Graphs g = new Graphs(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        BFS(g,2);
        System.out.println("");
        DFS(g, 2);
    }
    
}