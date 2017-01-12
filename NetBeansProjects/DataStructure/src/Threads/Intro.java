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
public class Intro implements Runnable
{
    private Thread t;
    private String threadName;
    
    Intro(String st){
        threadName = st;
        System.out.println("Creating "+st);
    }
    
  public void run()
    {
        System.out.println("Running "+threadName);
        try{
            for(int i=4;i>0;i--){
                System.out.println("Thread: " + threadName +", "+i);
                Thread.sleep(50);
            }
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
  
  public void start(){
      t = new Thread(this, threadName);
      t.start();
  }
  
    public static void main(String[] args)
    {
        Intro r1 = new Intro("One");
        Intro r2 = new Intro("Two");
        r1.start();
        r2.start();
    }
  
}
