
package graohics;

public class job implements Runnable
{
    public void run()
    {
        try{
        for(int i =0;i<10;i++)
        {
            System.out.println("Value :"+i);
            Thread.sleep(1000);
        }}catch(Exception ex){}
    }
}
