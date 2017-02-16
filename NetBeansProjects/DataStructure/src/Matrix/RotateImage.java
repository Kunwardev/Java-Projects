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
public class RotateImage
{   
    private static char[][] Function(char[][] source){
        char[][] destination = new char[source[0].length][source.length];
        for(int r=0;r<source.length;r++){
            for(int c=0;c<source[0].length;c++){
                destination[c][source.length-r-1] = source[r][c];
            }
        }
        return destination;
    }
    
    public static void main(String[] args)  
    {
        char[][] source = new char[][]{{'*','*','*','^','*','*','*'},
                                       {'*','*','*','|','*','*','*'},
                                       {'*','*','*','|','*','*','*'},
                                       {'*','*','*','|','*','*','*'},
                                       {'*','*','*','|','*','*','*'}};
        char[][] dest = Function(source);
        for(int i=0;i<dest.length;i++){
            for(int j=0;j<dest[0].length;j++){
                System.out.print(dest[i][j]);
            }System.out.println("");
        }
    }
    
}
