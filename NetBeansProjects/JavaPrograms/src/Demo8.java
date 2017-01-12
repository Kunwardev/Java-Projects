import java.util.*;

public class Demo8
{
    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<>();
        HashSet<String> hl = new HashSet<>();
        
        al.add("abc");
        al.add("pqr");
        al.add("mno");
        
        hl.add("abc");
        hl.add("pqr");
        hl.add("mno");
        hl.add("jkp");
        
        System.out.println("Value in arrayList: ");
        for (int i = 0; i < al.size(); i++)
        {
            System.out.println(al.get(i));
        }
        System.out.println("Values in Hash set: ");
            Iterator it = hl.iterator();
            while(it.hasNext())
            {
                System.out.println(it.next().toString());
            }
        
    }
}
