/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kunwar
 */
public class BeautifulTriplets
{
    static int count = 0;
    private static void check(int arr[],int p,int d){
        int x = arr[p] + d;
        for(int i=p+1;i<arr.length;i++){
            if(arr[i] == x){
                x = x + d;
                for(int j=i+1;j<arr.length;j++){
                    if(x == arr[j])
                        {
                        count++;
                        return;
                    }else if(arr[j] > x)
                        return;
                }
            }else if(arr[i] > x)
                return;
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,d,input;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        d = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        for(int i=0;i<arr.length;i++){
            check(arr,i,d);
        }
        System.out.println(count);
    }
}
