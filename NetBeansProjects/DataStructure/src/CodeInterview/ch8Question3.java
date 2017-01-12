/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;

import java.util.ArrayList;

/**
 *
 * @author Kunwar
 */
public class ch8Question3
{
    private static ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();    private static void Test(int arr[],int asl[],int index,int size){
        if(index == size - 1){
            arr[index] = 0;
            Print(arr, asl, size);
            arr[index] = 1;
            Print(arr, asl, size);
            return;
        }
        else{
            arr[index] = 0;
            Test(arr,asl,index+1,size);
            arr[index] = 1;
            Test(arr,asl,index+1,size);
        }
    }
    
    private static void Print(int arr[],int asl[], int size){
        ArrayList<Integer> a = new ArrayList();
        for(int i=0;i<size;i++){
            if(arr[i] == 1)
                a.add(asl[i]);
        }
        al.add(a);
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[3];
        arr[0] = arr[1] = arr[2] = 0;
        int asl[] = new int[]{1,2,3};
        Test(arr,asl,0,3);
        System.out.println(al);
    }
    
}
