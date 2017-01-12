/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SortingandSearching;

import java.util.Scanner;

/**
 *
 * @author Kunwar
 */
public class LinearSearch
{
    public static void swap(int x,int y)
    {
        int tmep = x;
        x = y;
        y = tmep;
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++)
            arr[i] = sc.nextInt();
        System.out.print("Find the Number: ");
        int number = sc.nextInt();
        for(int j=0;j<10;j++)
        {
            if(arr[j] == number)
            {
                System.out.println("Found in Index "+j);
                break;
            }
        }
        
    }
}
