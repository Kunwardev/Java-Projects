/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynamicprogramming;

/**
 *
 * @author Kunwar
 */
public class NumberOfSteps
{
    private static int StepsDp(int n){
        int[] Answer = new int[n+1];
        Answer[0] = 1;
        for(int i=1;i<=n;i++){
            if(i<2){
            Answer[i] = Answer[i-1];
            }else if(i<3){
                Answer[i] = Answer[i-1]+Answer[i-2];
            }else{
                Answer[i] = Answer[i-1]+Answer[i-2]+Answer[i-3];
            }
        }
        return Answer[n];
    }
    
    private static int Steps(int n){
        if(n==0)
            return 1;
        if(n < 0)
            return 0;
        return Steps(n-1)+Steps(n-2)+Steps(n-3);
    }
    
    public static void main(String[] args)
    {
        int x = 10;
        System.out.println(Steps(4));
        System.out.println(StepsDp(4));
    }
    
}
