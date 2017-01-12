/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;

/**
 *
 * @author Kunwar
 */
public class ch5Question6
{
    private static int swapEven(int a){
        System.out.println(0xaaaaaaaa);
        return (a&(0xaaaaaaaa))>>1;
    }
    
    private static int swapOdd(int a){
        System.out.println(0x55555555);
        return (a&(0x55555555))>>1;
    }
    
    private static int Merge(int a,int b){
        return a|b;
    }
    
    public static void main(String[] args)
    {
        int a = 154;
        System.out.println(Integer.toBinaryString(a));
        int p = swapEven(a);
        int q = swapOdd(a);
        int r = Merge(p, q);
        System.out.println(Integer.toBinaryString(r));
        System.out.println(r);
    }
    
}
