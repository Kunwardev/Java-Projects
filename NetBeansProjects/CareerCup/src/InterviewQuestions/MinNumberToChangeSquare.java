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
import java.util.Arrays;
public class MinNumberToChangeSquare
{
    private static int Function(int p){
        int sum = 1;
        int x = p;
        int count[] = new int[p];
       
        for(int i=2;i<p;i++){
            while(p%i == 0){
                p = p/i;
                count[i]++;
            }
        }
        if(p>1)
            count[p]++;
        
        for (int i = 0; i < x; i++)
        {
            if(count[i] >0 && count[i]%2==1)
                sum = sum*count[i];
        }
        return sum;
    }
    
    public static void main(String[] args)
    {
        int p = Function(26);
        System.out.println(p);
    }
    
    
}
