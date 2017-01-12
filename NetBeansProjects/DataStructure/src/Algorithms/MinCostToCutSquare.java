/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Kunwar
 */


public class MinCostToCutSquare 
{
    private static int Cut(int X[],int Y[],int m,int n){
        int res = 0;
        Arrays.sort(X);Arrays.sort(Y);
        for(int i=0;i<m/2;i++){
            int temp = X[i];
            X[i] = X[m-i-1];
            X[m-i-1] = temp;
        }
        
        for(int i=0;i<n/2;i++){
            int temp = Y[i];
            Y[i] = Y[n-i-1];
            Y[n-i-1] = temp;
        }
        int hzntl = 1,vrtcl = 1;
        int i=0,j=0;
        while(i<m && j<n){
            if(X[i] > Y[j]){
                res+= X[i] * vrtcl;
                hzntl++;
                i++;
            }else{
                res+=Y[j] * hzntl;
                vrtcl++;
                j++;
            }
        }
        int total = 0;
        while(i<m){
            total += X[i++];
        }
        res+=total*vrtcl;
        total = 0;
        while(j<n){
            total += Y[j++];
        }
        res+=total*hzntl;
        return res;
        }
    
    public static void main(String[] args)
    {
        int X[] = new int[]{2,1,3,1,4};
        int Y[] = new int[]{4,1,2};
        int n=5,m=3;
        int p = Cut(X,Y,n,m);
        System.out.println(p);
    }
    
}
