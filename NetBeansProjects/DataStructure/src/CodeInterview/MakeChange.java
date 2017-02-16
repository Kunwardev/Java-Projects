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
public class MakeChange
{
    static int change[] = new int[]{1,5,10,25};
    private static int makeChange(int n){
        int counts[][] = new int[n+1][4];
        for(int i=0;i<4;i++){
            counts[0][i] = 1;
        }
        int x=0,y=0;
        for(int i=1;i<n+1;i++){
            for(int j=0;j<4;j++){
                x = (i-change[j] >= 0)?counts[i-change[j]][j] : 0;
                y = (j >=1) ? counts[i][j-1]:0;
                counts[i][j] = x+y;
            }
        }
        int ans = counts[n][3];
        return ans;
    }
    
    public static void main(String[] args)
    {
        int n = 10;
        System.out.println(makeChange(n));
    }
    
}
