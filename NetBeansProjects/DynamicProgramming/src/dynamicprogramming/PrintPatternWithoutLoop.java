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
public class PrintPatternWithoutLoop
{
    private static void Function(int x,int y,int flag){
        System.out.print(y+" ");
        if(x == y && flag == 1){
            
            return;
        }
        if(flag == 0){
            if(y <= 0){
                Function(x,y+5,1);
            }else
                Function(x,y-5,0);
        }else{
            Function(x,y+5,1);
        }
    }
    public static void main(String[] args)
    {
        Function(10,10,0);
    }
}
