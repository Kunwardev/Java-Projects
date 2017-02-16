/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions;

import java.util.ArrayList;

/**
 *
 * @author Kunwar
 */
public class NumberofTimesDigitApperared
{
    
    private static int digitCount(int x,int d){
        int count = 0,p;
        while(x != 0){
            p = x%10;
            if(p == d)
                count++;
            x = x/10;
        }
        return count;
    }
    
    private static int count(ArrayList<Integer> al,int counts,int d){
        while(!(al.isEmpty())){
            int x = al.remove(0);
            if(x == d){
                counts++;
                continue;
            }
            counts += digitCount(x,d);
        }
        return counts;
    }
    
    private static int stringCount(ArrayList<Integer> al,int d){
        String exp = "";
        while(!(al.isEmpty())){
            exp += al.remove(0)+"";    
        }
        int count = 0;
        for(int i=0;i < exp.length();i++){
            if((int)exp.charAt(i) == d+'0')
                count++;
        }
        
        return count;
    }
    
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(100);
        al.add(10);
        al.add(100);
        al.add(10);
        al.add(100);
        al.add(10);
        al.add(100);
        al.add(10);al.add(100);
        al.add(10);
        al.add(100);
        al.add(10);al.add(100);
        al.add(10);al.add(100);
        al.add(10);al.add(100);
        al.add(10);
        al.add(100);
        al.add(10);al.add(100);
        al.add(10);al.add(100);
        al.add(10);al.add(100);
        al.add(10);al.add(100);
        al.add(10);al.add(100);
        al.add(10);al.add(100);
        al.add(10);al.add(100);
        al.add(10);al.add(100);
        al.add(10);al.add(100);
        al.add(10);
        double start1 = System.currentTimeMillis();
        int occurence = count(al,0,0);
        //double start1 = System.currentTimeMillis();
        //int times = stringCount(al,0);
        double stop1 = System.currentTimeMillis();
        //System.out.println(occurence);
        System.out.println(occurence+" "+(start1+" "+stop1));
    }
    
}
