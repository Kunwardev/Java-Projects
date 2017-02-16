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
class MultiThreads implements Runnable{

    public void run()
    {
        try{
            System.out.println("Thread -> "+ Thread.currentThread().getId());
        }catch(Exception e){
            
        }
    }
    
}

public class Implements
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            MultiThreads mt = new MultiThreads();
            mt.run();
        }
        Send("Hello");
        Send("World");
        Send("Succe");
        Send("ssful");
    }
    
    public static void Send(String msg){
        System.out.println(msg);
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            
        }
        System.out.println("Sent");
    }
    
}
