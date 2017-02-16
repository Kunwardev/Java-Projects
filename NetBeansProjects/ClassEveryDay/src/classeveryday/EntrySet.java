/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classeveryday;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Kunwar
 */
public class EntrySet
{
    public static void main(String[] args)
    {
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(1, 1);
        mp.put(2, 2);
        mp.put(3, 3);
        mp.put(4, 4);
        mp.put(5, 5);
        for(Entry<Integer, Integer>mps : mp.entrySet()){
            System.out.println(mps.getKey()+" -> "+mps.getValue());
        }
    }
}
