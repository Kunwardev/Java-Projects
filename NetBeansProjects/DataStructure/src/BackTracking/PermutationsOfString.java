/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BackTracking;

/**
 *
 * @author Kunwar
 */
public class PermutationsOfString
{
    private static void swap(char[]a,int i,int j){
        char z = a[i];
        a[i] = a[j];
        a[j] = z;
    }
    
    private static void Function(String a){
        char[] x = a.toCharArray();
        Helper(x,0,a.length());
    }

    private static void Helper(char[] x,int l,int r)
    {
        if(l == r){
            for(int i=0;i<r;i++)
                System.out.print(x[i]);
        System.out.println("");
        }
            
        for(int i=l;i<r;i++){
            swap(x,l,i);
            Helper(x,l+1,r);
            swap(x,l,i);
        }
    }
    
    public static void main(String[] args)
    {
        Function("ABC");
    }
    
}
