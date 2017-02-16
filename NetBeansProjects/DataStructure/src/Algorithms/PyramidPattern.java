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
public class PyramidPattern
{
    private static void Print(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print((i+1)+" ");
            }System.out.println("");
        }
    }
    
    public static void main(String[] args)
    {
        Print(3);
    }
    
}
