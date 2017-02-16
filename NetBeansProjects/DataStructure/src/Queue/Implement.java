/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Queue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author Kunwar
 */
public class Implement
{
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(4);
        q.add(5);
        q.add(7);
        Iterator<Integer> it = q.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
