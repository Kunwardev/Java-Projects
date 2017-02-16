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
public class Multiplication
{
    private static int minProduct(int a,int b){
        int bigger = a < b ? b : a;
        int smaller = a > b ? b : a;
        return minProdHelp(smaller,bigger);
    }
    
    private static int minProdHelp(int smaller, int bigger){
        if(smaller == 0)
            return 0;
        if(smaller == 1)
            return bigger;
        
        int s = smaller >> 1;
        int side1 = minProdHelp(s, bigger);
        int side2 = side1;
        if(smaller%2 == 1){
            side2 = minProdHelp(smaller-s, bigger);
        }
        System.out.println(side1+" "+side2+" "+s+" "+smaller);
        return side1 + side2;
    }
    
    public static void main(String[] args){
        int a = 6,b=8;
        System.out.println(minProduct(a, b));
    }
    
}
