/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynamicprogramming;

/**
 *
 * @author Kunwar
 */
public class RodCuttingBottomUp
{
    
    public static void CutRod(int p[],int n)
    {
        int r[] = new int[n+1];
        int s[] = new int[n+1];
        r[0] = 0;
        //int s[] = new int[n];
        for(int j=1;j<=n;j++)
        {
            int q = 0;
            for(int i=1;i<=j;i++)
            {
                if(q < (p[i] + r[j-i]))
                {
                    q = p[i] + r[j-i];
                    s[j] = i;
                    //System.out.println(q);
                }
            }
            r[j] = q;
        }
        System.out.println(r[n]);
        while(n>0)
        {
            System.out.print(s[n]+" ");
            n = n-s[n];
        }
    }
    
    public static void main(String[] args)
    {
        int p[] = {0,1,5,8,9,10,17,17,20,24,30};
        CutRod(p,4);        
    }
    
}
