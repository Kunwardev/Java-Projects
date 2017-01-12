/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree.BinaryTree;

/**
 *
 * @author Kunwar
 */
public class TrEe
{
    int data;
    TrEe left;
    TrEe right;
    
    TrEe(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
    TrEe(){
        this.left = null;
        this.right = null;
    }
    
}
