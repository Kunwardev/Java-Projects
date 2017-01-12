import java.util.Vector;

public class vectors
{
    public static void main(String[] args)
    {
        Vector<String> name = new Vector<String>();
        name.add("Hello ");
        name.add("This is ");
        name.add("My first ");
        name.add("Use of ");
        name.add("VECTORS");
        int a = name.size();
        for(String x:name)
        {
            System.out.print(x);
        }
    }
}
