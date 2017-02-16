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
public class AllBulbsSet
{
    private static int countChanges(ArrayList<Integer> a){
        int flips = 0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)==0){
                flips++;
                a.set(i, 1);
                for(int j=i+1;j<a.size();j++){
                    if(a.get(j)==0)
                        a.set(j, 1);
                    else
                        a.set(j, 0);
                }
            }
            System.out.println(a);
        }
        return flips;
    }

    
    private static int Count(ArrayList<Integer> al){
        boolean x = false;
        int count = 0;
        for(int i=0;i<al.size();i++){
            if(x == false){
                if(al.get(i) == 0){
                    x = true;
                    count++;
                    while(al.get(i) == 0){
                        i++;
                        if(i == al.size())
                            break;
                    }
                }
            }else{
                if(al.get(i) == 1){
                    x = false;
                    count++;
                    while(al.get(i) == 1){
                        i++;
                        if(i == al.size())
                            break;
                    }
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(0);
        a.add(1);
        a.add(1);
        System.out.println(a);
        int p = Count(a);
        System.out.println(p);
    }
    
}
