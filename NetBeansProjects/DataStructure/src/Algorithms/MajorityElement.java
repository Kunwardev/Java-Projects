/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

/**
 *
 * @author Kunwar
 */
public class MajorityElement
{
    public static int MooreVotingAlgo(int arr[])
    {
        int n = arr.length;
        int maj_index = 0,count = 1;
        for(int i=0;i<n;i++)
        {
            if(arr[maj_index] == arr[i])
            {
                count++;
            }
            else
                count--;
            if(count == 0)
            {
                maj_index = i;
                count = 1;
            }
        }
        return arr[maj_index];
    }
    
    public static void Print_Majority(int arr[])
    {
        int majority = MooreVotingAlgo(arr);
        int number = arr.length/2;
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(majority == arr[i])
                count++;
        }
        if(count > number)
            System.out.println(majority);
        else
            System.out.println("NONE");
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{1, 3, 3, 1, 2, 3, 3};
        Print_Majority(arr);
    }
    
}
