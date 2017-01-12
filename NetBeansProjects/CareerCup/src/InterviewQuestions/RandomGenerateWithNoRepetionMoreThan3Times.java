/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions;
import java.util.Random;
/**
 *
 * @author Kunwar
 */
public class RandomGenerateWithNoRepetionMoreThan3Times
{
    static Random r = new Random();
    
    private static int check(int x,int y,int p){
        if(x == y && y == p)
            p = r.nextInt(4)+1;
        return p;
    }
    
    
    private static int[][] Function(int size){
        int arr[][] = new int[size][size];
        
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                int p = r.nextInt(4)+1;
                if(i>1 || j>1){
                    if(i>1){
                        int a = arr[i-1][j];
                        int b = arr[i-2][j];
                        p = check(a, b, p);
                    }if(j>1){
                        int a = arr[i][j-1];
                        int b = arr[i][j-2];
                        p = check(a, b, p);
                    }
                }
                arr[i][j] = p;
            }
        }
        
        return arr;
    }
    
    public static void main(String[] args)
    {
        
        int arr[][] = Function(8);
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println("");
        }
    }
    
}
