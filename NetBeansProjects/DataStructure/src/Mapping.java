
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunwar
 */
public class Mapping
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> hm = new HashMap<String, Integer>();
        hm.put("One",1);
        hm.put("Two",2);
        hm.put("Three",3);
        System.out.println(hm.hashCode());
    }
}
