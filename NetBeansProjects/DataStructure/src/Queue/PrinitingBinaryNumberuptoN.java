/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Kunwar
 */
public class PrinitingBinaryNumberuptoN
{
    private static void Function(int n){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while(n-- > 0){
            String s1 = q.peek();
            q.poll();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1+"0");
            q.add(s2+"1");
        }
    }
    
    public static void main(String[] args)
    {
        Function(5);
    }
    
}
