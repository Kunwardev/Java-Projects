/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class Ch5BitManipulation
{
    private static boolean isPowerOfTwo(int x){
        if((x & (x-1)) == 0)
            return true;
        return false;
    }
    
    private static int countOnes(int p){
        int count = 0;
        while(p > 0){
            p = p &(p-1);
            count++;
        }
        return count;
    }
    
    private static boolean checkBitSet(int p,int i){
        if((p & (1<<i)) > 0)
            return true;
        return false;
    }
    
    private static void PRINT(int arr[],boolean tr[]){
        for(int i=0;i<arr.length;i++){
            if(tr[i] == true)
                System.out.print(arr[i]);
        }System.out.println();
    }
    
    private static void generateSubsets(int arr[],boolean tr[],int i){
        if(i == arr.length-1){
            tr[i] = false;
            PRINT(arr,tr);
            tr[i] = true;
            PRINT(arr,tr);
            return;
        }
        tr[i] = false;
        generateSubsets(arr, tr, i+1);
        tr[i] = true;
        generateSubsets(arr, tr, i+1);
    }
    
    private static int smallestPowerOf2(int N){
        N = N | N>>1;
        N = N | N>>2;
        N = N | N>>4;
        N = N | N>>8;
        return((N+1)>>1);
    }
    
    private static void rightMost1(int x){
        System.out.println((x & (-x)));
        System.out.println(x ^(x&(x-1)));
    }
    
    private static int sum(int a,int b){
        while(b!=0){
            int carry = a&b;
            a = a ^ b;
            b = carry<<1;
        }
        return a;
    }
    
    private static int check(int arr[],boolean tr[],int sum){
        int p = 0;
        for(int i=0;i<arr.length;i++){
            if(tr[i] == true)
                p += arr[i];
        }
        if(p == sum)
            return 1;
        return 0;
    }
    
    private static void subsetSum(int arr[],boolean tr[],int i,int sum){
        int flag = 0;
        if(i == arr.length-1){
            tr[i] = false;
            flag = check(arr,tr,sum);
            tr[i] = true;
            flag = check(arr,tr,sum);
        }else{
            tr[i] = false;
            subsetSum(arr, tr, i+1, sum);
            tr[i] = true;
            subsetSum(arr, tr, i+1, sum);
        }
        if(flag == 1)
            System.out.println("Yes, SUM exists");
        }
    
    private static int Conversion(int a,int b){
        int count = 0;
        for(int c=a^b;c!=0;c=c>>1)
            count+=(c&1);
        return count;
    }
    
    public static void main(String[] args){
        int z = 256;
        System.out.println(isPowerOfTwo(z));
        z = 255;
        System.out.println(countOnes(z));
        System.out.println(checkBitSet(8, 1));
        boolean tr[] = new boolean[4];
        Arrays.fill(tr,false);
        int arr[] = {1,2,3,4};
        generateSubsets(arr, tr, 0);
        int p = smallestPowerOf2(z);
        System.out.println(p);
        rightMost1(18);
        p = sum(8,9);
        System.out.println(p);
        Arrays.fill(tr,false);
        subsetSum(arr, tr, 0, 11);
        System.out.println(Conversion(31, 14));
    }
    
}
    