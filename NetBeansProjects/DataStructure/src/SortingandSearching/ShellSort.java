/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SortingandSearching;

/**
 *
 * @author Kunwar
 */
public class ShellSort
{
    void sort(int arr[])
    {
        int n = arr.length;
        for(int gap = n/2;gap>0;gap/=2)
        {
            for(int i=gap;i<n;i++)
            {
                int temp = arr[i];
                int j;
                for(j=i;(j>=gap && arr[j-gap] >temp);j-=gap)
                {
                    arr[j] = arr[j-gap];
                }
                arr[j] = temp;
            }
        }
    }
    
    public static void main(String[]args)
    {
        int arr[] = new int[]{4,8,1,56,44,45,12};
        ShellSort s = new ShellSort();
        s.sort(arr);
        for(int j: arr)
            System.out.print(j+" ");
    }
    
}
