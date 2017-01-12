abstract class abc
{
    abstract void show();
    abstract void test();
    void display()
    {
        System.out.println("Display Method");
    }
}

class pqr extends abc
{
    int a =5;
    void hello()
    {
        System.out.println("Hello Method");
    }
    void show()
    {
        System.out.println("show Method");
    }
    void test()
    {
        System.out.println("test Method");
    }
}

public class abstracted
{    
    public static void main(String[] args) 
    {
        abc o1;
        pqr o2 = new pqr();
        o1 = o2;
        o1.display();
        o1.show();
        o1.test();
        System.out.println(o2.a);
    }
}
