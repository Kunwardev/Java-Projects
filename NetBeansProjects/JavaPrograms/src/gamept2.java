import java.util.Random;
import java.io.*;
import java.awt.*;

public class gamept2 extends Frame implements Runnable
{
    SandL g2 = new SandL();
    Random dice2 = new Random();
    int Num2;
    int Sum2 = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public String name()throws IOException
    {
         System.out.println("Enter the name of Player 2 : ");
        g2.P2 = br.readLine();
        System.out.println("Hello "+g2.P2);
        return g2.P2;
    }
    
    public void Initial()
    {
        Num2 = 1 + dice2.nextInt(6);
        System.out.println("You got "+Num2+" on your Dice");
        System.out.println();
    }
    
    public void SecondStep(int y)
    {
        gamept2 o2 = new gamept2();
        int a = 1+dice2.nextInt(6);
        System.out.println("You got "+a+" on your Dice ");
        Sum2 = Sum2+a;
        if(Sum2 > y)
        {
            Sum2 = Sum2-a;
        }
        System.out.println("You have moved to position "+Sum2);
        
    }
    
    public void Ladder(int x)
    {
        System.out.println("Congratulation You encountered a Ladder ");
        Sum2 = Sum2 + x;
        System.out.println("You have Flown to position "+Sum2);
    }
    
    public void Snake(int x)
    {
        System.out.println("Oh!! You encountered a SNAKE ");
        Sum2 = Sum2 - x;
        System.out.println("You have Slipped to position "+Sum2);
    }
    
   
 public void run()
 {
     try{
     while(Num2!=6)
     {
         System.out.println("Player 2's Turn");
         System.out.println("Roll Dice : ");
         br.readLine();
         Initial();
         SandL.flag = false;
     }
     while(Sum2!=100)
     {
         System.out.println("Player 2's Turn");
         Thread.sleep(5000);
         SecondStep(100);
         if(Sum2==25)
         {
             Snake(6);
         }
         if(Sum2==30)
         {
             Ladder(8);
         }
     }
 }catch(Exception ex){}
 }
}

