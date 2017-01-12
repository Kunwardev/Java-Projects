package Algorithms;

public class Cuberoot
{
    public static double diff(double N,double mid)
    {
        if(N > mid*mid*mid)
            return N - mid*mid*mid;
        else
            return mid*mid*mid - N;
    }
    
    public static double Cuberoot(int N)
    {
        double start = 0;
        double end = N;
        double e = 0.0000001;
        while(true)
        {
            double mid = (start+end)/2;
            double error = diff(N, mid);
            if(error <= e)
                return mid;
            if(mid*mid*mid > N)
                end = mid;
            else
                start = mid;
        }
    }
    
    public static void main(String[] args)
    {
        System.out.println(Cuberoot(1000));
    }
    
    
}
