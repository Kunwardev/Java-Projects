import java.util.Stack;

public class Stackss
{
    public static void main(String[] args)
    {
        Stack <Integer> a = new Stack<>();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        System.out.println(a.peek());
        System.out.println(a);
        System.out.println(a.search(2));
        System.out.println(a.search(9));
        a.pop();
        a.push(5);
        a.push(7);
        a.search(2);
        System.out.println(a);
    }
}
