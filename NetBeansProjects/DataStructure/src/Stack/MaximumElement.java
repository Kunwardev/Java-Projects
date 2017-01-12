/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stack;

/**
 *
 * @author Kunwar
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaximumElement {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Stack<Integer> st = new Stack<>();
        Stack<Integer> ma = new Stack<>();
        int Query,operation,number,max = Integer.MIN_VALUE;
        Scanner in = new Scanner(System.in);
        Query = in.nextInt();
        for(int i=0;i<Query;i++){
            operation = in.nextInt();
            if(operation == 1){
                number = in.nextInt();
                if(st.isEmpty()){
                    max = number;
                    ma.push(max);
                    st.push(number);
                }
                else{
                    if(number > ma.peek()){
                        max = number;
                    }
                    else
                        max = ma.peek();
                    ma.push(max);
                    st.push(number);
                }
            }
            else if(operation == 2){
                ma.pop();
                st.pop();
            }
            else{
                System.out.println(ma.peek());
            }
        }
    }
}