/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;
import java.util.*;
/**
 *
 * @author Kunwar
 */
public class Gemstones
{
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int T;
        Scanner in = new Scanner(System.in);
        T = in.nextInt();
        String check;
        Map<Character,Integer> mp = new HashMap<>();
        String check1;
        int chars[] = new int[26];
        for(int i=0;i<T;i++){
            check = in.next();
            check1 = "";
            Arrays.fill(chars, 0);
            for(int j=0;j<check.length();j++){
                if(chars[check.charAt(j)-'a'] == 0)
                {
                    chars[check.charAt(j)-'a']++;
                    check1 += check.charAt(j);
                }
            }
            for(int j=0;j<check1.length();j++){
                if(i == 0){
                    mp.putIfAbsent(check1.charAt(j), 1);
                }else{
                    if(mp.containsKey(check1.charAt(j))){
                        mp.put(check1.charAt(j),mp.get(check1.charAt(j))+1);
                    }
                }
            }
        }
        int count = 0;
        Iterator it = mp.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            if(pair.getValue() == (Integer)T){
                //System.out.println(pair.getValue()+" "+pair.getKey());
                count++;
            }
            it.remove();
        }
         System.out.println(count);
    }
     
}
