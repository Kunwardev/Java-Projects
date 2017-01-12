
package Algorithms;

public class PowerSet
{
    
    public static void PowerSet(String a)
    {
        int power =(int) Math.pow(2, a.length());
        for(int i=0;i<power;i++)
        {
            for(int j=0;j<a.length();j++)
            {
                if(((1<<j)&(1)) >= 1)
                    System.out.print(a.charAt(j));
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args)
    {
        PowerSet("abc");
    }
}
