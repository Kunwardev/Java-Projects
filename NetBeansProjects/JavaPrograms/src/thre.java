
import org.omg.SendingContext.RunTime;

public class thre implements Runnable
{

    public void run()
    {
        for(int i = 0 ;i<10;i++)
        {
            System.out.println(i);
        }
        System.out.println("thre completed");
    }
    public static void main(String[] args)
    {
        AAA a = new AAA();
        BB b  = new BB();
        thre t = new thre();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(t);
           t2.start();
            t1.start();
        t3.start();
   
       
    }
    
}

class AAA implements Runnable
{

    public void run()
    {
        for(int i = 0;i<10;i++)
            System.out.println(i);
        System.out.println("AAA completed");
    }
    
}

class BB implements Runnable
{
    public void run()
    {
        for(int i =0 ;i<10;i++)
            System.out.println(i);
        System.out.println("BB completed");
    }
}