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
public class FloydTriangle
{
    private static void Function(int n){
        int j = 1;
        for(int i=1;i<=n;i++){
            for(int k = 1;k<=i;k++){
                System.out.print(j+" ");
                j++;
            }System.out.println("");
        }
    }
    
    public static void main(String[] args)
    {
        Function(5);
    }
    
}
