/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynamicprogramming;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class BuildingBridge
{
    private static int Function(int north[]){
        int LIS[] = new int[north.length];
        Arrays.fill(LIS, 1);
        for(int i=1;i<north.length;i++){
            for(int j=0;j<=i;j++){
                if(north[i] > north[j] && LIS[i] < LIS[j]+1)
                    LIS[i] = LIS[j]+1;
            }
        }
        int max = 0;
        for(int i=0;i<north.length;i++){
            if(max < LIS[i])
                max = LIS[i];
        }
        return max;
    }
    
    public static void main(String[] args)
    {
        int north[] = new int[]{8,1,4,3,2,5,6,7};
        System.out.println(Function(north));
    }
        
}
