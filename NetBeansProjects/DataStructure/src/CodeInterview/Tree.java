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
public class Tree
{
    int data;
    Tree left;
    Tree right;
    
    Tree(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
    Tree(){
        this.right = null;
        this.left = null;
    }
    
}
