
package Algorithms;

public class Lastdigitofapowerb
{
    
    public static void main(String[] args)
    {
        System.out.println(LastDigit("123435356156437","35464536345654"));
    }
    
    public static int Mod(int A,String x)
    {
        int mod = 0;
        
        for(int i=0;i<x.length();i++)
        {
            mod = (mod*10+(x.charAt(i)-'0'))%A;
        }
        return mod;
    }
    
    public static int LastDigit(String a,String b)
    {
        int len_a = a.length();
        int len_b = b.length();
        if(len_a == 1 && len_b == 1 && a.charAt(0) == '0' && b.charAt(0) == '0')
            return 1;
        if(len_a ==1 && a.charAt(0) == '0')
            return 0;
        if(len_b ==1 && b.charAt(0) == '0')
            return 1;
        
        int exp = (Mod(4,b) == 0)?4: Mod(4,b);
        int res = (int) Math.pow(a.charAt(len_a-1) -'0',exp);
        return res % 10;
    }
}
