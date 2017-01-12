import java.util.*;
public class Alist 
{
    public static void main(String[] args) {
       
    ArrayList<String> al = new ArrayList<>();
    al.add("Abc");
    al.add("Paq");
    al.add("Qza");
        System.out.println("Size is "+al.size());
        String x = "Hello";
        al.add(x);
        
        for(int i =0;i<al.size();i++)
            System.out.println(al.get(i));
}
}
