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
public class SeatingArrangement
{
    private static boolean Function(int[] arr){
        boolean result = false;
        for(int i=0;i<arr.length;i++){
            if(i == 0 && arr[i] == 1){
                if(arr[i+1] != 1)
                    arr[i+1] = 2;
            }else if(i > 0 && arr[i] == 1){
                if(arr[i-1] != 1)
                    arr[i-1] = 2;
                if(arr[i+1] != 1)
                    arr[i+1] = 2;
            }else if(i == arr.length-1 && arr[i] == 1){
                if(arr[i-1] != 1){
                    arr[i-1] = 2;
                }
            }
        }
        for(int i: arr){
            System.out.print(i+" ");
        }
        return result;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[] {1,0,0,1,0,0,1,0,0};
        Function(arr);
    }
    
}
