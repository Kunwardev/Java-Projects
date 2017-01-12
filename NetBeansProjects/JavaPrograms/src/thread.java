class A extends Thread
{
    public void run(){
    for(int i = 0;i<1000;i++)
    {
        System.out.println("A Thread "+i);
    }System.out.println("A completed");
     
    }
}

class B extends Thread
{
    public void run(){
    for(int i = 0;i<1000;i++)
    {
        System.out.println("B Thread "+i);
    }System.out.println("B completed");
     
    }
}

class C extends Thread
{
    public void run(){
    for(int i = 0;i<1000;i++)
    {
        System.out.println("C Thread "+i);
    }System.out.println("C completed");
     
    }
}

public class thread {
    public static void main(String[] args) {
    A t1=new A();
    B t2=new B();
    C t3=new C();
    
    t1.start();
    t2.start();
    t3.start();
}
}