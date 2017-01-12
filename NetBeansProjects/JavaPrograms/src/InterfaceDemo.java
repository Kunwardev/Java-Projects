interface int1
{
    int a =5;
    void display();
    void hello();
}

class child implements int1
{
    void show()
    {
        System.out.println("show Method");
    }
    public void display()
    {
        System.out.println("display Method");
    }
    public void hello()
    {
        System.out.println("Hello Method");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        child c1 =new child();
        int1 i1;
        i1 = c1;
        i1.display();
        i1.hello();
        c1.show();
        System.out.println("a = "+i1.a);
    }
}
