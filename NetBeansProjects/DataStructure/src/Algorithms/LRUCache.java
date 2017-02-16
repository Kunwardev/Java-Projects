/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

import java.util.ArrayList;

/**
 *
 * @author Kunwar
 */
public class LRUCache
{
    private static ArrayList<Integer> cache(int[] arr){
        ArrayList<Integer> ca = new ArrayList<>(5);
        int counter = 0;
        for(int i=0;i<arr.length;i++){
            if(!ca.contains(arr[i])){
                System.out.println("Enter");
                if(counter == 5){
                    int p = ca.remove(4);
                    ca.add(0, arr[i]);
                }else{
                    ca.add(0, arr[i]);
                    counter++;
                }
            }else{
                int j;
                for(j=0;j<5;j++){
                    if(ca.get(j) == arr[i])
                        break;
                }
                int p = ca.remove(j);
                ca.add(0,p);
            }
        }
        return ca;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,1,5,6};
        ArrayList<Integer> al = cache(arr);
        System.out.println(al);
    }
    
}
