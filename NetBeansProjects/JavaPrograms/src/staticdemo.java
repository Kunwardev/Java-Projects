public class staticdemo
{
    private String first;
    private String last;
    private static int members = 0;
    public staticdemo(String fn,String ln)
    {
        first =fn;
        last = ln;
        members++;
    }
    void call()
    {
        System.out.println("The name is "+first+" "+last);
        System.out.println("Members in the club "+members);
    }
    public static void main(String[] args) {
   staticdemo ob1 = new staticdemo("Natalie","Portman");
   ob1.call();
   staticdemo ob2 = new staticdemo("Eva","Greene");
   ob2.call();
   staticdemo ob3 = new staticdemo("Jessica","Alba");
   ob3.call();
   staticdemo ob4 = new staticdemo("Britney","Spears");
   ob4.call();
   
}
}
