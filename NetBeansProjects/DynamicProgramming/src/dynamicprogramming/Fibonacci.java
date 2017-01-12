//Dp Memoization Technique
// In case of Bottom up, we call the array instead of 
//function
package dynamicprogramming;

import java.math.BigInteger;

public class Fibonacci
{
    static BigInteger arr[] = new BigInteger[50];
    public static BigInteger ans(int n)
    {
        BigInteger one = new BigInteger("1");
        BigInteger f = new BigInteger("1");
        arr[0] =f;
        arr[1] =f;
        if(n<2)
            return one;
        else
            f = ans(n-1).add(ans(n-2));
        arr[n] = f;
        return f;
    } 
    public static void main(String[] args)
    {
    int t = 35;
        BigInteger x = new BigInteger(t+"");
        x = ans(t);
        System.out.println(x);
        // TODO code application logic here
    }
    
}
