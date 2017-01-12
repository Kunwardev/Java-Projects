
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunwar
 */
public class HCFusingEuclid
{
    public static int HCF(int m,int n)
    {
        if(m<n)
        {
            int temp = m;
            m = n;
            n = temp;
        }
        while(m%n!=0)
        {
            int r = m%n;
            n = m;
            m = r;
        }
        return m;
    }
    public static void main(String[] args)
    {
        int m,n;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        int result = HCF(m, n);
        System.out.println("HCF of "+m+" & "+n+" -> "+result);
    }
}
