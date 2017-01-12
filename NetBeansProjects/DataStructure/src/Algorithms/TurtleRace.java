/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;
public class TurtleRace {
    public static int[] race(int v1, int v2, int g) {
        // your code
        int arr[] = new int[3];
        if(v1 >= v2 && g > 0)
        	return null;
        else
        {
        	double V = v2 - v1;
        	double tme = g/V;
          arr[0] = (int)tme;
          System.out.println(tme);
          arr[1] = (int) (tme * 60);
          tme = tme*60;
          arr[2] = (int) ((tme - (int)tme)*60);
          System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
        }
        return arr;
    }
    
    public static void main(String[] args)
    {
        int arr[] = race(720,850,70);
    }
    
}
