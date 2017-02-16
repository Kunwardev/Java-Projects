/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackerrank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Kunwar
 */
public class TeamFormation
{
 public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int T,i;
        Scanner in = new Scanner(System.in);
        T = in.nextInt();
        for(i=0;i<T;i++){
            int n = in.nextInt();
            if(n == 0){
                System.out.println(n);
            }else if(n==1){
                int a = in.nextInt();
                System.out.println(n);
            }else{
            int[] arr = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = in.nextInt();
            }Arrays.sort(arr);
            ArrayList<Integer> AL = new ArrayList<Integer>();
            int k =0,min = Integer.MAX_VALUE;
            while(k <= n-1){
                if(k == n-1){
                    if(arr[n-1]-arr[n-2] == 1){
                        AL.add(arr[n-2]);
                        AL.add(arr[n-1]);
                    }else{
                       min = 1;
                    }
                    
                }else{
                if(arr[k+1]-arr[k]==1){
                    AL.add(arr[k]);
                    AL.add(arr[k+1]);
                    k++;
                }else{
                    AL.add(k);
                    if(min > AL.size()){
                        min = AL.size();
                    }
                    AL = new ArrayList<Integer>();
                }
                }
                k++;
            }
            if(min == Integer.MAX_VALUE)
                min = n;
            System.out.println(min);
            }
        }
    }
}