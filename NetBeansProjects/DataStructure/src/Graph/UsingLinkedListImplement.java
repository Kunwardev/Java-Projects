/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Kunwar
*/

class Graph{
int V;
LinkedList<Integer> adjList[];
Graph(int v)
{
    V = v;
    adjList = new LinkedList[v];
    for(int i=0;i<v;i++)
        adjList[i] = new LinkedList();
}

 void addEdge(int v,int w)
{
    adjList[v].add(w);
}
 
 void DFSUtil(int v,boolean visited[])
 {
     visited[v] = true;
     System.out.println(v);
     Iterator<Integer> i = adjList[v].listIterator();
     while(i.hasNext())
     {
         int n = i.next();
         if(!visited[n])
         {
             visited[n] = true;
             DFSUtil(n, visited);
         }
     }
 }
 
 void DFS(int v)
 {
     boolean visited[] = new boolean[V];
     DFSUtil(v, visited);
 }
 
void BFS(int s)
{
    boolean visited[] = new boolean[V];
    LinkedList<Integer> queue = new LinkedList<>();
    visited[s] = true;
    queue.add(s);
    while(queue.size() != 0)
    {
        s = queue.poll();
        System.out.println(s);
        Iterator<Integer> i = adjList[s].listIterator();
        while(i.hasNext())
        {
            int n = i.next();
            if(!visited[n])
            {
                visited[n] = true;
                queue.add(n);
            }
        }
    }
}
 
}

public class UsingLinkedListImplement
{
    public static void main(String[] args)
    {
        Graph g = new Graph(4);
         g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(3, 2);
        g.addEdge(2, 3);
        
        
        g.BFS(2);
        System.out.println("");
        g.DFS(2);
    }
}
