
package Algorithms;

public class RatInAMaze
{
    public static boolean solve(int mat[][])
    {
        int sol[][] = {{0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
        };
        int x=0,y=0;
        if(solveMaze(mat, x, y, sol) == false)
        {
            System.out.println("Solution does not exists");
            return false;
        }
        else
        {
            for(int i=0;i<4;i++)
            {
                for(int j=0;j<4;j++)
                {
                    System.out.print(sol[i][j]);
                }
                System.out.println("");
            }
        }
        return true;
    }
    
    public static boolean isSafe(int mat[][],int x,int y)
    {
        int n = mat.length;   
        if(x>=0 && y>=0 && x<n && y<n && mat[x][y] == 1)
            return true;
        return false;
    }
    public static boolean solveMaze(int mat[][],int x,int y,int sol[][])
    {
        int n = mat.length;   
        if(x == n-1 && y == n-1)
        {
            sol[x][y] = 1;
            return true;
        }
        if(isSafe(mat, x, y) == true)
        {
            sol[x][y] = 1;
            if(solveMaze(mat, x+1, y, sol))
                return true;
            if(solveMaze(mat, x, y+1, sol))
                return true;
            sol[x][y] = 0;
            return false;
        }
        return false;
    }
    
     public static void main(String args[])
    {      
        int maze[][] = 
            {
            {1, 1, 1, 1},
            {0, 0, 0, 1},
            {0, 1, 0, 1},
            {1, 1, 1, 1}
            };
        solve(maze);
    }
}
    
