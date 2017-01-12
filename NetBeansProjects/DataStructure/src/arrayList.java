import java.util.ArrayList;

public class arrayList
{
    public static void main(String[] args)
    {
        ArrayList ar = new ArrayList();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        Object a = ar.get(0);
        Object b = ar.get(1);
        System.out.println(Integer.valueOf(a.toString()) + Integer.valueOf(b.toString()));
    }
}








