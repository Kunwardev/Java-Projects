public class methodover 
{
    void sum(int a)
    {
        System.out.println("The square of "+ a+" is "+(a*a));
    }
    
    int sum(int a,int b)
    {
        System.out.println("in int,int");
        return a+b;
    }
    
    double sum(int a,double b)
    {
        System.out.println("in int,double");
        return a+b;
    }
    
    float sum(float a,float b)
    {
        System.out.println("in float,float");
        return a+b;
    }
    public static void main(String[] args)
    {
        methodover a = new methodover();
        a.sum(5);
        int x =a.sum(5,6);
        System.out.println(x);
        x = a.sum('A','B');
        System.out.println(x);
        float y = a.sum(5.4f,6.6f );
        System.out.println(y);
    }
}
