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
public class LongestSlideDown {

    public static int longestSlideDown(int[][] pyramid) {
        // Code Goes Here..
        int i;
        int j;
        for(i = pyramid.length-1;i>0;i--)
        {
            //System.out.println("Enter");
        	for(j=0;j<i;j++)
          { 
             	pyramid[i-1][j] += Math.max(pyramid[i][j],pyramid[i][j+1]);
          }
        }
        return pyramid[0][0];
    }
    
    public static void main(String[] args)
    {
        int arr[][] = new int[][]{{3},{7,4},{2,4,6},{8,5,9,3}};
        int x = longestSlideDown(arr);
        System.out.println(x);
    }
    
}