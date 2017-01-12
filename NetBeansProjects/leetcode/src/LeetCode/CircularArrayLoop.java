/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LeetCode;

/**
 *
 * @author Kunwar
 */
public class CircularArrayLoop
{
    public static int getIndex(int index, int[] nums){
        int length = nums.length;
        if(nums[index] > 0)
            return (index + nums[index])%length;
        return (length + nums[index])%length;
    }
    
    public static boolean circularArrayLoop(int[] nums) {
        int length = nums.length;
        int index = 0;
        int count = 0;
        int next = getIndex(index, nums);
        int forward = (nums[index] > 0)?1:0;
        while(count < length){
            System.out.println(index+" "+next);
            if(forward == 1){
                //System.out.println("In");
                if(index > next){
                    for(int i=index;i<length;i++)
                    {
                        //System.out.println("Inside");
                        nums[i] = 0;}
                }
                for(int i=index;i<next;i++)
                    nums[i] = 0;
                index = next;
                next = getIndex(index, nums);
            }else{
                
                if(index < next){
                    System.out.println("On");
                    for(int i=index;i<next;i++)
                        nums[i] = 0;
                }
                for(int i=next;i>index;i--){
                    nums[i] = 0;
                }
                index = next;
                next = getIndex(index,nums);
            }
            if(index == next)
                return false;
            count++;
        }
        for(int i=0;i<length;i++){
            if(nums[i] != 0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{2, -1, 1, 2, 2};
        System.out.println(circularArrayLoop(arr));
        
    }
    
}
