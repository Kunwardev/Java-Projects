/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions;

/**
 *
 * @author Kunwar
 */
public class StringProblem
{
    /*
        Q2. Given a string S and two indexes i & j, modify the string in a pattern such that:
        characters from [0 to i] index are now at back of the string.
        characters from [j till end of string] are in front of string.
        e.g. S = “abcdef” and i=1, j=3.
        Output should be: “defcab”
        Constraint: Constant Space.
    */
    
    private static String Function(String s,int i,int j){
        String x = s.substring(j) + s.substring(i+1,j)+s.substring(0,i+1);
        return x;
    }
    
    public static void main(String[] args)
    {
        String y = Function("abcdef",1,3);
        System.out.println(y);
    }
    
}
