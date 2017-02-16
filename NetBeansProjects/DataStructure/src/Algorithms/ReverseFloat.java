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
public class ReverseFloat
{
    private static float reverse(float a){
        String supp = String.valueOf(a);
        String checker[] = supp.split("\\.");
        
        int x = Integer.parseInt(checker[1]);
        int y = Integer.parseInt(checker[0]);
        
        int z1=0,z2=0;
        while(x!=0){
            z1 =z1*10 + x%10;
            x = x/10;
        }
        while(y!=0){
            z2 = z2*10 + y%10;
            y = y/10;
        }
        supp = z1+"."+z2;
        return Float.parseFloat(supp);
    }
    
    public static void main(String[] args)
    {
        float x = 152.234f;
        System.out.println(reverse(x));
    }
    
}
