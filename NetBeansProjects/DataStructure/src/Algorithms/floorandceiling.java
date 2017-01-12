
package Algorithms;

import java.util.Scanner;

public class floorandceiling
{
    public static int ceilSearch(int arr[],int x,int low,int high)
    {
        if(x < arr[0])
            return 0;
        else if(x > arr[arr.length-1])
            return -1;
        int mid = low +(high - low)/2;
        {
            if(arr[mid] == x)
                return mid;
            if(arr[mid] > x)
            {
               // System.out.println("Went in 1");
                if(arr[mid-1] < x)
                {
                 //   System.out.println("Went in 2");
                    return mid;
                }
                else
                {
                  //  System.out.println("Went in 3");
                    return ceilSearch(arr, x, low, mid-1);
                }
            }
            else if(arr[mid] < x)
            {
            //    System.out.println("Went in 4");
                if(arr[mid+1] > x)
                {
              //      System.out.println("Went in 5");
                    return mid+1;
                }
                else
                {
                //    System.out.println("Went in 6");
                    return ceilSearch(arr, x, mid+1, high);
                }
            }
        }
        return -1;
    }
    
    public static int floorSearch(int arr[],int x,int low,int high)
    {
        if(x < arr[0])
            return -1;
        else if(x > arr[arr.length-1])
            return arr.length-1;
        int mid = low + (high - low)/2;
        {
            if(arr[mid] == x)
            return mid;
        else if(arr[mid] > x)
        {
            if(arr[mid-1] < x)
                return mid-1;
            else
                return floorSearch(arr, x, mid+1, high);
        }
        else if(arr[mid] < x)
        {
            if(arr[mid] < x)
            {
                return mid;
            }
            else
                return floorSearch(arr, x, low, mid-1);
        }
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{2,4,6,8,9,12};
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        try{
        System.out.println("The Ceiling of the "+y+" is "+arr[ceilSearch(arr, y, 0, 5)]);}
        catch(ArrayIndexOutOfBoundsException w)
        {
            System.out.println("The Number has no ceiling");
        }
        try{
        System.out.println("The Floor of the "+y+" is "+arr[floorSearch(arr, y, 0, 5)]);}
        catch(ArrayIndexOutOfBoundsException w)
        {
            System.out.println("The Number has no ceiling");
        }
    }
}