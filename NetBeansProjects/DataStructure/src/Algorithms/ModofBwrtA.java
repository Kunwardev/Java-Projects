package Algorithms;

public class ModofBwrtA
{
    public static void Mod(int A,String x)
    {
        int mod = 0;
        
        for(int i=0;i<x.length();i++)
        {
            mod = (mod*10+(x.charAt(i)-'0'))%A;
        }
        System.out.println(mod);
    }
    
    public static void main(String[] args)
    {
        Mod(4,"15479681548132184518416453185132851");
    }
    
}
