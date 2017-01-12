/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SortingandSearching;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kunwar
 */
public class RadixSort
{
    public static void Sort(int[] arr)
    {
        int radix = 10;
        List<Integer> bucket[] = new ArrayList[10];
        for (int i = 0; i < 10; i++)
        {
            bucket[i] = new ArrayList<Integer>();
        }
        boolean maxLength = false;
        int tmp = 0,place = 1;
        while(!maxLength)
        {
            maxLength = true;
            for(Integer i: arr){
                tmp = i/place;
                bucket[tmp%radix].add(i);
                if(maxLength && tmp > 0)
                    maxLength = false;
                        }
            int a = 0;
            for(int b=0;b<radix;b++)
            {for(Integer x: bucket[b])
                {
                    arr[a++] = x;
                }bucket[b].clear();}
            place *= radix;
        }
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{123,789,25,15,177,100,500,65,1000,45,5};
        Sort(arr);
        for(int i: arr)
            System.out.print(i+" ");
    }
}
