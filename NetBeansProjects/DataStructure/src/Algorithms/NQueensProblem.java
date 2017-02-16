/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

/**
 *
 * @author Kunwar
 */
public class NQueensProblem
{
    class Position{
        int col;
        int row;
        Position(int row,int col){
            this.row = row;
            this.col = col;
        }
    }
    
    public boolean solved(int n,int row,Position[] p){
        if(n == row)
            return true;
        int col;
        for(col = 0;col<n;col++){
            boolean foundSafe = true;
            for(int queen =0;queen<row;queen++){
                if(p[queen].col == col ||p[queen].row == row || p[queen].col-p[queen].row == col-row||p[queen].row+p[queen].col==col+row)
                    foundSafe = false;
                    break;
        }
            if(foundSafe){
                p[row] = new Position(row,col);
                if(solved(n, row+1, p))
                    return true;
            }
    }
        return false;
}
    public Position[] solveSolution(int n){
        Position p[] = new Position[n];
        boolean hasSolution = solved(n, 0, p);
        if(hasSolution)
            return p;
        else
            return new Position[0];
    }
    
    public static void main(String[] args)
    {
        NQueensProblem nqp = new NQueensProblem();
        Position[] p = nqp.solveSolution(4);
        for(int i=0;i<4;i++){
            System.out.println(p[i].row+" "+p[i].col);
    }
    
}
