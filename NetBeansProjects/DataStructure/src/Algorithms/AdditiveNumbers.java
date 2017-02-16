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
public class AdditiveNumbers
{
    public static boolean isAdditiveNumber(String num) {
        int x = Integer.parseInt(String.valueOf(num.charAt(0)));
        int y = Integer.parseInt(String.valueOf(num.charAt(1)));
        String sum = (x+y)+"";
        System.out.println(sum);
        for(int i=2;i<num.length();i++){
            int j = 0;
            while(j<sum.length()){
                if(sum.charAt(j) == num.charAt(i)){
                    i++;j++;
                }else{
                    return false;
                }
            }
            x = y;
            y = Integer.parseInt(sum);
            sum = (x+y)+"";
            System.out.println(sum);
            System.out.println(i+" "+j+" "+num.length());
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        System.out.println(isAdditiveNumber("11235"));
    }
    
}
