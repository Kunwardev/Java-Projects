/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author Kunwar
 */
public class DetectCycle
{
    
    private static boolean isCyclicUtil(Graphs g, boolean[] visited, boolean[] recstack,int v){
        if(visited[v] == false){
        visited[v] = true;
        recstack[v] = true;
        Iterator<Integer> it = g.edges[v].listIterator();
        while(it.hasNext()){
            int x = it.next();
            if(!visited[x] && isCyclicUtil(g, visited, recstack, x))
                return true;
            else if(recstack[x])
                return true;
        }
        }
        recstack[v] = false;
        return false;
    }
    
    private static boolean isCyclic(Graphs g){
        boolean visited[] = new boolean[g.vertex];
        boolean recstack[] = new boolean[g.vertex];
        Arrays.fill(visited,false);
        Arrays.fill(recstack,false);
        for(int i=0;i<g.vertex;i++){
            if(isCyclicUtil(g,visited,recstack,i))
                return true;
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        Graphs g = new Graphs(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(0,3);
        System.out.println(isCyclic(g));
    }
    
}
