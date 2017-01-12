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
public class ch8Question2
{
    private static int Paths(int m,int n){
        int x;
        if(m == 1 || n == 1)
            return 1;
        else{
            x = Paths(m-1,n) + Paths(m,n-1);
        }
        return x;
    }
    
    public static void main(String[] args)
    {
        int y = Paths(3,3);
        System.out.println(y);
    }
    
}
