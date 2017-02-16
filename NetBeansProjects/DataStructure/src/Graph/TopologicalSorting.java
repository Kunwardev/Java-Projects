/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author Kunwar
 */
public class TopologicalSorting
{
    private static void TopologicalUtil(Graphs g,boolean[] visited, int i, Stack st){
        visited[i] = true;
        Iterator<Integer> it = g.edges[i].listIterator();
        while(it.hasNext()){
            int n = it.next();
            if(!visited[n])
                TopologicalUtil(g, visited, n, st);
        }
        st.push(i);
    }
    
    private static void Topological(Graphs g){
        Stack<Integer> st = new Stack();
        boolean[] visited = new boolean[g.vertex];
        Arrays.fill(visited, false);
        for(int i=0;i<g.vertex;i++){
            if(visited[i] == false)
                TopologicalUtil(g,visited,i,st);
        }
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
    
    public static void main(String[] args)
    {
        Graphs g = new Graphs(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        Topological(g);
    }
}
