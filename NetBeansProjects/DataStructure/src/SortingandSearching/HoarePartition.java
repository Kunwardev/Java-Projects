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
public class HoarePartition
{
    public static int Partition(int arr[],int p,int r)
    {
        int x = arr[p];
        int i = p-1;
        int j = r;
        System.out.println(x+" "+i+" "+j);
        while(true)
        {
            do
            {
                j--;
                System.out.print(j+" ");
            }while(!(arr[j] <= x));
            System.out.println("");
            do
            {
                i++;
                System.out.print(i+" ");
            }while(!(arr[i] >= x));
            System.out.println("");
            System.out.println(i+" "+j);
            if(i < j)
            {
                int remp = arr[i];
                arr[i] = arr[j];
                arr[j] = remp;
            }
            else
                return j;
        }
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{13,19,9,5,12,8,7,4,11,2,6,21};
        int  l = Partition(arr, 0, arr.length);
        System.out.println(l);
    }
}
