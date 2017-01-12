/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Kunwar
 */
public class SherlockAndString
{
    public static void main(String[] args)
    {
        String S;
        Scanner in = new Scanner(System.in);
        S = in.next();
        Map<Character, Integer> mp = new HashMap<>();
        for(int i=0;i<S.length();i++){
            if(mp.containsKey(S.charAt(i))){
                int x = mp.get(S.charAt(i));
                x= x+1;
                mp.put(S.charAt(i), x);
            }else{
                mp.put(S.charAt(i), 1);
            }
        }
        int length = mp.size();
        Iterator it = mp.entrySet().iterator();
        Object compa[] = new Object[length];
        Arrays.fill(compa, 0);
        int i=0;
       
        while(it.hasNext()){
            Map.Entry Pair = (Map.Entry)it.next();
            compa[i] = Pair.getValue();
            i++;
        }
        System.out.println(i);
        int flag = 0;int j;
        for(j=1;j<length;j++){
            if(compa[j] != compa[0]){
                if(Math.abs(Integer.parseInt(compa[0].toString()) - Integer.parseInt(compa[j].toString())) > 0){
                    flag++;
                }
                if(flag > 1)
                    break;
            }
        }
        System.out.println(S.length());
        if(flag > 1)
            System.out.println("No");
        else
            System.out.println("Yes");
        
    }
}
