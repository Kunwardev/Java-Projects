/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
/**
 *
 * @author Kunwar
 */
public class Graph
{
    static int V;
    static LinkedList edge[];
    
    Graph(int v){
        this.V = v;
        edge = new LinkedList[v];
        for(int i=0;i<v;i++){
            edge[i] = new LinkedList();
        }
    }
    
    public static void addEdge(int v,int w){
        edge[v].add(w);
    }
    
    public static void BFS(int v){
        boolean visited[] = new boolean[V];
        Arrays.fill(visited,false);
        visited[v] = true;
        LinkedList<Integer> q = new LinkedList<>();
        q.add(v);
        while(q.size() != 0){
            int p = q.poll();
            System.out.print(p + " ");
            Iterator<Integer> it = edge[p].listIterator();
            while(it.hasNext()){
                int n = it.next();
                if(!visited[n]){
                    q.add(n);
                    visited[n] = true;
                }
            }
        }
    }
    
    private static void DFS(int v,boolean visited[]){
        visited[v] = true;
        System.out.print(v+" ");
        Iterator<Integer> it = edge[v].listIterator();
        while(it.hasNext()){
            int p = it.next();
            if(!visited[p]){
                DFS(p,visited);
            }else{
                System.out.println("Cycle");
            }
        }
    }
    
    private static void DFSUtil(int v){
        boolean visited[] = new boolean[V];
        Arrays.fill(visited,false);
        DFS(v,visited);
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
        g.BFS(2);
        System.out.println("");
        g.DFSUtil(2);
    }
    
}
