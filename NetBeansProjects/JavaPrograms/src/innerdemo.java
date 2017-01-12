class outer
{
    int a = 5;
    void show()
    {
        System.out.println("Show Method");
    }
    void display()
    {
        System.out.println("Display Method");
    }
    class inner
    {
        int a =10;
        void display()
        {
            System.out.println("Display Method");
        }
        void test()
        {
            int a = 15;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(outer.this.a);
        }
    }
}

public class innerdemo 
{
    public static void main(String[] args) {
        outer oc = new outer();
        outer.inner ic = oc.new inner();
        oc.show();
        ic.display();
        ic.test();
        oc.display();
    }
}
