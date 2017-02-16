/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Threads;

/**
 *
 * @author Kunwar
 */
class MultiThread extends Thread{
    public void run(){
        try{
            System.out.println("Thread->"+Thread.currentThread().getId());
        }catch (Exception e){
            
        }   
    }
}

public class Extends 
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            MultiThread mt = new MultiThread();
            mt.start();
        }
    }
}
