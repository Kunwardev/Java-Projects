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
public class NextSmallerNumberWIthSameDigit
{
    private static int Function(int x){
        int p = (int)Math.ceil(Math.log10(x));
        int digits[] = new int[p];
        for(int i=0;i<p;i++){
            digits[i] = x%10;
            x = x/10;
        }
        int flag = 1;
        for(int i=0;i<p-1;i++){
            for(int j=i+1;j<p;j++){
                if(digits[i] < digits[j]){
                    int temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                    flag = 0;
                    break;
                }
                if(flag == 0)
                    break;
            }
            if(flag == 0)
                break;
        }
        
        int number = 0;
        for(int i=0;i<p;i++){
            number = number*10 + digits[i];
        }
        
        return number;
    }
    
    public static void main(String[] args)
    {
        int x = Function(4321);
        System.out.println(x);
    }
    
}
