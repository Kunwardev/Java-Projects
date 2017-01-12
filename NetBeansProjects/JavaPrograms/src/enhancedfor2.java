public class enhancedfor2
{
    public static void main(String[] args)
    {
    int num[] = {10,9,8,7,6,5,4,3,2,1};
    for(int x : num)   {
        System.out.println(x);
        try
        {
        Thread.sleep(1000);
    }catch(Exception ex)
    {}
    }
        System.out.println("Boom");
}
}
