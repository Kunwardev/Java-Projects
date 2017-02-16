/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Matrix;

/**
 *
 * @author Kunwar
 */
public class MagicSquare
{
    static int[][] magicSquare;
    private static void magics(int n){
        magicSquare = new int[n][n];
        int i = n/2;
        int j = n-1;
        for(int num = 1;num<=n*n;){
            if(i==-1 && j==n){
                j = n-2;
                i=0;
            }else{
                if(j==n)
                    j=0;
                if(i<0)
                    i=n-1;
            }
            if(magicSquare[i][j] != 0){
                j-=2;
                i++;
                continue;
            }else{
                magicSquare[i][j] = num++;
            }
            j++;i--;
        }
        for(int k=0;k<n;k++){
            for(int l=0;l<n;l++)
                System.out.print(magicSquare[k][l]+" ");
            System.out.println();
        }
    }
    
    public static void main(String[] args)
    {
        magics(5);
    }
    
}
