/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions;

/**
 *
 * @author Kunwar
 */
public class Consecutive0Flips
{
    private static void Count(int arr[],int m){
        // Left and right indexes of current window
        int wL = 0, wR = 0; 
        int n = arr.length;
    // Left index and size of the widest window 
        int bestL = 0, bestWindow = 0; 
 
    // Count of zeroes in current window
        int zeroCount = 0; 
        
        while (wR < n)
    {
        // If zero count of current window is less than m,
        // widen the window toward right
        if (zeroCount <= m)
        {
            if (arr[wR] == 0)
              zeroCount++;
            wR++;
        }
 
        // If zero count of current window is more than m,
        // reduce the window from left
        if (zeroCount > m)
        {
            if (arr[wL] == 0)
              zeroCount--;
            wL++;
        }
 
        // Updqate widest window if this window size is more
        if (wR-wL > bestWindow)
        {
            bestWindow = wR-wL;
            bestL = wL;
        }
    }
        for (int i=0; i<bestWindow; i++)
    {
        if (arr[bestL+i] == 0)
            System.out.print(bestL+i+" ");
    }
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{1, 1, 0, 1, 1, 0, 0, 1, 1, 1};
        Count(arr, 2);
    }
   
}