package dynamicprogramming;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunwar
 */
public class CH19P1
{
    static int arr[] = new int[100];
    public static int Code(int n)
    {
        
        arr[0] = arr[1] = 2;
        {
            for(int i=2;i<=n;i++)
            {
                arr[i] = 0;
                for(int j=1;j<i;j++)
                    arr[i] += 2*(arr[j]*arr[j-1]);
            }
        }
        return arr[n];
    }
    
    public static void main(String[] args)
    {
        int l = Code(3);
        System.out.println(l);
    }
    
}
