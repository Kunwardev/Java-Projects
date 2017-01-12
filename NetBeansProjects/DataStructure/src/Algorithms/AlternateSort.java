/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Kunwar
 */
public class AlternateSort
{
    public static void function(LinkedList<Integer> l)
    {
        Collections.sort(l);
        for(int i=1;i<(l.size()+1)/2;i++)
        {
            Integer x = l.getLast();
            l.removeLast();
            l.add(2*i-1,x);
        }
        System.out.println(l);
    }
    
    public static void main(String[] args)
    {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);l.add(3);l.add(2);l.add(7);l.add(6);l.add(8);l.add(4);l.add(5);
        function(l);
    }
    
}
