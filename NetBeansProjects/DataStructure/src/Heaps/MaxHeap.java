/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Heaps;

import java.util.Scanner;

/**
 *
 * @author Kunwar
 */
public class MaxHeap
{
    private static int Left(int i){
        return 2*i;
    }
    private static int Right(int i){
        return 2*i+1;
    }
    
    private static void MaxHeapify(int[] arr,int i){
        int l = Left(i);
        int r = Right(i);
        int largest;
        if(l < arr.length && arr[l] > arr[r]){
            largest = l;
        }else
            largest = i;
        if(r < arr.length && arr[r] > arr[largest])
            largest = r;
        
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            MaxHeapify(arr, largest);
        }
    }
    
    private static void buildHeap(int[] arr){
        int n = arr.length;
        for(int i=n/2;i>=0;i--){
            MaxHeapify(arr, i);
        }
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);    
        for (int i = 0; i < 10; i++)
        {
            arr[i] = sc.nextInt();
        }
        buildHeap(arr);
        for(int i: arr)
            System.out.println(i);
    }
    
}
