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
public class ch8Question8
{
    static int columnForRows[] = new int[8];
    private static boolean check(int row){
        for(int i=0;i<row;i++){
            int diff = Math.abs(columnForRows[i]-columnForRows[row]);
            if(diff == 0 || diff == row-i)
                return false;
        }
        return true;
    }
    
    private static void PrintBoard(){
        char[][] Board = new char[8][8];
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                Board[i][j] = 'X';
            }
        }
        
        for(int i=0;i<8;i++){
            Board[i][columnForRows[i]] = 'Q';
        }
        
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                System.out.print(Board[i][j]);
            }System.out.println("");
        }
        
    }
    
    private static void Queens(int row){
        if(row == 8){
            PrintBoard();
            return;
        }
            for(int i=0;i<8;i++){
                columnForRows[row] = i;
                if(check(row)){
                    Queens(row+1);
                }
            }
        
    }
    
    public static void main(String[] args)
    {
        Queens(0);
    }
    
}
