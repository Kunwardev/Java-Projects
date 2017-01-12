package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import sun.security.provider.certpath.AdjacencyList;

class newGraph{
        int V;
        LinkedList<Integer> adjList[];
        
        newGraph(int v)
        {
            this.V = v;
            adjList = new LinkedList[v];
            for(int i=0;i<V;i++)
            {
                adjList[i] = new LinkedList<Integer>();
            }
        }
        void addEdge(int v,int w)
        {
            adjList[v].add(w);
        }       
        
    void BFS(int s)
    {
        boolean visited[] = new boolean[V];
 
        LinkedList<Integer> queue = new LinkedList<Integer>();
 
        visited[s]=true;
        queue.add(s);
 
        while (queue.size() != 0)
        {
            s = queue.poll();
            System.out.print(s+" ");
 
            Iterator<Integer> i = adjList[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }   
    
    void DFSUtil(int i,boolean[] visited)
    {
        visited[i] = true;
        System.out.print(i+" ");
        Iterator<Integer> it = adjList[i].listIterator();
        while(it.hasNext())
        {
            int n = it.next();
            if(!visited[n])
            {
                DFSUtil(n, visited);
            }
        }
    }
    
    void DFS(int i)
    {
        boolean visited[] = new boolean[V];
            if(!visited[i])
            {
                DFSUtil(i,visited);
            }
    }
}

public class GraphsTryLatest
{
    
    public static void main(String[] args)
    {
        newGraph ng = new newGraph(4);
    ng.addEdge(0, 1);
    ng.addEdge(0, 2);
    ng.addEdge(1, 2);
    ng.addEdge(2, 0);
    ng.addEdge(2, 3);
    ng.addEdge(3, 3);
    /*for(int i=0;i<ng.V;i++)
        {
        Iterator<Integer> it = ng.adjList[i].listIterator();
        System.out.print(i);
        while (it.hasNext())
        {
            int x = it.next();
            System.out.print("->"+x);
        }
            System.out.println("");
        }*/
        ng.BFS(2);
//        ng.DFS(2);
    }
       
}
