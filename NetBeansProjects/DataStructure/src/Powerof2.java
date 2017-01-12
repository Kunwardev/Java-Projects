public class Powerof2
{
    public static int LOG(int n)
    {
        int x = (int) Math.ceil( Math.log(n)/Math.log(2));
        return (int) Math.pow(2, x);
    }
    
    public static void main(String[] args) {
        int x = 17;
        int count = 0;
        int y = LOG(x);
        System.out.println(y);
        while(x!=0)
        {
            x/=2;
            count++;
        }
        System.out.println((int)Math.pow(2,count));
}
}
