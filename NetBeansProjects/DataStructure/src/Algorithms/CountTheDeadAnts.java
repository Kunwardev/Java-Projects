/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

/**
 *
 * @author Kunwar
 */
public class CountTheDeadAnts
{
    public static void deadAntCount(final String ants){
        String arr[] = ants.split("\\.| ");
        for(String a: arr)
            System.out.println(a);
    }
    
    public static void main(String[] args)
    {
        deadAntCount("ant ant .... a nt");
    }
    
}
