/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;

/**
 *
 * @author Kunwar
 */
public class ch8Question5
{
    private static void PrintParanthesis(int pos,int n,int open,int close,char str[]){
        if(close == n){
            System.out.println(str);
            return;
        }else{
            if(open > close){
                str[pos] = ')';
                PrintParanthesis(pos+1, n, open, close+1, str);
            }
            if(open < n){
                str[pos] = '(';
                PrintParanthesis(pos+1,n, open+1, close, str);
            }
        }
    }
    
    public static void main(String[] args)
    {
        char str[] = new char[8];
        PrintParanthesis(0, 4, 0, 0, str);
    }
    
}
