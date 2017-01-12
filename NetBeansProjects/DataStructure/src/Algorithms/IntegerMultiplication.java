package Algorithms;

public class IntegerMultiplication
{
    
    public static int Multiply(int x,int y)
    {
        if(y > x)
        {
            int tm = x;
            x = y;
            y = tm;
        }
        int i=0,z,prod=0;
        while(y!=0)
        {
            z = y%10;
            z = z * (int)Math.pow(10, i);
            i++;
            y = y/10;
            prod += z * x;
        }
        return prod;
    }
    
    public static void main(String[] args)
    {
        System.out.println(Multiply(1234,5678));
    }
}
