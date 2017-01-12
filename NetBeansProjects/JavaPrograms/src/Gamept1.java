import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Gamept1 implements Runnable
{
     SandL g1 = new SandL();
    Random dice1 = new Random();
    int Num1;
    int Sum1 = 0;
    public String name()throws IOException
    {
        SandL g1 = new SandL();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of Player 1 : ");
        g1.P1 = br.readLine();
        System.out.println("Hello "+g1.P1);
        System.out.println();
        return g1.P1;
    }

    
    public void Initial()
    {
        Num1 = 1 + dice1.nextInt(6);
        System.out.println("You got "+Num1+" on your Dice");
        System.out.println();
    }
    
    public void SecondStep(int y)
    {
        Gamept1 o1 = new Gamept1();
        int a = 1+dice1.nextInt(6);
        System.out.println("You got "+a+" on your Dice ");
        Sum1 = Sum1+a;
        if(Sum1 > y)
        {
            Sum1 = Sum1-a;
        }
        System.out.println("You have moved to position "+Sum1);
        
    }
    
    public void Ladder(int x)
    {
        System.out.println("Congratulation You encountered a Ladder ");
        Sum1 = Sum1 + x;
        System.out.println("You have Flown to position "+Sum1);
    }
    
    public void Snake(int x)
    {
        System.out.println("Oh!! You encountered a SNAKE ");
        Sum1 = Sum1 - x;
        System.out.println("You have Slipped to position "+Sum1);
    }
    
   
    
    public static void main(String[] args)
    {
        Gamept1 ob = new Gamept1();
        
    }

    public void run() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
     while(Num1!=6)
     {
         System.out.println("Player 1's Turn");
         System.out.println("Roll Dice : ");
         br.readLine();
         Initial();
         SandL.flag=true;
     }
     while(Sum1!=100)
     {
         System.out.println("Player 1's Turn");
         SecondStep(100);
         if(Sum1==25)
         {
             Snake(6);
         }
         if(Sum1==30)
         {
             Ladder(8);
         }
     }
 }catch(Exception ex){}
    }
    
 
}
