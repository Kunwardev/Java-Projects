/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stack;

import java.util.Stack;

/**
 *
 * @author Kunwar
 */
public class MaxDifferenceBwLeftRight
{
    private static int[] RightSmall(int[] arr){
        int[] RS = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1;i >= 0; i--){
            int next = arr[i];
            while(!st.isEmpty() && st.peek() >= next){
                st.pop();
            }
            if(!st.isEmpty())
                RS[i] = st.peek();
            else
                RS[i] = -1;
            st.push(next);
        }
        return RS;
    }
    
    private static int[] LeftSmall(int[] arr){
        int[] LS = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            int next = arr[i];
            while(!st.isEmpty() && st.peek() >= next)
                st.pop();
            if(!st.isEmpty())
                LS[i] = st.peek();
            else
                LS[i] = -1;
            st.push(next);
        }
        return LS;
    }
    
    private static int Max(int[] LS, int[] RS){
        int max = 0;
        for(int i=0;i<LS.length;i++){
            if(max < Math.abs(LS[i]-RS[i]))
                max = Math.abs(LS[i]-RS[i]);
        }
        return max;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{2,4,8,7,7,9,3};
        int[] LS = LeftSmall(arr);
        int[] RS = RightSmall(arr);
        for(int i: LS){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int j: RS){
            System.out.print(j+" ");
        }
        System.out.println();
        int p = Max(LS, RS);
        System.out.println(p);
    }
    
}
