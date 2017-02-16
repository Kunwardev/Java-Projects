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
public class PartitionInDivisibleSets
{
    private static void Function(String str, int a, int b){
        int len = str.length();
        int[] lr = new int[len+1];
        int[] rr = new int[len+1];
        lr[0] = (str.charAt(0)-'0')%a;
        for(int i=1;i<len;i++){
            lr[i] = ((lr[i-1]*10)%a + (str.charAt(i)-'0'))%a;
        }
        rr[len-1] = (str.charAt(len-1)-'0')%b;
        int power10 = 10;
        for(int i=len-2;i>=0;i--){
            rr[i] = (rr[i+1] + (rr[i]-'0')*power10)%b;
            power10 = (power10 * 10)%b;
        }
        
        for(int i=0;i<len-1;i++){
            if(lr[i] != 0)
                continue;
            if(rr[i+1] == 0){
                System.out.println("Yes");
                System.out.print(str.substring(0, i+1)+" , ");
                System.out.println(str.substring(i+1));
            }  
        }
        System.out.println("No");
    }
    
    private static void OtherFunction(String str, int a, int b){
        int length = str.length();int flag = 0;
        for(int i=1;i<length;i++){
            int x = Integer.parseInt(str.substring(0,i));
            int y = Integer.parseInt(str.substring(i,length));
            if((x % a ==0) && (y % b==0)){
                flag = 1;
                System.out.println("Yes");
                System.out.println(x+" ,    `" +y);
            }
        }
        if(flag ==0)
            System.out.println("No");
    }
    
    public static void main(String[] args)
    {
        String str = "123";
        Function(str, 4, 3);
        OtherFunction(str, 4, 3);
    }
    
}
