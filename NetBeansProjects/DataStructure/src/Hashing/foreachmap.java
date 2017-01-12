/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Kunwar
 */
public class foreachmap
{
    public static void main(String[] args)
    {
        Map<String,String> m = new HashMap<>();
        m.put("A", "B");
        m.put("C", "D");
        m.put("E", "F");
        m.put("G", "H");
        m.put("I", "J");
        m.put("K", "M");
        for(String key : m.keySet())
            System.out.println(key);
        System.out.println("");
        //Map<String,String> Entry = new HashMap<>();
        for(String key : m.values())
            System.out.println(key);
        System.out.println("");
        for(Map.Entry<String,String> entry: m.entrySet())
            System.out.println(entry.getKey()+" "+entry.getValue());
    }
    
}
