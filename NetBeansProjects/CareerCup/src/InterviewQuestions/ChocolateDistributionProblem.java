/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class ChocolateDistributionProblem
{
    private static int Function(int arr[],int m){
        Arrays.sort(arr);
        for(int i : arr)
            System.out.print(i+" ");
        System.out.println("");
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<=n-m;i++){
            if(arr[i+m-1] - arr[i] < min){
                min = arr[i+m-1] - arr[i];
                //System.out.println(arr[i]+" "+arr[i+m-1]);
            }
    }
        return min;
}
    
    private static int reverse(int x) {
        int flag = 0;
        int p = 0;
        if(x == 0)
            return 0;
        if(x < 0){
            flag = 1;
            x = -x;
        }
        while(x!=0){
            p = p*10+x%10;
            x = x/10;
            System.out.println(p);
        }
        if(flag == 1)
            p = -p;
        return p;
    }
    
    public static void main(String[] args)
    {
        int arrs[] = new int[]{12, 4, 7, 9, 2, 23, 25, 41,
                 30, 40, 28, 42, 30, 44, 48, 
                 43, 50}  ;
        int ms = 7;
        int p = Function(arrs, ms);
        System.out.println(p);
        int q = Integer.MIN_VALUE;
        while(q!=-1){
            System.out.println(q);
            q = q/2;
        }
        q = reverse(1534236469);
        System.out.println(q+" "+Integer.MAX_VALUE+" "+1534236469);
    }
}