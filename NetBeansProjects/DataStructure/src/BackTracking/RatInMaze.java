/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BackTracking;

/**
 *
 * @author Kunwar
 */
class Base{
    void Hi(){
        System.out.println("Hi B");
    } 
    protected Base clone(){
        return new Base();
    }
}

class Derived extends Base{
    void Hi(){
        System.out.println("Hi D");
    }
    
    protected Derived clone(){
        return new Derived();
    }
    
}


public class RatInMaze
{
    private static boolean isSafe(int x, int y, int[][] maze){
        return (x>=0&&y>=0&&x<maze.length&&y<maze[0].length&&maze[x][y] == 1);
    }
    
    private static void printPath(int[][] sol){
        for(int i=0;i<sol.length;i++){
            for(int j=0;j<sol[0].length;j++){
                System.out.print(sol[i][j]+" ");
            }System.out.println();
        }
    }
    
    private static boolean solve(int[][] maze){
        int[] xMove = new int[]{1,0,-1,0};
        int[] yMove = new int[]{0,1,0,-1};
        int[][] sol = new int[maze.length][maze[0].length];
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[0].length;j++)
                sol[i][j] = 0;
        }
        if(solveUtil( maze,  xMove, yMove, sol, 0, 0)){
            printPath(sol);
            return true;
        }else{
        System.out.println("Path does not exists");
        return false;
        }
    }
    
    private static boolean solveUtil(int[][] maze, int[] xMove, int[] yMove, int[][] sol, int x,int y){
        if(x == maze.length-1 && y == maze[0].length-1){
            sol[x][y] = 1;
            return true;
        }
        if(isSafe(x, y, maze)){
            sol[x][y] = 1;
            for(int i=0;i<xMove.length;i++){
                int next_x = x+xMove[i];
                int next_y = y+yMove[i];
                if(solveUtil(maze, xMove, yMove, sol, next_x, next_y)){
                    return true;
                }
            }
            sol[x][y] = 0;
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        int[][] maze = new int[][]{{1, 0, 0, 0},
                                    {1, 1, 0, 1},
                                    {0, 1, 0, 0},
                                    {1, 1, 1, 1}};
        solve(maze);
        
    }
    
}
