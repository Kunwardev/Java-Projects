package BOOK;

public class THREAD implements Runnable
{

    public void run()
    {
        for(int i =0;i<2000;i++)
        {
            System.out.println(i);
        }
    } 
}

class THREAD1
{
    public static void main(String[] args)
    {
        Thread t2 = new Thread();
         Thread t1 = new Thread(new THREAD());
        t1.start();
        for(int i=0;i<1000;i++)
        {System.out.println("NO"+i);
        }   
    }
}