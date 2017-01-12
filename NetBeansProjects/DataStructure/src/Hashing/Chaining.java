
package Hashing;

import java.util.LinkedList;

public class Chaining
{
    static LinkedList<Integer> adjList[];
    public static LinkedList<Integer>[] Function(int arr[])
    {
        adjList = new LinkedList[10];
        for (int i = 0; i < 7; i++)
        {
            adjList[i] = new LinkedList<>();
        }
        for(int i=0;i<arr.length;i++)
        {
            adjList[arr[i]%7].add(arr[i]);
        }
        return adjList;
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{50, 700, 76, 85, 92, 73, 101};
        LinkedList<Integer> ad[] = Function(arr);
        for(int i=0;i<7;i++)
            System.out.println(ad[i]);
    }
    
}
