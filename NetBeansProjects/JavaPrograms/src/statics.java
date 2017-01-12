public class statics
{
    int a = 5;
    static int b =6;
    void show()
    {
        System.out.println("a is "+a);
        System.out.println("b is "+b);
    }
    static void display()
    {
        statics x = new statics();
        System.out.println("a is "+x.a);
        System.out.println("b is "+b);
    }
    public static void main(String[] args) 
    {
        statics y = new statics();
        y.show();
        y.display();
    }

         
}
