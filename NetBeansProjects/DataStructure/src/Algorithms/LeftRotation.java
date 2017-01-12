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
public class LeftRotation
{
    public static void main(String[] args)
    {
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9,0};
        for(int k=0;k<2;k++)
        {int temp = arr[0];
        for (int i = 0; i < 9; i++)
        {
            arr[i] = arr[(i+1)%10];
        }
        arr[9] = temp;}
        for(int j: arr)
            System.out.print(j+" ");
    }
}
