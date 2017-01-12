/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

/**
 *
 * @author Kunwar
 */
public class CombinationsOfBalancedParanthesis
{
    public static void printParenthesis(int pos,int n,int open,int close,char arr[]){
        //System.out.println("Function Starts");
        if(close == n)
        {
            for(char i: arr)
                System.out.print(i);
            //System.out.println("1");
        }
        else
        {if(open > close)
        {
            arr[pos] = '}';
            printParenthesis(pos+1,n,open,close+1,arr);
            //System.out.println("2");
        }
        if(open < n)
        {
            arr[pos] = '{';
            printParenthesis(pos+1,n,open+1,close,arr);   
        }   
        }
    }
    
    public static void main(String[] args)
    {
        char arr[] = new char[10];
        printParenthesis(0, 4, 0, 0,arr);
    }
    
}
