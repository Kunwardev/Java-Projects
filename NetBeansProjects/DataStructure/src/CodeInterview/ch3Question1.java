/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class ch3Question1
{
    static int _3stacks[];
    static int _pointer[];
    
    private static void defineStacks(int size){
        int s = 3*size;
        _3stacks = new int[s];
        _pointer = new int[3];
        _pointer[0] = 0;
        _pointer[1] = size;
        _pointer[2] = 2*size;
        Arrays.fill(_3stacks,-1);
    }
    
    private static void push(int _stackNumber, int data,int size){
        int index = _pointer[_stackNumber];
        if(index == (_stackNumber+1)*size){
            System.out.println("Stack OverFlow");
            return;
        }
        _3stacks[index] = data;
        _pointer[_stackNumber]++;
    }
    
    private static void pop(int _stackNumber,int size){
        int index = --_pointer[_stackNumber];
        if(index == (_stackNumber*size))
            System.out.println("Empty");
        _3stacks[index] = -1;
    }
    
    private static void peek(int _stackNumber){
        int index = _pointer[_stackNumber]-1;
        System.out.println(_3stacks[index]);
    }
    
    public static void main(String[] args)
    {
        defineStacks(2);
        push(0, 2, 2);
        push(1, 5, 2);
        push(2, 3, 2);
        push(0, 4, 2);
        push(1, 1, 2);
        push(2, 8, 2);
        peek(0);
        pop(0,2);
        peek(0);
        for(int i: _3stacks)
            System.out.print(i+" ");
    }
    
}
