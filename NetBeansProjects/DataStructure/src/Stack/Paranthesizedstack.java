
import java.util.Scanner;
import java.util.Stack;

public class Paranthesizedstack {
    
    public static boolean isBalanced(String expression) {
        Stack<Character> st = new Stack<>();
    
        for(int i=0;i<expression.length();i++){
            char removed = expression.charAt(i);
            if(removed == '(' || removed == '[' || removed == '{')
                st.push(removed);
            else{
                if(st.isEmpty())
                    return false;
                char other = st.pop();
                if(removed == ')' && other != '(')
                    return false;
                else if(removed == ']' && other != '[')
                    return false;
                else if(removed == '}' && other != '{')
                    return false;
            }
            
        }
        if(st.isEmpty())
            return true;
        return false;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
