/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;

import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author Kunwar
 */
public class ch4Question2
{
    
    private static boolean DetectCycle(Graph g){
        
    }
    
    public static void main(String[] args){
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(3, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        boolean p = DetectCycle(g);
        System.out.println(p);
    }
    
}
