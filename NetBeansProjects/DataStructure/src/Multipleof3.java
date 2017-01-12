public class Multipleof3
{
    public static void main(String[] args) {
     int y = Function(88);
     if(y == 1)
            System.out.println("Yes");
     else
            System.out.println("No");
}
    public static int Function(int n)
    {
           int odd_count=0,even_count=0;
        
        if(n == 0)
            return 1;
        else if (n == 1)
            return 0;
        while(n!=0)
        {if((n&1) == 1)
        {
            odd_count++;
            n = n>>1;
        }
        else
        {
            even_count++;
            n = n>>1;
        }}
        return Function(Math.abs(even_count-odd_count));
    }
}
