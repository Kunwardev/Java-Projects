package BOOK;

public class Thereadeg1
{
    public static void main(String a[])
    {
        Thread t = Thread.currentThread();
        System.out.println("t = "+t.getName());
        t.setName("Helo Thread");
        System.out.println("New thread: "+t);
        try{
        for (int i = 0; i < 10; i++)
        {
            Thread.sleep(1000);
            System.out.println(i);
        }}catch(Exception w){}
    }
}
