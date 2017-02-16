/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions;

/**
 *
 * @author Kunwar
 */
public class minSubArrayLen
{
    public static int MinSubArrayLen(int s, int[] nums) {
    if(nums==null || nums.length==1)
        return 0;
 
    int result = nums.length;
 
    int start=0;
    int sum=0;
    int i=0;
    boolean exists = false;
 
    while(i<=nums.length){
        if(sum>=s){
            exists=true; //mark if there exists such a subarray 
            if(start==i-1){
                return 1;
            }
 
            result = Math.min(result, i-start);
            sum=sum-nums[start];
            start++;
 
        }else{
            if(i==nums.length)
                break;
            sum = sum+nums[i];
            i++;    
        }
    }
 
    if(exists)
        return result;
    else
        return 0;
}
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{2,3,1,2,4,3};
        int p = MinSubArrayLen(7,arr);
        System.out.println(p);
    }
    
}
