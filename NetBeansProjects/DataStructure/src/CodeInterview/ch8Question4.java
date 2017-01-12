/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class ch8Question4
{
    static ArrayList<String> al = new ArrayList<>();
    private static void add(String a, int arr[], int index, int size){
        if(index == size-1){
            arr[index] = 0;
            Include(a,arr,size);
            arr[index] = 1;
            Include(a,arr,size);
        }
        else{
            arr[index] = 0;
            add(a, arr, index+1, size);
            arr[index] = 1;
            add(a, arr, index+1, size);
        }
    }
    
    private static void Include(String a,int arr[],int size){
        String b = "";
        for(int i=0;i<size;i++){
            if(arr[i] == 1){
                b = b + a.charAt(i);
            }
        }
        al.add(b);
    }
    
    public static void main(String[] args)
    {
        String x = "kdsi";
        int arr[] = new int[x.length()];
        Arrays.fill(arr,0);
        add(x, arr, 0, x.length());
        System.out.println(al);
    }
    
}
