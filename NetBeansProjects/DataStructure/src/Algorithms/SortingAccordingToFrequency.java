/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Kunwar
 */


public class SortingAccordingToFrequency
{
    
    static class DS {

    public int frequency;
    public int data;
    
    
    DS(int data, int freq){
        this.data = data;
        this.frequency = freq;
    }
    
    DS(){}
    
}   
    
    private static ArrayList<DS> Function(int[] arr){
        ArrayList<DS> al = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!a.contains(arr[i])){
                al.add(new DS(arr[i],1));
                a.add(arr[i]);
            }else{
                for(int j=0;j<al.size();j++){
                    if(al.get(j).data == arr[i]){
                        al.get(j).frequency++;
                    }
                }
            }
        }
        
        return al;
    }
    
    public static void main(String[] args)
    {
        ArrayList<DS> al = new ArrayList<>();
        int[] arr = new int[]{2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8};
        al = Function(arr);
        Collections.sort(al, new Comparator<DS>()
        {

           public int compare(DS o1, DS o2)
            {
                if(o1.frequency < o2.frequency)
                    return 1;
                else if(o1.frequency == o2.frequency)
                    return 0;
                return -1;
            }
        });
        for(int i=0;i<al.size();i++){
            for(int j=0;j<al.get(i).frequency;j++){
                System.out.print(al.get(i).data+" ");
            }
        }
    }
    
}
