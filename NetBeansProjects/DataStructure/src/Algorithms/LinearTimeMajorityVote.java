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
public class LinearTimeMajorityVote
{
    
    static class Pointer{
        int number;
        char character;
        Pointer(char character){
            this.character = character;
            this.number = 1;
        }
    }
    
    private static char Function(char[] arr){
        Pointer p = new Pointer(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(p.number == 0){
                p.character = arr[i];
                p.number++;
                continue;
            }
            if(p.character != arr[i]){
                p.number--;
            }else{
                p.number++;
            }
        }
        return p.character;
    }
    
    public static void main(String[] args)
    {
        char[] arr = new char[]{'A','A','A','B','C','D','E'};
        char d = Function(arr);
        System.out.println(d);
    }
    
}
